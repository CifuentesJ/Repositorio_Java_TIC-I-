import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ventanaProductos extends javax.swing.JFrame {

    
    public ventanaProductos() {
        initComponents();
        setVisible(true);
        setTitle("Verdulería y Supermercado");
        setLocationRelativeTo(null);
        inv.productosInciales();
    }

    Inventario inv = new Inventario();
    Producto p = new Producto();

    public void mostrarProductos(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("CÓDIGO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("CATEGORÍA");
        modelo.addColumn("DISPONIBLE");
        modelo.addColumn("PRECIO");
        modelo.addColumn("INVENTARIO");
        tabla.setModel(modelo);

        String[] datos = new String[6];
        for (Producto pr: inv.getListaProductos()){
            datos[0] = String.valueOf(pr.getCodigo());
            datos[1] = pr.getNombre();
            datos[2] = pr.getCategoria();
            if (pr.isDisponible() == true){
                datos[3] = "SI";
            }else{
                datos[3] = "NO";
            }
            datos[4] = String.valueOf(pr.getPrecio());
            datos[5] = String.valueOf(pr.getInventario());
            modelo.addRow(datos);
        }
    }
    public Producto creaProducto(){
        String nombreVal, categoriaVal;
        int codigoVal, inventarioVal;
        boolean dispoVal;
        float precioVal;

        codigoVal = Integer.parseInt(this.codigoField.getText());
        nombreVal = this.nombreField.getText();
        categoriaVal = this.categoriaBox.getSelectedItem().toString();
        precioVal = (float)this.precioSpinner.getValue();
        inventarioVal = (int)this.inventarioSpinner.getValue();
        if (this.disponibleRBtn.isSelected()){
            dispoVal = true;
        }else{
            dispoVal = false;
        }

        p = new Producto(codigoVal, nombreVal, precioVal, inventarioVal, categoriaVal, dispoVal);
        
        return p;
    }

    public void insertaProducto(){
        inv.insertarProducto(creaProducto());
    }

    public void cargaForm(){
        int fila = tabla.getSelectedRow();
        if (fila >= 0){
            codigoField.setText(tabla.getValueAt(fila, 0).toString());
            codigoField.setEditable(false);
            nombreField.setText(tabla.getValueAt(fila, 1).toString());
            nombreField.setEditable(false);
            categoriaBox.setSelectedItem(tabla.getValueAt(fila, 2));
            categoriaBox.setEnabled(false);
            precioSpinner.setValue(Float.parseFloat(tabla.getValueAt(fila, 4).toString()));
            inventarioSpinner.setValue(Integer.parseInt(tabla.getValueAt(fila, 5).toString()));
            if(tabla.getValueAt(fila, 3).equals("SI")){
                disponibleRBtn.setSelected(true);
            }else{
                noDisponibleRBtn.setSelected(true);
            }
        }
    }

    public void modificaProducto(){
        Producto moP = creaProducto();
        if(inv.modificarProducto(moP.getCodigo(), moP) == true){
            inv.modificarProducto(moP.getCodigo(), moP);
            JOptionPane.showMessageDialog(null, "Producto actualizado perfectamente","Exito", 2);
        }else{
            JOptionPane.showMessageDialog(null, "Producto no modificado","Exito", 0);
        }
    }

    public void vaciar(){
        codigoField.setText("");
        codigoField.setEditable(true);
        nombreField.setText("");
        nombreField.setEditable(true);
        categoriaBox.setSelectedItem("Frutas");
        categoriaBox.setEnabled(true);
        precioSpinner.setValue(0f);
        inventarioSpinner.setValue(0);
        disponibleRBtn.setSelected(false);
        noDisponibleRBtn.setSelected(false);
    }

    public void eliminaProducto(){
        
        int x = JOptionPane.showConfirmDialog(null, "¿Seguro que quiere eliminar el producto?", "Confirmación", 1, 2);
        if(x == 0){
            inv.elminarProducto(Integer.parseInt(codigoField.getText()));
            JOptionPane.showMessageDialog(null, "Producto eliminado.", "Eliminado.", 2);
        }else{
            JOptionPane.showMessageDialog(null, "Producto no eliminado.", "No eliminado.", 2);
        }
    }

    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        disponibleGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        codigoField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nombreField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        categoriaBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        precioSpinner = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        inventarioSpinner = new javax.swing.JSpinner();
        noDisponibleRBtn = new javax.swing.JRadioButton();
        disponibleRBtn = new javax.swing.JRadioButton();
        insertarBtn = new javax.swing.JButton();
        consultarBtn = new javax.swing.JButton();
        actualizarBtn1 = new javax.swing.JButton();
        eliminarBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        codActualizar = new javax.swing.JTextField();
        salirBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        cargarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        jLabel1.setText("Código:");

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 3, 24)); // NOI18N
        jLabel2.setText("Gestión de Productos");

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        jLabel4.setText("Categoría:");

        categoriaBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Frutas", "Verduras", "Congelados", "Confitería", "Carnes" }));

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        jLabel5.setText("Precio:");

        precioSpinner.setModel(new javax.swing.SpinnerNumberModel(0.0f, 0.0f, null, 100.0f));

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        jLabel6.setText("Inventario:");

        inventarioSpinner.setModel(new javax.swing.SpinnerNumberModel());

        noDisponibleRBtn.setBackground(new java.awt.Color(102, 204, 255));
        disponibleGroup.add(noDisponibleRBtn);
        noDisponibleRBtn.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        noDisponibleRBtn.setText("No Disponible");

        disponibleRBtn.setBackground(new java.awt.Color(102, 204, 255));
        disponibleGroup.add(disponibleRBtn);
        disponibleRBtn.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        disponibleRBtn.setText("Disponible");

        insertarBtn.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        insertarBtn.setText("Insertar");
        insertarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarBtnActionPerformed(evt);
            }
        });

        consultarBtn.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        consultarBtn.setText("Consultar");
        consultarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarBtnActionPerformed(evt);
            }
        });

        actualizarBtn1.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        actualizarBtn1.setText("Actualizar");
        actualizarBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarBtn1ActionPerformed(evt);
            }
        });

        eliminarBtn.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        eliminarBtn.setText("Eliminar");
        eliminarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBtnActionPerformed(evt);
            }
        });

        salirBtn.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        salirBtn.setText("Salir");
        salirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtnActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        cargarBtn.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        cargarBtn.setText("Cargar");
        cargarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codigoField, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precioSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inventarioSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(categoriaBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(disponibleRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(noDisponibleRBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(28, 28, 28))))
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(codActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(394, 394, 394)
                .addComponent(salirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(insertarBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(consultarBtn)
                        .addGap(18, 18, 18)
                        .addComponent(cargarBtn)
                        .addGap(18, 18, 18)
                        .addComponent(actualizarBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(eliminarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(categoriaBox, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(codigoField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(noDisponibleRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(inventarioSpinner, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(precioSpinner, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(disponibleRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertarBtn)
                    .addComponent(consultarBtn)
                    .addComponent(actualizarBtn1)
                    .addComponent(eliminarBtn)
                    .addComponent(cargarBtn))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(salirBtn)
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(codActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarBtnActionPerformed(java.awt.event.ActionEvent evt) {
        cargaForm();
        
    }                                         

    private void eliminarBtnActionPerformed(java.awt.event.ActionEvent evt) {
        eliminaProducto();
        mostrarProductos();
        vaciar();
    }

    private void actualizarBtn1ActionPerformed(java.awt.event.ActionEvent evt) {
        //int cod = Integer.parseInt(this.codActualizar.getText());
        modificaProducto();
        mostrarProductos();
        vaciar();
    }

    private void insertarBtnActionPerformed(java.awt.event.ActionEvent evt) {
        this.insertaProducto();
        this.mostrarProductos();
    }

    private void salirBtnActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void consultarBtnActionPerformed(java.awt.event.ActionEvent evt) {
        mostrarProductos();
    }

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
            java.util.logging.Logger.getLogger(ventanaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarBtn1;
    private javax.swing.JButton cargarBtn;
    private javax.swing.JComboBox<String> categoriaBox;
    private javax.swing.JTextField codActualizar;
    private javax.swing.JTextField codigoField;
    private javax.swing.JButton consultarBtn;
    private javax.swing.ButtonGroup disponibleGroup;
    private javax.swing.JRadioButton disponibleRBtn;
    private javax.swing.JButton eliminarBtn;
    private javax.swing.JButton insertarBtn;
    private javax.swing.JSpinner inventarioSpinner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton noDisponibleRBtn;
    private javax.swing.JTextField nombreField;
    private javax.swing.JSpinner precioSpinner;
    private javax.swing.JButton salirBtn;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
