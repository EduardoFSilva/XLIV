package model.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import model.bean.ConfigBEAN;
import util.ConfigFileFactory;

public class ConnectionFactory {

    private static ConnectionFactory instance = new ConnectionFactory();
    private static ConfigBEAN cb;
    //Dados de Conexão SQLite

    public static String FILE_PATH, URL, DRIVER_CLASS, USER, PASSWORD;
    private static final String DB_NAME  = "esys";

    private ConnectionFactory() {
        cb = new ConfigFileFactory().readFile();
        define();
        try {

            Class.forName(DRIVER_CLASS);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private Connection createConnection() {
        String tipo = cb.getDatabaseType();
        Connection connection = null;
        try {
            if (tipo.equals("mysql")) {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);

            } else if (tipo.equals("sqlite")) {
                connection = DriverManager.getConnection(URL);
            }
            System.out.println("[" + tipo.toUpperCase() + "] Conectou!");
        } catch (SQLException e) {
            System.out.println("[ERROR-DATABASE]: Erro na conexão com o banco de dados");
        }
        return connection;
    }

    public static Connection getConnection() {
        return instance.createConnection();
    }

    public static void define() {
        String db = cb.getDatabaseType();
        String[] data = cb.getDbData();
        DRIVER_CLASS = cb.getDatabaseDriver();
        if (db.equals("mysql")) {
            URL = "jdbc:mysql:" + data[2] + ":" + data[3] + "/"+DB_NAME;
            PASSWORD = data[1];
            USER = data[0];
        } else if (db.equals("sqlite")) {
            URL = "jdbc:sqlite:"+DB_NAME+".db";
        }
    }

}
