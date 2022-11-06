/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Controller.ControllerInventario;

/**
 *
 * @author Usuario
 */
public class InventarioMenu extends javax.swing.JFrame {
    int xMouse, yMouse;

    /**
     * Creates new form Inventario
     */
    public InventarioMenu() {
        initComponents();
        ControllerInventario.llenarTabla(TablaInven);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBarra = new javax.swing.JPanel();
        btnExitInventario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        IDProducto = new javax.swing.JLabel();
        txtIDInven = new javax.swing.JTextField();
        Marca = new javax.swing.JLabel();
        txtYearInven = new javax.swing.JTextField();
        Year = new javax.swing.JLabel();
        txtMarcaInven = new javax.swing.JTextField();
        Tipo = new javax.swing.JLabel();
        txtTipoInven = new javax.swing.JTextField();
        Categoria = new javax.swing.JLabel();
        txtCategoriaInven = new javax.swing.JTextField();
        btnGuardarInven = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaInven = new javax.swing.JTable();
        btnActualizarInven = new javax.swing.JButton();
        btnConsultarInven = new javax.swing.JButton();
        btnEliminarInven = new javax.swing.JButton();
        imageLogoInven = new javax.swing.JLabel();
        btnRegresarInven = new javax.swing.JButton();
        Nombre = new javax.swing.JLabel();
        txtNombreInven = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        Year2 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        Categoria1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBarra.setBackground(new java.awt.Color(0, 0, 0));
        panelBarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelBarraMouseDragged(evt);
            }
        });
        panelBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelBarraMousePressed(evt);
            }
        });
        panelBarra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExitInventario.setBackground(new java.awt.Color(0, 0, 0));
        btnExitInventario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnExitInventario.setForeground(new java.awt.Color(255, 0, 0));
        btnExitInventario.setText("X");
        btnExitInventario.setBorderPainted(false);
        btnExitInventario.setContentAreaFilled(false);
        btnExitInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitInventarioActionPerformed(evt);
            }
        });
        panelBarra.add(btnExitInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 50, -1));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Liv - Inventario");
        panelBarra.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 0, 170, 31));

        getContentPane().add(panelBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, -1));

        jPanel2.setBackground(new java.awt.Color(236, 236, 236));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ingrese la información correspondiente");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 900, 10));

        IDProducto.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        IDProducto.setForeground(new java.awt.Color(0, 0, 0));
        IDProducto.setText("ID del producto");
        jPanel2.add(IDProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 50, -1, -1));

        txtIDInven.setBackground(new java.awt.Color(236, 236, 236));
        txtIDInven.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtIDInven.setCaretColor(new java.awt.Color(0, 0, 0));
        txtIDInven.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtIDInven.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        txtIDInven.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtIDInven, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 240, 30));

        Marca.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        Marca.setForeground(new java.awt.Color(0, 0, 0));
        Marca.setText("Marca");
        jPanel2.add(Marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, -1, -1));

        txtYearInven.setBackground(new java.awt.Color(236, 236, 236));
        txtYearInven.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtYearInven.setCaretColor(new java.awt.Color(0, 0, 0));
        txtYearInven.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtYearInven.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        txtYearInven.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtYearInven, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 240, 30));

        Year.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        Year.setForeground(new java.awt.Color(0, 0, 0));
        Year.setText("Cantidad");
        jPanel2.add(Year, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        txtMarcaInven.setBackground(new java.awt.Color(236, 236, 236));
        txtMarcaInven.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtMarcaInven.setCaretColor(new java.awt.Color(0, 0, 0));
        txtMarcaInven.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtMarcaInven.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        txtMarcaInven.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtMarcaInven, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 240, 30));

        Tipo.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        Tipo.setForeground(new java.awt.Color(0, 0, 0));
        Tipo.setText("Fabricación");
        jPanel2.add(Tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        txtTipoInven.setBackground(new java.awt.Color(236, 236, 236));
        txtTipoInven.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTipoInven.setCaretColor(new java.awt.Color(0, 0, 0));
        txtTipoInven.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTipoInven.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        txtTipoInven.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtTipoInven, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 240, 30));

        Categoria.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        Categoria.setForeground(new java.awt.Color(0, 0, 0));
        Categoria.setText("Descripcion");
        jPanel2.add(Categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));

        txtCategoriaInven.setBackground(new java.awt.Color(236, 236, 236));
        txtCategoriaInven.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCategoriaInven.setCaretColor(new java.awt.Color(0, 0, 0));
        txtCategoriaInven.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCategoriaInven.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        txtCategoriaInven.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtCategoriaInven, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 240, 30));

        btnGuardarInven.setBackground(new java.awt.Color(0, 204, 51));
        btnGuardarInven.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnGuardarInven.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardarInven.setText("Guardar");
        btnGuardarInven.setBorder(null);
        btnGuardarInven.setBorderPainted(false);
        btnGuardarInven.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarInven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarInvenActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardarInven, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 90, 100, 30));

        TablaInven.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaInven);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 760, 260));

        btnActualizarInven.setBackground(new java.awt.Color(0, 153, 204));
        btnActualizarInven.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnActualizarInven.setForeground(new java.awt.Color(0, 0, 0));
        btnActualizarInven.setText("Actualizar");
        btnActualizarInven.setBorder(null);
        btnActualizarInven.setBorderPainted(false);
        btnActualizarInven.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizarInven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarInvenActionPerformed(evt);
            }
        });
        jPanel2.add(btnActualizarInven, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 190, 100, 30));

        btnConsultarInven.setBackground(new java.awt.Color(255, 153, 51));
        btnConsultarInven.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnConsultarInven.setForeground(new java.awt.Color(0, 0, 0));
        btnConsultarInven.setText("Consultar");
        btnConsultarInven.setBorder(null);
        btnConsultarInven.setBorderPainted(false);
        btnConsultarInven.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarInven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarInvenActionPerformed(evt);
            }
        });
        jPanel2.add(btnConsultarInven, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 140, 100, 30));

        btnEliminarInven.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminarInven.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnEliminarInven.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminarInven.setText("Eliminar");
        btnEliminarInven.setBorder(null);
        btnEliminarInven.setBorderPainted(false);
        btnEliminarInven.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarInven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarInvenActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminarInven, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 240, 100, 30));

        imageLogoInven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Resources/logoFinal.png"))); // NOI18N
        jPanel2.add(imageLogoInven, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 350, 110, 100));

        btnRegresarInven.setBackground(new java.awt.Color(255, 255, 0));
        btnRegresarInven.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnRegresarInven.setForeground(new java.awt.Color(0, 0, 0));
        btnRegresarInven.setText("Regresar");
        btnRegresarInven.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnRegresarInven.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresarInven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarInvenActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegresarInven, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 470, 130, 20));

        Nombre.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        Nombre.setForeground(new java.awt.Color(0, 0, 0));
        Nombre.setText("Precio");
        jPanel2.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 50, -1, -1));

        txtNombreInven.setBackground(new java.awt.Color(236, 236, 236));
        txtNombreInven.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNombreInven.setCaretColor(new java.awt.Color(0, 0, 0));
        txtNombreInven.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNombreInven.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        txtNombreInven.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtNombreInven, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 240, 30));

        txtNombre.setBackground(new java.awt.Color(236, 236, 236));
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNombre.setCaretColor(new java.awt.Color(0, 0, 0));
        txtNombre.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNombre.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        txtNombre.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 180, 30));

        Year2.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        Year2.setForeground(new java.awt.Color(0, 0, 0));
        Year2.setText("Nombre");
        jPanel2.add(Year2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 100, 30));

        txtDescripcion.setBackground(new java.awt.Color(236, 236, 236));
        txtDescripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDescripcion.setCaretColor(new java.awt.Color(0, 0, 0));
        txtDescripcion.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtDescripcion.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        txtDescripcion.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 290, 30));

        Categoria1.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        Categoria1.setForeground(new java.awt.Color(0, 0, 0));
        Categoria1.setText("Lote");
        jPanel2.add(Categoria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 32, 930, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitInventarioActionPerformed
        // TODO add your handling code here:
        LoginLiv menu = new LoginLiv();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnExitInventarioActionPerformed

    private void btnRegresarInvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarInvenActionPerformed
    // TODO add your handling code here:
    MenuPrincipalLiv menu = new MenuPrincipalLiv();
    menu.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_btnRegresarInvenActionPerformed

    private void panelBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panelBarraMousePressed

    private void panelBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraMouseDragged
        // TODO add your handling code here:
        int x =  evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_panelBarraMouseDragged

    private void btnGuardarInvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarInvenActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(txtIDInven.getText());
        int precio = Integer.parseInt(txtNombreInven.getText());
        String marca = txtMarcaInven.getText();
        int cantidad = Integer.parseInt(txtYearInven.getText());
        String fabricacion = txtTipoInven.getText();
        String lote = txtCategoriaInven.getText();
        String nombre = txtNombre.getText();
        String desc = txtDescripcion.getText();
        ControllerInventario.guardar(nombre,precio,marca,cantidad,fabricacion,lote,desc);
    }//GEN-LAST:event_btnGuardarInvenActionPerformed

    private void btnConsultarInvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarInvenActionPerformed
        // TODO add your handling code here:
        ControllerInventario.consultar(TablaInven);
    }//GEN-LAST:event_btnConsultarInvenActionPerformed

    private void btnActualizarInvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarInvenActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(txtIDInven.getText());
        int precio = Integer.parseInt(txtNombreInven.getText());
        String marca = txtMarcaInven.getText();
        int cantidad = Integer.parseInt(txtYearInven.getText());
        String fabricacion = txtTipoInven.getText();
        String lote = txtCategoriaInven.getText();
        String nombre = txtNombre.getText();
        String desc = txtDescripcion.getText();
        ControllerInventario.actualizar(nombre,precio,marca,cantidad,fabricacion,lote,desc);
    }//GEN-LAST:event_btnActualizarInvenActionPerformed

    private void btnEliminarInvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarInvenActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(txtIDInven.getText());
        ControllerInventario.eliminar(id);
    }//GEN-LAST:event_btnEliminarInvenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Categoria;
    private javax.swing.JLabel Categoria1;
    private javax.swing.JLabel IDProducto;
    private javax.swing.JLabel Marca;
    private javax.swing.JLabel Nombre;
    public static javax.swing.JTable TablaInven;
    private javax.swing.JLabel Tipo;
    private javax.swing.JLabel Year;
    private javax.swing.JLabel Year2;
    private javax.swing.JButton btnActualizarInven;
    private javax.swing.JButton btnConsultarInven;
    private javax.swing.JButton btnEliminarInven;
    private javax.swing.JButton btnExitInventario;
    private javax.swing.JButton btnGuardarInven;
    private javax.swing.JButton btnRegresarInven;
    private javax.swing.JLabel imageLogoInven;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelBarra;
    public static javax.swing.JTextField txtCategoriaInven;
    public static javax.swing.JTextField txtDescripcion;
    public static javax.swing.JTextField txtIDInven;
    public static javax.swing.JTextField txtMarcaInven;
    public static javax.swing.JTextField txtNombre;
    public static javax.swing.JTextField txtNombreInven;
    public static javax.swing.JTextField txtTipoInven;
    public static javax.swing.JTextField txtYearInven;
    // End of variables declaration//GEN-END:variables
}
