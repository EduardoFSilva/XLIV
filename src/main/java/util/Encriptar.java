package util;


import java.security.MessageDigest;

public class Encriptar {

public static String toMD5(String original){
    MessageDigest algorithm;
    String senha ="";
        try {
            
            algorithm = MessageDigest.getInstance("MD5");

        byte messageDigest[] = algorithm.digest(original.getBytes("UTF-8"));

        StringBuilder hexString = new StringBuilder();
        for (byte b : messageDigest) {
            hexString.append(String.format("%02X", 0xFF & b));
        }
        senha = hexString.toString().toLowerCase();

            } catch (Exception ex) {
        }
        return senha;
}
public static String toSHA256(String original){
    MessageDigest algorithm;
    String senha ="";
        try {
            
            algorithm = MessageDigest.getInstance("SHA-256");

        byte messageDigest[] = algorithm.digest(original.getBytes("UTF-8"));

        StringBuilder hexString = new StringBuilder();
        for (byte b : messageDigest) {
            hexString.append(String.format("%02X", 0xFF & b));
        }
        senha = hexString.toString().toLowerCase();

            } catch (Exception ex) {
        }
        return senha;
} 

    public Encriptar() {
    }

}
