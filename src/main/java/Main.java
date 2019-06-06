
import java.io.File;
import javax.swing.UIManager;
import util.ConfigFileFactory;
import view.FirstStartConfig;
import view.SplashScreen;

public class Main {

    public Main(String[] args) {
        if (new File(ConfigFileFactory.FILE_PATH).exists()) {
            System.out.println("[XLIV-INFO] config.bin encontrado. Iniciando Splash...");
            try {
                UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            } catch (Exception ex) {
            }
            System.out.println("[XLIV-INFO] Carregando Interface Em Modo Metal");
            new SplashScreen().setVisible(true);
            System.out.println("[XLIV-INFO] Splash Carregada");

        } else {
            System.out.println("[XLIV-INFO] config.bin não encontrado. Carregando First Start...");
            try {
                UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
                System.out.println("[XLIV-INFO] Carregando Interface Em Modo Nimbus");
            } catch (Exception ex) {
                System.out.println("[XLIV-INFO] Carregando Interface Em Modo Metal");
            }
            new FirstStartConfig().setVisible(true);
            System.out.println("[XLIV-INFO] Interface Carregada");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("[XLIV-INFO] Aguarde... Iniciando Sistema");
        System.out.println("[XLIV-INFO] Procurando Por config.bin...");
        new Main(args);
    }

}
