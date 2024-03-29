/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.UserCONTROL;
import javax.swing.JOptionPane;
import model.bean.ConfigBEAN;
import model.bean.UserBEAN;
import util.ConfigFileFactory;
import util.Encriptar;

/**
 *
 * @author Usuario
 */
public class LoginScreen extends javax.swing.JFrame {

    private UserBEAN savedUser = null;

    /**
     * Creates new form LoginScreen
     */
    public LoginScreen() {
        initComponents();
    }

    public LoginScreen(int opr) {
        initComponents();
        ConfigBEAN cb = new ConfigFileFactory().readFile();
        switch (opr) {
            case 0:
                btnLogin.setEnabled(true);
                tfPass.setEnabled(true);
                tfUser.setEnabled(true);
                setVisible(true);
                break;
            case 1:
                savedUser = cb.getSavedUser();
                btnLoginSaved.setEnabled(true);
                btnClear.setEnabled(true);
                tfUser.setToolTipText("Apague Os Dados De Login Para Desbloquear");
                tfPass.setToolTipText("Apague Os Dados De Login Para Desbloquear");
                chbSaveLogin.setSelected(true);
                setVisible(true);
                break;
            case 2:
                autoLogin(cb.getSavedUser());
                break;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfUser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfPass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnLoginSaved = new javax.swing.JButton();
        chbSaveLogin = new javax.swing.JCheckBox();
        chbAutoLogin = new javax.swing.JCheckBox();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        tfUser.setBackground(new java.awt.Color(51, 51, 51));
        tfUser.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        tfUser.setForeground(new java.awt.Color(255, 255, 255));
        tfUser.setEnabled(false);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nickname or Email");

        tfPass.setBackground(new java.awt.Color(51, 51, 51));
        tfPass.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        tfPass.setForeground(new java.awt.Color(255, 255, 255));
        tfPass.setEnabled(false);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");

        btnLogin.setBackground(new java.awt.Color(0, 0, 0));
        btnLogin.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setEnabled(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnLoginSaved.setBackground(new java.awt.Color(0, 0, 0));
        btnLoginSaved.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        btnLoginSaved.setForeground(new java.awt.Color(255, 255, 255));
        btnLoginSaved.setText("Login From Saved");
        btnLoginSaved.setEnabled(false);
        btnLoginSaved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginSavedActionPerformed(evt);
            }
        });

