/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import java.awt.Color;

public class ConfigBEAN implements java.io.Serializable{

    private String databaseType;
    private String databaseDriver;
    private String[] dbData;
    private boolean options[];
    private Color colors[];
    private float version;
    private UserBEAN savedUser;
    private String wallpaperLocation;
    private String wallpaperFilePath;
    
    public static final float VERSION = 1.1f;
    public static final Color[] DARK_MODE_PALETTE = new Color[]{new Color(0xFFFFFF),new Color(0x000000),new Color(0,0,102),new Color(51,51,51)};
    public static final Color[] LIGHT_MODE_PALETTE = new Color[]{new Color(0x000000),new Color(0xFFFFFF),new Color(0,0,200),new Color(255,255,255)};

    public ConfigBEAN() {
    }
    
    /**
     * Iniciará O Objeto Com os valores padrão caso algo dê nulo
     * @return Objeto Bean
     */
    public ConfigBEAN initObject(){
    this.version = VERSION;
    this.databaseType = "mysql";
    this.databaseDriver="com.mysql.jdbc.Driver";
    this.dbData = new String[]{"root","root","127.0.0.1","3307"};
    this.options = new boolean[]{true,false,false,true,false,true,true};
    //FG, BG, Realce, Text BG;
    this.colors = new Color[]{new Color(0xFFFFFF),new Color(51, 51, 51),new Color(0,0,102),new Color(102,102,102)};
    this.savedUser = new UserBEAN().init();
    this.wallpaperFilePath = "XLIVLight3D.png";
    this.wallpaperLocation = "internal";
    return this;
    }

    public String getDatabaseType() {
        return databaseType;
    }

    public void setDatabaseType(String databaseType) {
        this.databaseType = databaseType;
    }

    public String getDatabaseDriver() {
        return databaseDriver;
    }

    public void setDatabaseDriver(String databaseDriver) {
        this.databaseDriver = databaseDriver;
    }

    public String[] getDbData() {
        return dbData;
    }

    public void setDbData(String[] dbData) {
        this.dbData = dbData;
    }

    public boolean[] getOptions() {
        return options;
    }

    public void setOptions(boolean[] options) {
        this.options = options;
    }

    public Color[] getColors() {
        return colors;
    }

    public void setColors(Color[] colors) {
        this.colors = colors;
    }

    public float getVersion() {
        return version;
    }

    public void setVersion(float version) {
        this.version = version;
    }

    public UserBEAN getSavedUser() {
        return savedUser;
    }

    public void setSavedUser(UserBEAN savedUser) {
        this.savedUser = savedUser;
    }

    public String getWallpaperLocation() {
        return wallpaperLocation;
    }

    public void setWallpaperLocation(String wallpaperLocation) {
        this.wallpaperLocation = wallpaperLocation;
    }

    public String getWallpaperFilePath() {
        return wallpaperFilePath;
    }

    public void setWallpaperFilePath(String wallpaperFilePath) {
        this.wallpaperFilePath = wallpaperFilePath;
    }

  
    
}
