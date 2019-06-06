package util;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.bean.ConfigBEAN;
import model.db.ConnectionFactory;

public class InitHelper {

    public static final float DATABASE_VERSION = 1.0f;

    public static boolean isWritable() {
        File f = new File(ConfigFileFactory.PATH);
        return f.canWrite();
    }

    public static boolean hasDataFolder() {
        File f = new File(ConfigFileFactory.PATH + File.separator + "Data");
        return f.exists();
    }

    public static boolean createDataFolder() {
        File f = new File(ConfigFileFactory.PATH + File.separator + "Data");
        return f.mkdir();
    }

    public static boolean binFileExists() {
        File f = new File(ConfigFileFactory.FILE_PATH);
        return f.exists();
    }

    public static float fileVersionIsTheSame() {
        float version = new ConfigFileFactory().readFile().getVersion() - ConfigBEAN.VERSION;
        return version;
    }

    public static boolean databaseExists() throws Exception {
        String db = new ConfigFileFactory().readFile().getDatabaseType();
        if (db.equals("mysql")) {
            ResultSet rs = ConnectionFactory.getConnection().prepareCall("show databases").executeQuery();
            while (rs.next()) {
                if (rs.getString(1).equals(ConnectionFactory.DB_NAME)) {
                    return true;
                }
            }
        } else if (db.equals("sqlite")) {
            File f = new File(ConfigFileFactory.PATH + File.separator + ConnectionFactory.DB_NAME + ".db");
            return f.exists();
        }
        return false;
    }

    public static boolean generateDatabase() throws Exception {
        Connection conn = ConnectionFactory.getConnection();
        String db = new ConfigFileFactory().readFile().getDatabaseType();
        String sql = "";
        File f = null;
        Statement stmt = conn.createStatement();
        if (db.equals("mysql")) {
            System.out.println("[XLIV-INFO] Gerando Database Em Modo MySQL");
            return createMySQLDatabase(stmt);
        } else if (db.equals("sqlite")) {
            System.out.println("[XLIV-INFO] Gerando Database Em Modo SQLite");
            return createSQLiteDatabase(stmt);
        }
        return false;
    }

    private static boolean createMySQLDatabase(Statement st) {
        try {
            st.execute("create database xliv");
            st.execute("use xliv");
            st.execute("create table user(\n"
                    + "id int not null primary key auto_increment,\n"
                    + "name varchar(100) null,\n"
                    + "role varchar(10) null,\n"
                    + "email varchar(100) null,\n"
                    + "password varchar(50) null\n"
                    + ");");
            st.execute("create table properties(\n"
                    + "id int not null primary key,\n"
                    + "version varchar(10) null\n"
                    + ");");
            st.execute("insert into properties(id,version) values (1,'1.0');");
            st.close();
            return true;
        } catch (Exception ex) {

            return false;
        }
    }

    private static boolean createSQLiteDatabase(Statement st) {
        try {
            st.execute("create table user(\n"
                    + "id INTEGER PRIMARY KEY autoincrement,\n"
                    + "name varchar(100) null,\n"
                    + "role varchar(10) null,\n"
                    + "email varchar(100) null,\n"
                    + "password varchar(50) null\n"
                    + ");");
            st.execute("create table properties(\n"
                    + "id int not null primary key,\n"
                    + "version varchar(10) null\n"
                    + ");");
            st.execute("insert into properties(id,version) values (1,'1.0');");
            st.close();
            return true;
        } catch (Exception ex) {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            ex.printStackTrace(pw);
            JOptionPane.showMessageDialog(null, sw.toString());
            return false;
        }
    }

    public static float getDatabaseVersion() throws Exception {
        Connection c = ConnectionFactory.getConn();
        PreparedStatement ps = c.prepareStatement("select version from properties where id = 1");
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
        return Float.valueOf(rs.getString(1));
        }
        return DATABASE_VERSION;
    }

    public static void dropDatabase() throws Exception {
        Connection c = ConnectionFactory.getConn();
        String db = new ConfigFileFactory().readFile().getDatabaseType();
        if (db.equals("mysql")) {
            PreparedStatement ps = c.prepareStatement("drop database xliv;");
            ps.execute();
            ps.close();
        } else if (db.equals("sqlite")) {
            File f = new File(ConfigFileFactory.PATH + File.separator + ConnectionFactory.DB_NAME + ".db");
            f.delete();
        }
    }

    public static void deleteBinFile() {
        File f = new File(ConfigFileFactory.FILE_PATH);
        f.delete();
    }
}
