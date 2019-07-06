package util;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import model.bean.ConfigBEAN;

public class ImageUtils {
    
    public static final String DATA_WALLPAPER_FOLDER = "Data" + File.separator + "Wallpaper";
    
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
            File f = new File(ConfigFileFactory.PATH + File.separator + DATA_WALLPAPER_FOLDER + File.separator + cb.getWallpaperFilePath());
            if (f.exists()) {
                try {
                    img = ImageIO.read(f.getAbsoluteFile());
                } catch (IOException ex) {
                }
            } else {
                URL url = getClass().getResource("/images/wallpapers/XLIVLight3D.png");
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
                URL url = getClass().getResource("/images/wallpapers/XLIVLight3D.png");
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
    
    public File[] listImagesFrom(String location, String path) throws IOException {
        String[] exts = {".bmp", ".png", ".jpg", ".gif", ".jfif"};
        File[] imgs = new File[0];
        if (location.equals("internal")) {
            File f = new File(getClass().getResource("/images/wallpapers/XLIVLight3D.png").getPath());
            imgs = new File[]{f};
        } else if (location.equals("data-folder")) {
            File f = new File(ConfigFileFactory.PATH + File.separator + "Data" + File.separator + "Wallpaper");
            imgs = f.listFiles();
        } else if (location.equals("external")) {
            File f = new File(path);
            imgs = f.listFiles();
        }
        ArrayList<File> arr = new ArrayList<>();
        for (File img : imgs) {
            for (String ext : exts) {
                if (img.getName().toLowerCase().endsWith(ext)) {
                    arr.add(img);
                }
            }
        }
        File[] filt = new File[arr.size()];
        for (int i = 0; i < filt.length; i++) {
            filt[i] = arr.get(i);
        }
        imgs = filt;
        return imgs;
    }
    
    public BufferedImage[] getImagesFrom(String location, String path) {
        File[] imgfiles = null;
        try {
            imgfiles = this.listImagesFrom(location, path);
        } catch (IOException ex) {
        }
        if (imgfiles == null) {
            return null;
        } else {
            BufferedImage[] img = new BufferedImage[imgfiles.length];
           if (location.equals("internal")) {
                try {
                    BufferedImage ima = ImageIO.read(getClass().getResource("/images/wallpapers/XLIVLight3D.png"));
                    img = new BufferedImage[]{ima};
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            } else {
                for (int i = 0; i < imgfiles.length; i++) {
                    try {
                        img[i] = ImageIO.read(imgfiles[i].getAbsoluteFile());
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
            return img;
        }
    }
    

}