        chbSaveLogin.setBackground(new java.awt.Color(0, 0, 0));
        chbSaveLogin.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        chbSaveLogin.setForeground(new java.awt.Color(255, 255, 255));
        chbSaveLogin.setText("Salvar Login");
        chbSaveLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbSaveLoginActionPerformed(evt);
            }
        });

        chbAutoLogin.setBackground(new java.awt.Color(0, 0, 0));
        chbAutoLogin.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        chbAutoLogin.setForeground(new java.awt.Color(255, 255, 255));
        chbAutoLogin.setText("Auto-Login");
        chbAutoLogin.setEnabled(false);
        chbAutoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbAutoLoginActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(0, 0, 0));
        btnClear.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear Saved");
        btnClear.setEnabled(false);
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLoginSaved, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfPass)
                    .addComponent(tfUser)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chbSaveLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chbAutoLogin))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLoginSaved)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbSaveLogin)
                    .addComponent(chbAutoLogin))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        ConfigBEAN cb = new ConfigFileFactory().readFile();
        boolean b[] = cb.getOptions();
        b[1] = chbSaveLogin.isSelected();
        b[2] = chbAutoLogin.isSelected();
        int i = new UserCONTROL().authenticate(tfUser.getText(), Encriptar.toMD5(new String(tfPass.getPassword())));

        switch (i) {
            case -1:
                //Não Existe
                System.out.println("[XLIV-ERROR] Autenticação Manual Falhou");
                System.out.println("[XLIV-ERROR] Dados Inconsistentes");
                JOptionPane.showMessageDialog(this, "Usuario Não Encontrado", "Erro", JOptionPane.ERROR_MESSAGE);
                break;
            case 0:

                System.out.println("[XLIV-ERROR] Autenticação Manual Falhou");
                System.out.println("[XLIV-ERROR] Senha Incorreta");
                JOptionPane.showMessageDialog(this, "Senha Incorreta", "Erro", JOptionPane.ERROR_MESSAGE);
                //Existe, Mas Incorreto
                break;
            case 1:
                cb.setSavedUser(new UserCONTROL().getUserByValidator(tfUser.getText()));
                new ConfigFileFactory().writeFile(cb);
                System.out.println("[XLIV-INFO] Autenticação Manual Passou");
                System.out.println("[XLIV-INFO] Iniciando Dashboard Em Modo Nimbus");
                setVisible(false);
                try {
                    Thread.sleep(1000);
                } catch (Exception ex) {
                }
                new TelaDesktop().setVisible(true);
                dispose();
                //Correto
                break;
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void chbSaveLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbSaveLoginActionPerformed
        boolean b = chbSaveLogin.isSelected();
        chbAutoLogin.setSelected(b);
        chbAutoLogin.setEnabled(b);
    }//GEN-LAST:event_chbSaveLoginActionPerformed

    private void chbAutoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbAutoLoginActionPerformed

    }//GEN-LAST:event_chbAutoLoginActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        btnLoginSaved.setEnabled(false);
        btnLogin.setEnabled(true);
        btnClear.setEnabled(false);
        tfPass.setToolTipText(null);
        tfUser.setToolTipText(null);
        tfPass.setEnabled(true);
        tfUser.setEnabled(true);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnLoginSavedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginSavedActionPerformed
        ConfigBEAN cb = new ConfigFileFactory().readFile();
        UserBEAN ub = cb.getSavedUser();
        boolean b[] = cb.getOptions();
        b[1] = chbSaveLogin.isSelected();
        b[2] = chbAutoLogin.isSelected();
        int i = new UserCONTROL().authenticate(ub.getEmail(), ub.getPassword());

        switch (i) {
            case -1:
                //Não Existe
                System.out.println("[XLIV-ERROR] Autenticação Semi-Automática Falhou");
                System.out.println("[XLIV-ERROR] Dados Inconsistentes");
                JOptionPane.showMessageDialog(this, "Usuario Não Encontrado", "Erro", JOptionPane.ERROR_MESSAGE);
                break;
            case 0:

                System.out.println("[XLIV-ERROR] Autenticação Semi-Automática Falhou");
                System.out.println("[XLIV-ERROR] Senha Incorreta");
                JOptionPane.showMessageDialog(this, "Senha Incorreta", "Erro", JOptionPane.ERROR_MESSAGE);
                //Existe, Mas Incorreto
                break;
            case 1:
                cb.setSavedUser(new UserCONTROL().getUserByValidator(tfUser.getText()));
                new ConfigFileFactory().writeFile(cb);
                System.out.println("[XLIV-INFO] Autenticação Semi-Automática Passou");
                System.out.println("[XLIV-INFO] Iniciando Dashboard Em Modo Nimbus");
                setVisible(false);
                try {
                    Thread.sleep(1000);
                } catch (Exception ex) {
                }
                new TelaDesktop().setVisible(true);
                dispose();
                //Correto
                break;
        }
    }//GEN-LAST:event_btnLoginSavedActionPerformed

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
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLoginSaved;
    private javax.swing.JCheckBox chbAutoLogin;
    private javax.swing.JCheckBox chbSaveLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField tfPass;
    private javax.swing.JTextField tfUser;
    // End of variables declaration//GEN-END:variables

    private void autoLogin(UserBEAN ub) {
        int val = new UserCONTROL().authenticate(ub.getEmail(), ub.getPassword());
        switch (val) {
            case 1:
                System.out.println("[XLIV-INFO] Autenticação Automatica Passou");
                System.out.println("[XLIV-INFO] Iniciando Dashboard Em Modo Nimbus");
                try {
                    Thread.sleep(1000);
                } catch (Exception ex) {
                }
                new TelaDesktop().setVisible(true);
                dispose();
                break;
            default:
                System.err.println("[XLIV-ERROR] Autenticação Automatica Falhou");
                System.out.println("[XLIV-INFO] Login Manual Requerido");
                btnLogin.setEnabled(true);
                tfPass.setEnabled(true);
                tfUser.setEnabled(true);
                setVisible(true);
                break;
        }
    }
}
