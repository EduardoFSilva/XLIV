package util;

import control.UserCONTROL;
import java.util.ArrayList;
import javax.swing.UIManager;
import model.bean.ConfigBEAN;
import model.bean.UserBEAN;
import view.LoginScreen;
import view.UserCreatorScreen;

public class LoginMiddleware {

    public void login() {
        ConfigBEAN cb = new ConfigFileFactory().readFile();
        boolean opcs[] = cb.getOptions();
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            System.out.println("[XLIV-INFO] Carregando Interface Em Modo Nimbus");
        } catch (Exception ex) {
            System.out.println("[XLIV-INFO] Carregando Interface Em Modo Metal");
        }
        if (!adminUserExists()) {
            new UserCreatorScreen().setVisible(true);
        } else {
            if (opcs[1]) {
                if (opcs[2]) {
                    if (cb.getSavedUser().getId() != -1) {
                        new LoginScreen(2);
                    } else {
                        new LoginScreen(0);
                    }
                } else {
                    new LoginScreen(1);
                }
            } else {
                new LoginScreen(0);
            }
        }
    }

    private boolean adminUserExists() {
        UserCONTROL uc = new UserCONTROL();
        boolean b = false;
        ArrayList<UserBEAN> al = (ArrayList<UserBEAN>) uc.listarALL();
        if (al.isEmpty()) {
            b = false;
        } else {
            for (UserBEAN userBEAN : al) {
                if (userBEAN.getRole().equals("admin")) {
                    b = true;
                }
            }
        }
        return b;
    }
}
