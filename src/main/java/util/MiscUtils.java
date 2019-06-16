package util;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import model.bean.ConfigBEAN;

public class MiscUtils {

    public Image getWallpaperImage() {
        ConfigBEAN cb = new ConfigFileFactory().readFile();
        String loc = cb.getWallpaperLocation();
        Image img = new BufferedImage(1920, 1080, BufferedImage.TYPE_INT_RGB);
        if (loc.equals("internal")) {
            internal:
            try {
                URL url = getClass().getResource("/images/wallpapers/" + cb.getWallpaperFilePath());
                if (url == null) {
                    img = new BufferedImage(1920, 1080, BufferedImage.TYPE_INT_RGB);
                } else {
                    img = ImageIO.read(url);
                }
            } catch (IOException ex) {
            }
        } else if (loc.equals("data-folder")) {
            File f = new File(ConfigFileFactory.PATH + File.separator + "Data" + File.separator + cb.getWallpaperLocation());
            if (f.exists()) {
                try {
                    img = ImageIO.read(f.getAbsoluteFile());
                } catch (IOException ex) {
                }
            } else {
                URL url = getClass().getResource("/images/wallpapers/XLIVDark3D.png");
                if (url == null) {
                    img = new BufferedImage(1920, 1080, BufferedImage.TYPE_INT_RGB);
                } else {
                    try {
                        img = ImageIO.read(url);
                    } catch (IOException ex) {
                    }
                }
            }
        } else if (loc.equals("external")) {
            File f = new File(cb.getWallpaperFilePath());
            if (f.exists()) {
                try {
                    img = ImageIO.read(f.getAbsoluteFile());
                } catch (IOException ex) {
                }
            } else {
                URL url = getClass().getResource("/images/wallpapers/XLIVDark3D.png");
                if (url == null) {
                    img = new BufferedImage(1920, 1080, BufferedImage.TYPE_INT_RGB);
                } else {
                    try {
                        img = ImageIO.read(url);
                    } catch (IOException ex) {
                    }
                }
            }
        }
        return img;
    }

}
