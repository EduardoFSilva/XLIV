/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.net.URL;
import java.net.URLConnection;

public class ConnectionVerifyer {

    public boolean isRearchble(String url) {
        boolean flag = false;
        try {
            URL site = new URL(url);
            URLConnection connection = site.openConnection();
            connection.connect();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isConnected() {
       return (this.isRearchble("https://www.google.com/")||this.isRearchble("https://www.archlinux.org/")||this.isRearchble("https://github.com"));
    }
}
