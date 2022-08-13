package paqEjemInter;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Ventana1 extends javax.swing.JFrame {

    public Ventana1() {
        initComponents();
        setTitle("Tipos de Triángulos");
        setVisible(true);
        setLocationRelativeTo(null);
    }

    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnCalc = new javax.swing.JButton();
        nomLad3 = new javax.swing.JLabel();
        ladoC = new javax.swing.JTextField();
        ladoB = new javax.swing.JTextField();
        nomLad2 = new javax.swing.JLabel();
        nomLad1 = new javax.swing.JLabel();
        ladoA = new javax.swing.JTextField();
        Subtitulo = new javax.swing.JLabel();
        Título = new javax.swing.JLabel();
        resu = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSalir.setBackground(new java.awt.Color(51, 102, 255));
        btnSalir.setText("Salir");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnCalc.setBackground(new java.awt.Color(51, 102, 255));
        btnCalc.setText("Calcular");
        btnCalc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });

        nomLad3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        nomLad3.setForeground(new java.awt.Color(51, 102, 255));
        nomLad3.setText("Lado 3:");

        ladoC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ladoCKeyTyped(evt);
            }
        });

        ladoB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ladoBKeyTyped(evt);
            }
        });

        nomLad2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        nomLad2.setForeground(new java.awt.Color(51, 102, 255));
        nomLad2.setText("Lado 2:");

        nomLad1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        nomLad1.setForeground(new java.awt.Color(51, 102, 255));
        nomLad1.setText("Lado 1:");

        ladoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ladoAActionPerformed(evt);
            }
        });
        ladoA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ladoAKeyTyped(evt);
            }
        });

        Subtitulo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Subtitulo.setText("Ingrese la medida de los lados");

        Título.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        Título.setForeground(new java.awt.Color(51, 102, 255));
        Título.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Título.setText("Cálculo de Triángulos");
        Título.setToolTipText("");

        resu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(29, 29, 29)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Subtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(14, 14, 14)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(nomLad3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(nomLad2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(nomLad1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(ladoA, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(ladoB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(ladoC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(55, 55, 55)
                                            .addComponent(btnCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(Título, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(resu, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 67, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Título, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Subtitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomLad1)
                    .addComponent(ladoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomLad2)
                    .addComponent(ladoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomLad3)
                    .addComponent(ladoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(btnCalc)
                .addGap(18, 18, 18)
                .addComponent(resu, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagen, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ladoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ladoAActionPerformed
        
    }//GEN-LAST:event_ladoAActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void ladoAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ladoAKeyTyped
        if (!Character.isDigit(evt.getKeyChar()) ){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Por favor digite un valor numérico", "Denied", 2);
        }
    }//GEN-LAST:event_ladoAKeyTyped

    private void ladoBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ladoBKeyTyped
        if (Character.isLetter(evt.getKeyChar())){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Por favor digite un valor numérico", "Denied", 2);
        }
    }//GEN-LAST:event_ladoBKeyTyped

    private void ladoCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ladoCKeyTyped
        if (Character.isLetter(evt.getKeyChar())){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Por favor digite un valor numérico", "Denied", 2);
        }
    }//GEN-LAST:event_ladoCKeyTyped
    

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//
        if (ladoA.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Digite el lado 1", "Error", 0);
        }else if (ladoB.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Digite el lado 2", "Error", 0);
        }else if (ladoC.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Digite el lado 3", "Error", 0);
        }else{
            int a, b, c;
            a = Integer.parseInt(this.ladoA.getText());
            b = Integer.parseInt(this.ladoB.getText());
            c = Integer.parseInt(this.ladoC.getText());
            Triangulo tria = new Triangulo(a, b, c);
            tria.tipoTriangulo();
            resu.setText("El triángulo es "+tria.getTipo());
            ImageIcon img = new ImageIcon(tria.getRutaImagen());
            Icon icono = new ImageIcon(img.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), imagen.getWidth()));
            imagen.setIcon(icono);
        }
    }

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Subtitulo;
    private javax.swing.JLabel Título;
    private javax.swing.JButton btnCalc;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel imagen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField ladoA;
    private javax.swing.JTextField ladoB;
    private javax.swing.JTextField ladoC;
    private javax.swing.JLabel nomLad1;
    private javax.swing.JLabel nomLad2;
    private javax.swing.JLabel nomLad3;
    private javax.swing.JLabel resu;
    // End of variables declaration//GEN-END:variables
}
