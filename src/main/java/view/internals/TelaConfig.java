/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.internals;

import javax.swing.JOptionPane;
import model.bean.ConfigBEAN;
import util.ConfigFileFactory;

/**
 *
 * @author Usuario
 */
public class TelaConfig extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaConfig
     */
    public TelaConfig() {
        initComponents();
        ConfigBEAN cb = new ConfigFileFactory().readFile();
        writeOptions(cb.getOptions());
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
        jPanel2 = new javax.swing.JPanel();
        chbDownloadIndex = new javax.swing.JCheckBox();
        chbSaveLogin = new javax.swing.JCheckBox();
        chbDashboard = new javax.swing.JCheckBox();
        chbBypassDialog = new javax.swing.JCheckBox();
        chbAutoLogin = new javax.swing.JCheckBox();
        chbDarkMode = new javax.swing.JCheckBox();
        chbSysTray = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setIconifiable(true);
        setTitle("Configurações Gerais");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.darkGray));

        chbDownloadIndex.setBackground(new java.awt.Color(0, 0, 0));
        chbDownloadIndex.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        chbDownloadIndex.setForeground(new java.awt.Color(255, 255, 255));
        chbDownloadIndex.setSelected(true);
        chbDownloadIndex.setText("Baixar Indices Ao Iniciar");

        chbSaveLogin.setBackground(new java.awt.Color(0, 0, 0));
        chbSaveLogin.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        chbSaveLogin.setForeground(new java.awt.Color(255, 255, 255));
        chbSaveLogin.setText("Salvar Ultimo Login");
        chbSaveLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbSaveLoginActionPerformed(evt);
            }
        });

        chbDashboard.setBackground(new java.awt.Color(0, 0, 0));
        chbDashboard.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        chbDashboard.setForeground(new java.awt.Color(255, 255, 255));
        chbDashboard.setSelected(true);
        chbDashboard.setText("Dashboard Em Fullscreen");

        chbBypassDialog.setBackground(new java.awt.Color(0, 0, 0));
        chbBypassDialog.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        chbBypassDialog.setForeground(new java.awt.Color(255, 255, 255));
        chbBypassDialog.setText("Ignorar Dialog Box");

        chbAutoLogin.setBackground(new java.awt.Color(0, 0, 0));
        chbAutoLogin.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        chbAutoLogin.setForeground(new java.awt.Color(255, 255, 255));
        chbAutoLogin.setText("Login Automático");
        chbAutoLogin.setToolTipText("Salvar Último Login Precisa Estar Marcado");
        chbAutoLogin.setEnabled(false);

        chbDarkMode.setBackground(new java.awt.Color(0, 0, 0));
        chbDarkMode.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        chbDarkMode.setForeground(new java.awt.Color(255, 255, 255));
        chbDarkMode.setSelected(true);
        chbDarkMode.setText("Dark Mode");
        chbDarkMode.setToolTipText("Quem Usa Light Mode Hoje Em Dia");
        chbDarkMode.setEnabled(false);

        chbSysTray.setBackground(new java.awt.Color(0, 0, 0));
        chbSysTray.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        chbSysTray.setForeground(new java.awt.Color(255, 255, 255));
        chbSysTray.setSelected(true);
        chbSysTray.setText("Usar Icone De Bandeja");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Opções");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chbSysTray)
                    .addComponent(chbBypassDialog)
                    .addComponent(chbDownloadIndex)
                    .addComponent(chbAutoLogin)
                    .addComponent(chbSaveLogin)
                    .addComponent(chbDarkMode)
                    .addComponent(chbDashboard)
                    .addComponent(jLabel1))
                .addContainerGap(256, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbDarkMode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbSaveLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbAutoLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbDownloadIndex)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbBypassDialog)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbSysTray)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbDashboard)
                .addContainerGap())
        );

        btnSalvar.setBackground(new java.awt.Color(0, 0, 0));
        btnSalvar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalvar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalvar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chbSaveLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbSaveLoginActionPerformed
        if (chbSaveLogin.isSelected()) {
            chbAutoLogin.setEnabled(true);
            chbAutoLogin.setToolTipText("");
            chbAutoLogin.setSelected(true);
        } else {
            chbAutoLogin.setEnabled(false);
            chbAutoLogin.setToolTipText(null);
            chbAutoLogin.setSelected(false);
        }
    }//GEN-LAST:event_chbSaveLoginActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        ConfigBEAN cb = new ConfigFileFactory().readFile();
        cb.setOptions(readOptions());
        new ConfigFileFactory().writeFile(cb);
        this.setVisible(false);
        getDesktopPane().repaint();
        getDesktopPane().remove(this);
        dispose();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        boolean sair = false;
        if (!chbBypassDialog.isSelected()) {
            int opc = JOptionPane.showConfirmDialog(getDesktopPane(), "Deseja Salvar Configurações ?", "Salvar", JOptionPane.YES_NO_CANCEL_OPTION);
            switch (opc) {
                case JOptionPane.YES_OPTION:
                    ConfigFileFactory cff = new ConfigFileFactory();
                    ConfigBEAN cb = cff.readFile();
                    cb.setOptions(readOptions());
                    cff.writeFile(cb);
                    sair = true;
                    break;
                case JOptionPane.NO_OPTION:
                    sair = true;
                    break;
            }
        } else {
            sair = true;
        }
        if (sair) {
            this.setVisible(false);
            getDesktopPane().repaint();
            getDesktopPane().remove(this);
            dispose();
        }
    }//GEN-LAST:event_formInternalFrameClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox chbAutoLogin;
    private javax.swing.JCheckBox chbBypassDialog;
    private javax.swing.JCheckBox chbDarkMode;
    private javax.swing.JCheckBox chbDashboard;
    private javax.swing.JCheckBox chbDownloadIndex;
    private javax.swing.JCheckBox chbSaveLogin;
    private javax.swing.JCheckBox chbSysTray;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    private boolean[] readOptions() {
        boolean b[] = new boolean[7];
        b[0] = chbDarkMode.isSelected();
        b[1] = chbSaveLogin.isSelected();
        b[2] = chbAutoLogin.isSelected();
        b[3] = chbDownloadIndex.isSelected();
        b[4] = chbBypassDialog.isSelected();
        b[5] = chbSysTray.isSelected();
        b[6] = chbDashboard.isSelected();
        return b;
    }

    private void writeOptions(boolean b[]) {
        chbDarkMode.setSelected(b[0]);
        chbSaveLogin.setSelected(b[1]);
        chbAutoLogin.setSelected(b[2]);
        chbDownloadIndex.setSelected(b[3]);
        chbBypassDialog.setSelected(b[4]);
        chbSysTray.setSelected(b[5]);
        chbDashboard.setSelected(b[6]);
    }
}
