/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Controller.ControllerRegistro;
import java.lang.ModuleLayer.Controller;
import javax.swing.JOptionPane;


/**
 *
 * @author Usuario
 */
public class RegistroLiv extends javax.swing.JFrame {
    
    int xMouse, yMouse;

    /**
     * Creates new form Registro
     */
    public RegistroLiv() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelOfBarra = new javax.swing.JPanel();
        nameOfPage = new javax.swing.JLabel();
        btnCloseRegis = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        nombre = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        PINSeguridad = new javax.swing.JLabel();
        btnRegistro = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        txtPassWord = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        txtPIN = new javax.swing.JTextField();
        Password2 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        txtPassWord2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelOfBarra.setBackground(new java.awt.Color(0, 0, 0));
        panelOfBarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelOfBarraMouseDragged(evt);
            }
        });
        panelOfBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelOfBarraMousePressed(evt);
            }
        });
        panelOfBarra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameOfPage.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        nameOfPage.setForeground(new java.awt.Color(255, 255, 255));
        nameOfPage.setText("Liv - Registro");
        panelOfBarra.add(nameOfPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 0, 150, 31));

        btnCloseRegis.setBackground(new java.awt.Color(0, 0, 0));
        btnCloseRegis.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCloseRegis.setForeground(new java.awt.Color(255, 0, 51));
        btnCloseRegis.setText("X");
        btnCloseRegis.setBorderPainted(false);
        btnCloseRegis.setContentAreaFilled(false);
        btnCloseRegis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCloseRegis.setFocusPainted(false);
        btnCloseRegis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseRegisMouseClicked(evt);
            }
        });
        panelOfBarra.add(btnCloseRegis, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 0, 50, -1));

        getContentPane().add(panelOfBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Resources/imageLogin.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-310, 30, 480, 350));

        jPanel1.setBackground(new java.awt.Color(236, 235, 235));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 0, 0));
        nombre.setText("Nombre");
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        Password.setBackground(new java.awt.Color(0, 0, 0));
        Password.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Password.setForeground(new java.awt.Color(0, 0, 0));
        Password.setText("Password");
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        PINSeguridad.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        PINSeguridad.setForeground(new java.awt.Color(0, 0, 0));
        PINSeguridad.setText("PIN de Seguridad");
        jPanel1.add(PINSeguridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        btnRegistro.setBackground(new java.awt.Color(0, 204, 0));
        btnRegistro.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistro.setText("Registro ⇥");
        btnRegistro.setBorderPainted(false);
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 100, 30));

        btnRegresar.setBackground(new java.awt.Color(255, 0, 0));
        btnRegresar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegresar.setText("⇤ Regresar");
        btnRegresar.setBorderPainted(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 110, 30));

        txtUsername.setBackground(new java.awt.Color(236, 235, 235));
        txtUsername.setForeground(new java.awt.Color(0, 0, 0));
        txtUsername.setBorder(null);
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 22, 220, 20));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 105, 220, 20));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 44, 220, 20));

        txtPassWord.setBackground(new java.awt.Color(236, 235, 235));
        txtPassWord.setForeground(new java.awt.Color(0, 0, 0));
        txtPassWord.setBorder(null);
        txtPassWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassWordActionPerformed(evt);
            }
        });
        jPanel1.add(txtPassWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 85, 220, 20));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 180, 20));

        txtPIN.setBackground(new java.awt.Color(236, 235, 235));
        txtPIN.setForeground(new java.awt.Color(0, 0, 0));
        txtPIN.setBorder(null);
        txtPIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPINActionPerformed(evt);
            }
        });
        jPanel1.add(txtPIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 190, 20));

        Password2.setBackground(new java.awt.Color(0, 0, 0));
        Password2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Password2.setForeground(new java.awt.Color(0, 0, 0));
        Password2.setText("Password");
        jPanel1.add(Password2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 220, 20));

        txtPassWord2.setBackground(new java.awt.Color(236, 235, 235));
        txtPassWord2.setForeground(new java.awt.Color(0, 0, 0));
        txtPassWord2.setBorder(null);
        txtPassWord2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassWord2ActionPerformed(evt);
            }
        });
        jPanel1.add(txtPassWord2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 220, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 340, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelOfBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOfBarraMousePressed
    // TODO add your handling code here:
    xMouse = evt.getX();
    yMouse = evt.getY();
    }//GEN-LAST:event_panelOfBarraMousePressed

    private void panelOfBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOfBarraMouseDragged
    // TODO add your handling code here:
    int x =  evt.getXOnScreen();
    int y = evt.getYOnScreen();
        
    this.setLocation(x - xMouse, y - yMouse);
        
    }//GEN-LAST:event_panelOfBarraMouseDragged

    private void btnCloseRegisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseRegisMouseClicked
    // TODO add your handling code here:
    System.exit(0);
    }//GEN-LAST:event_btnCloseRegisMouseClicked

    private void txtPassWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassWordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassWordActionPerformed

    private void txtPINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPINActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
    // TODO add your handling code here:
    LoginLiv loginLiv = new LoginLiv();
    loginLiv.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
    // TODO add your handling code here:
    String contra = txtPassWord.getText();
    String contra2 = txtPassWord2.getText();
    String pin = txtPIN.getText();
    
    if(pin.equals("123")){
        if(contra.equals(contra2)){
            ControllerRegistro.registar();
            LoginLiv loginLiv = new LoginLiv();
            loginLiv.setVisible(true);
            this.setVisible(false);
        }
        else{
            JOptionPane.showMessageDialog(null,
                        "Contrasenhas no coiciden",
                        "ERROR",
                        JOptionPane.ERROR_MESSAGE);
        }
    }
    else{
        JOptionPane.showMessageDialog(null,
                        "PIN DE SEGURIDAD INCORRECTO",
                        "ERROR",
                        JOptionPane.ERROR_MESSAGE);
    }
    
    
    
    
    
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void txtPassWord2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassWord2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassWord2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PINSeguridad;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel Password2;
    private javax.swing.JButton btnCloseRegis;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel nameOfPage;
    private javax.swing.JLabel nombre;
    private javax.swing.JPanel panelOfBarra;
    private javax.swing.JTextField txtPIN;
    public static javax.swing.JTextField txtPassWord;
    private javax.swing.JTextField txtPassWord2;
    public static javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
