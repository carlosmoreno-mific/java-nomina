/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import datos.Conexion;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tania
 */
public class ventanaEmpleados extends javax.swing.JFrame {

    DefaultTableModel dtm = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            //all cells false
            return false;
        }
    };

    int idSeleccionado = 0;

    /**
     * Creates new form ventanaEmpleados
     */
    public ventanaEmpleados() {
        initComponents();
        String[] tituloTabla = new String[]{"Id", "Número de cédula", "Nombre completo", "Sueldo base", "Correo electrónico"};
        dtm.setColumnIdentifiers(tituloTabla);

        tablaEmpleados.setModel(dtm);

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(DefaultTableCellRenderer.RIGHT);
        tablaEmpleados.getColumn("Sueldo base").setCellRenderer(rightRenderer);

        tablaEmpleados.getTableHeader().setFont(new Font("Arial", Font.BOLD, 15));

        try {
            cargarDatosEmpleados();
        } catch (Exception e) {
            System.out.println(e.toString());
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
        jSeparator4 = new javax.swing.JSeparator();
        txtNumeroCedula = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        txtNombreCompleto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtSueldoBase = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();
        panelTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(181, 121, 176));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 190, 31));

        txtNumeroCedula.setBackground(new java.awt.Color(181, 121, 176));
        txtNumeroCedula.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNumeroCedula.setForeground(new java.awt.Color(255, 255, 255));
        txtNumeroCedula.setBorder(null);
        jPanel1.add(txtNumeroCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 190, 29));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Número de cédula");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 190, 31));

        txtNombreCompleto.setBackground(new java.awt.Color(181, 121, 176));
        txtNombreCompleto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNombreCompleto.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreCompleto.setBorder(null);
        jPanel1.add(txtNombreCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 190, 29));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre completo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Sueldo base");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, -1, -1));

        txtSueldoBase.setBackground(new java.awt.Color(181, 121, 176));
        txtSueldoBase.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtSueldoBase.setForeground(new java.awt.Color(255, 255, 255));
        txtSueldoBase.setBorder(null);
        jPanel1.add(txtSueldoBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 190, 29));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 190, 31));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Correo electrónico");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 40, -1, -1));

        txtCorreo.setBackground(new java.awt.Color(181, 121, 176));
        txtCorreo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreo.setBorder(null);
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 60, 190, 29));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 90, 190, 31));

        jPanel3.setBackground(new java.awt.Color(123, 42, 116));
        jPanel3.setLayout(new java.awt.BorderLayout());

        btnGuardar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8_Save_32px.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGuardarMousePressed(evt);
            }
        });
        jPanel3.add(btnGuardar, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 20, 150, 60));

        jPanel5.setBackground(new java.awt.Color(123, 42, 116));
        jPanel5.setLayout(new java.awt.BorderLayout());

        btnCancelar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8_Cancel_32px.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCancelarMousePressed(evt);
            }
        });
        jPanel5.add(btnCancelar, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 100, 150, 60));

        jScrollPane1.setBorder(null);

        tablaEmpleados.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaEmpleados.setGridColor(new java.awt.Color(255, 255, 255));
        tablaEmpleados.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tablaEmpleados.setRowHeight(25);
        tablaEmpleados.setSelectionBackground(new java.awt.Color(181, 121, 176));
        tablaEmpleados.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaEmpleados.getTableHeader().setReorderingAllowed(false);
        tablaEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaEmpleados);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 1170, 300));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        panelTitulo.setBackground(new java.awt.Color(123, 42, 116));

        lblTitulo.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8_Employee_64px_1.png"))); // NOI18N
        lblTitulo.setText("Empleados");

        btnCerrarSesion.setFont(new java.awt.Font("Antipasto Pro ", 1, 12)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8_Back_To_32px.png"))); // NOI18N
        btnCerrarSesion.setToolTipText("Salir");
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 919, Short.MAX_VALUE)
                .addComponent(btnCerrarSesion)
                .addContainerGap())
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addGroup(panelTituloLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnCerrarSesion)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(panelTitulo, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(123, 42, 116));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Todos los derechos reservados ©");
        jPanel4.add(jLabel4);

        getContentPane().add(jPanel4, java.awt.BorderLayout.PAGE_END);

        setSize(new java.awt.Dimension(1296, 704));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void btnCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMousePressed

        limpiarCampos();

    }//GEN-LAST:event_btnCancelarMousePressed

    private void btnGuardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMousePressed

        String numeroCedula = txtNumeroCedula.getText();
        String nombreCompleto = txtNombreCompleto.getText();
        String sueldoBase = txtSueldoBase.getText();
        String correo = txtCorreo.getText();

        if (idSeleccionado == 0) {
            try {
                Statement statement = Conexion.getConnection().createStatement();
                statement.execute("INSERT INTO Empleados VALUES ('" + numeroCedula + "', '" + nombreCompleto + "', '" + Float.parseFloat(sueldoBase) + "', '" + correo + "')");
                limpiarCampos();
                cargarDatosEmpleados();
            } catch (Exception e) {
                System.out.println("Error al guardar " + e.toString());
            }
        } else {
            try {
                Statement statement = Conexion.getConnection().createStatement();
                statement.execute("UPDATE Empleados SET numeroCedula = '" + numeroCedula + "', nombreCompleto = '" + nombreCompleto + "', sueldoBase = '" + Float.parseFloat(sueldoBase) + "', correoElectronico = '" + correo + "' WHERE IdEmpleado = " + idSeleccionado);
                limpiarCampos();
                cargarDatosEmpleados();
            } catch (Exception e) {
                System.out.println("Error al actualizar " + e.toString());
            }
        }

    }//GEN-LAST:event_btnGuardarMousePressed

    private void tablaEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEmpleadosMouseClicked

        if (evt.getClickCount() == 2) {

            btnGuardar.setText("Actualizar");

            int row = tablaEmpleados.getSelectedRow();

            idSeleccionado = Integer.parseInt(dtm.getValueAt(row, 0).toString());
            txtNumeroCedula.setText(dtm.getValueAt(row, 1).toString());
            txtNombreCompleto.setText(dtm.getValueAt(row, 2).toString());
            txtSueldoBase.setText(dtm.getValueAt(row, 3).toString());
            txtCorreo.setText(dtm.getValueAt(row, 4).toString());

        }

    }//GEN-LAST:event_tablaEmpleadosMouseClicked

    private void btnCerrarSesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMousePressed
        new ventanaPrincipal().show();
        this.dispose();
    }//GEN-LAST:event_btnCerrarSesionMousePressed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCancelar;
    private javax.swing.JLabel btnCerrarSesion;
    private javax.swing.JLabel btnGuardar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JTable tablaEmpleados;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombreCompleto;
    private javax.swing.JTextField txtNumeroCedula;
    private javax.swing.JTextField txtSueldoBase;
    // End of variables declaration//GEN-END:variables

    private void cargarDatosEmpleados() throws SQLException {

        //Limpiando la tabla
        if (dtm.getRowCount() > 0) {
            for (int i = dtm.getRowCount() - 1; i > -1; i--) {
                dtm.removeRow(i);
            }
        }

        //Cargando los datos de la base de datos
        Statement statement = Conexion.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM Empleados");
        while (resultSet.next()) {
            dtm.addRow(new Object[]{
                resultSet.getInt(1),
                resultSet.getString(2),
                resultSet.getString(3),
                resultSet.getFloat(4),
                resultSet.getString(5)
            });
        }

    }

    private void limpiarCampos() {

        txtNumeroCedula.setText("");
        txtNombreCompleto.setText("");
        txtSueldoBase.setText("");
        txtCorreo.setText("");
        txtNumeroCedula.requestFocus();
        idSeleccionado = 0;
        btnGuardar.setText("Guardar");
    }

}
