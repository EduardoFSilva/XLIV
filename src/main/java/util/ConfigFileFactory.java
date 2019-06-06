package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import model.bean.ConfigBEAN;

public class ConfigFileFactory {

    public static final String PATH = new File("").getAbsolutePath(); //Caminho Relativo
    public static final String FILE_PATH = PATH + File.separator + "config.bin"; // Caminho Para  o Arquivo Somado Ao Caminho Principal

    public ConfigBEAN readFile() {
        try {
            File f = new File(FILE_PATH);
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object o = ois.readObject();
            if(o == null){
            return new ConfigBEAN().initObject();
            }else{
                return (ConfigBEAN)o;
            }
        } catch (Exception ex) {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            ex.printStackTrace(pw);
            System.err.println("[ERROR-FILE] Um Erro Ocorreu!\n"+sw.toString());
            return new ConfigBEAN().initObject();
        }
    }
    
     public void writeFile(ConfigBEAN c) {
        try {
            File f = new File(FILE_PATH);
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            if(c == null){
                throw new NullPointerException("Parâmetro Nao Pode Ser Nulo >:(");
            }else{
                oos.writeObject(c);
            }
            oos.close();
            fos.close();
        } catch (Exception ex) {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            ex.printStackTrace(pw);
            System.err.println("[ERROR-FILE]Um Erro Ocorreu!\n"+sw.toString());
        }
    }
    
}
