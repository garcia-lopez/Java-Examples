
package formulario;

import javax.swing.JOptionPane;
import modelos.Producto;


public class FrmProducto extends javax.swing.JFrame {

Producto prod;    
    
    public FrmProducto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLblCodigo = new javax.swing.JLabel();
        jLblNombre = new javax.swing.JLabel();
        jLblPrecio = new javax.swing.JLabel();
        jLblExistencia = new javax.swing.JLabel();
        jTfCòdigo = new javax.swing.JTextField();
        jTfNombre = new javax.swing.JTextField();
        jTfPrecio = new javax.swing.JTextField();
        jTfExistencia = new javax.swing.JTextField();
        jBtnLimpiar = new javax.swing.JButton();
        jBtnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Productos");

        jLblCodigo.setText("Còdigo: ");

        jLblNombre.setText("Nombre: ");

        jLblPrecio.setText("Precio:");

        jLblExistencia.setText("Existencia:");

        jTfCòdigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfCòdigoActionPerformed(evt);
            }
        });

        jTfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfNombreActionPerformed(evt);
            }
        });

        jTfExistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfExistenciaActionPerformed(evt);
            }
        });

        jBtnLimpiar.setText("Limpiar");
        jBtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimpiarActionPerformed(evt);
            }
        });

        jBtnGuardar.setText("Guardar");
        jBtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLblPrecio)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLblExistencia)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLblCodigo)
                                        .addComponent(jLblNombre)))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTfExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTfCòdigo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jBtnLimpiar)
                                .addGap(37, 37, 37)
                                .addComponent(jBtnGuardar)))
                        .addGap(0, 68, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblCodigo)
                    .addComponent(jTfCòdigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblNombre)
                    .addComponent(jTfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblPrecio)
                    .addComponent(jTfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLblExistencia)
                    .addComponent(jTfExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTfCòdigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfCòdigoActionPerformed
   
    }//GEN-LAST:event_jTfCòdigoActionPerformed

    private void jBtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimpiarActionPerformed
        // TODO add your handling code here:
        jTfCòdigo.setText("");
        jTfNombre.setText("");
        jTfPrecio.setText("");
        jTfExistencia.setText("");
        jTfCòdigo.requestFocus();
        
    }//GEN-LAST:event_jBtnLimpiarActionPerformed

    private void jTfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfNombreActionPerformed

    private void jTfExistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfExistenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfExistenciaActionPerformed

    private void jBtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarActionPerformed
        prod = new Producto();
        prod.setIdProd(jTfCòdigo.getText());
        prod.setNombreProducto(jTfNombre.getText());
        prod.setPrecioProd(Double.parseDouble(jTfPrecio.getText()));
        prod.setExistenciaProd(Integer.parseInt(jTfExistencia.getText()));
        JOptionPane.showMessageDialog(this, prod.toString(),
                "Guardar", JOptionPane.INFORMATION_MESSAGE);
        
        
        
        
        
    }//GEN-LAST:event_jBtnGuardarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnGuardar;
    private javax.swing.JButton jBtnLimpiar;
    private javax.swing.JLabel jLblCodigo;
    private javax.swing.JLabel jLblExistencia;
    private javax.swing.JLabel jLblNombre;
    private javax.swing.JLabel jLblPrecio;
    private javax.swing.JTextField jTfCòdigo;
    private javax.swing.JTextField jTfExistencia;
    private javax.swing.JTextField jTfNombre;
    private javax.swing.JTextField jTfPrecio;
    // End of variables declaration//GEN-END:variables
}
