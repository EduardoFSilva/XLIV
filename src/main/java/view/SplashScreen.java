/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.io.File;
import model.bean.ConfigBEAN;
import util.ConfigFileFactory;

public class SplashScreen extends javax.swing.JFrame {

    private Font nasalization;
    private Color BG, FG, realce, textBG;

    public SplashScreen() {
        initFonts();
        initColors();
        initComponents();
        tfInfo.setFont(nasalization);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnBg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbIndexFile = new javax.swing.JLabel();
        lbNetwork = new javax.swing.JLabel();
        lbGithub = new javax.swing.JLabel();
        lbLocalStorage = new javax.swing.JLabel();
        lbBinFile2 = new javax.swing.JLabel();
        lbDatabase = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfInfo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnBg.setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        lbIndexFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/32x/index-file-dark.png"))); // NOI18N

        lbNetwork.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/32x/network-dark.png"))); // NOI18N

        lbGithub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/32x/github-dark.png"))); // NOI18N

        lbLocalStorage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/32x/local-storage-dark.png"))); // NOI18N

        lbBinFile2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/32x/binary-file-dark.png"))); // NOI18N

        lbDatabase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/32x/database-dark.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addComponent(lbLocalStorage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbBinFile2)
                .addGap(6, 6, 6)
                .addComponent(lbNetwork)
                .addGap(6, 6, 6)
                .addComponent(lbGithub)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbIndexFile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDatabase)
                .addContainerGap(164, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDatabase)
                    .addComponent(lbBinFile2)
                    .addComponent(lbIndexFile)
                    .addComponent(lbLocalStorage)
                    .addComponent(lbGithub)
                    .addComponent(lbNetwork))
                .addContainerGap())
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/XLIVSys.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carregar.gif"))); // NOI18N

        tfInfo.setEditable(false);
        tfInfo.setBackground(new java.awt.Color(0, 0, 0));
        tfInfo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        tfInfo.setForeground(new java.awt.Color(70, 70, 255));
        tfInfo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfInfo.setText("Carregando...");
        tfInfo.setBorder(null);

        javax.swing.GroupLayout pnBgLayout = new javax.swing.GroupLayout(pnBg);
        pnBg.setLayout(pnBgLayout);
        pnBgLayout.setHorizontalGroup(
            pnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnBgLayout.createSequentialGroup()
                .addGroup(pnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tfInfo))
                    .addGroup(pnBgLayout.createSequentialGroup()
                        .addGroup(pnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnBgLayout.createSequentialGroup()
                                .addGap(197, 197, 197)
                                .addComponent(jLabel1))
                            .addGroup(pnBgLayout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnBgLayout.setVerticalGroup(
            pnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBgLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SplashScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbBinFile2;
    private javax.swing.JLabel lbDatabase;
    private javax.swing.JLabel lbGithub;
    private javax.swing.JLabel lbIndexFile;
    private javax.swing.JLabel lbLocalStorage;
    private javax.swing.JLabel lbNetwork;
    private javax.swing.JPanel pnBg;
    private javax.swing.JTextField tfInfo;
    // End of variables declaration//GEN-END:variables

    private void initColors() {
        ConfigBEAN cb = new ConfigFileFactory().readFile();
        Color[] paleta = cb.getColors();
        if (cb.getOptions()[0]) {
            paleta = ConfigBEAN.DARK_MODE_PALETTE;
        } else {
            paleta = ConfigBEAN.LIGHT_MODE_PALETTE;
        }
        FG = paleta[0];
        BG = paleta[1];
        realce = paleta[2];
        textBG = paleta[3];
    }

    private void initFonts() {
        try {
            nasalization = Font.createFont(Font.TRUETYPE_FONT, new File(getClass().getResource("/fonts/nasalization-rg.ttf").toURI())).deriveFont(16f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(nasalization);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}