package GUI;

import Logica.ControladoraLogica;
import Logica.Empleado;
import Logica.Proveedor;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;

public class JPUpdateEmpleado extends javax.swing.JPanel {
    ControladoraLogica controladoraL = new ControladoraLogica();
    JPReadEmpleado readEmpleado = null;
    
    public JPUpdateEmpleado(int idEmpleado) {
        initComponents();
        cargarDatos(idEmpleado);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jBModificar = new javax.swing.JButton();
        jBRegresar = new javax.swing.JButton();
        jLIdServicio = new javax.swing.JLabel();
        jTFIdEmpleado = new javax.swing.JTextField();
        jTFNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTFApellidoP = new javax.swing.JTextField();
        jTFTelefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTFDireccion = new javax.swing.JTextField();
        jTFApellidoM = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        jLabel1.setText("MODIFICAR PROVEEDOR");

        jBModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesGUI/editar.png"))); // NOI18N
        jBModificar.setToolTipText("Modificar");
        jBModificar.setBorderPainted(false);
        jBModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesGUI/flecha-hacia-atras.png"))); // NOI18N
        jBRegresar.setBorderPainted(false);
        jBRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegresarActionPerformed(evt);
            }
        });

        jLIdServicio.setText("idEmpleado");

        jTFIdEmpleado.setEditable(false);
        jTFIdEmpleado.setEnabled(false);

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido Paterno");

        jLabel4.setText("Telefono");

        jLabel5.setText("Direccion");

        jLabel6.setText("Apellido Materno");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jBModificar))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBRegresar)))
                .addContainerGap(448, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLIdServicio)
                            .addGap(12, 12, 12)
                            .addComponent(jTFIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(12, 12, 12)
                            .addComponent(jTFApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(12, 12, 12)
                            .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(jTFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(12, 12, 12)
                            .addComponent(jTFApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(jTFDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(53, 53, 53)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBRegresar)
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                .addComponent(jBModificar)
                .addGap(36, 36, 36))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(148, 148, 148)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTFIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLIdServicio)
                        .addComponent(jLabel6)
                        .addComponent(jTFApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(14, 14, 14)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel5)
                        .addComponent(jTFDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTFApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jTFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(149, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        String idEmpleado = jTFIdEmpleado.getText();
        String nombre = jTFNombre.getText();
        String apellidoPaterno = jTFApellidoP.getText();
        String apellidoMaterno = jTFApellidoM.getText();
        String direccion = jTFDireccion.getText();
        String telefono = jTFTelefono.getText();
        
        if (!nombre.isEmpty() && !apellidoPaterno.isEmpty() && !apellidoMaterno.isEmpty() && !direccion.isEmpty() && !telefono.isEmpty()) {

            // Validar que el número de teléfono tenga exactamente 10 dígitos
            if (telefono.matches("\\d{10}")) {
                    controladoraL.modificarEmpleado(idEmpleado, nombre, apellidoPaterno, apellidoMaterno, direccion, telefono);

                    JOptionPane.showMessageDialog(null, "Empleado modificado exitosamente", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                    regresarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "El número de teléfono debe tener 10 dígitos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar datos en todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegresarActionPerformed
        regresarTabla();
    }//GEN-LAST:event_jBRegresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBRegresar;
    private javax.swing.JLabel jLIdServicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTFApellidoM;
    private javax.swing.JTextField jTFApellidoP;
    private javax.swing.JTextField jTFDireccion;
    private javax.swing.JTextField jTFIdEmpleado;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFTelefono;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos(int idEmpleado){
        Empleado xEmpleado = controladoraL.traerEmpleado(idEmpleado);
        
        jTFIdEmpleado.setText(String.valueOf(xEmpleado.getIdEmpleado()));
        jTFNombre.setText(xEmpleado.getNombre());
        jTFApellidoP.setText(xEmpleado.getApellidoPaterno());
        jTFApellidoM.setText(xEmpleado.getApellidoMaterno());
        jTFDireccion.setText(String.valueOf(xEmpleado.getDireccion()));
        jTFTelefono.setText(String.valueOf(xEmpleado.getTelefono()));
    }
    
    public void regresarTabla(){
        readEmpleado = new JPReadEmpleado();
        readEmpleado.setSize(824, 416);
        readEmpleado.setLocation(0,0);
        
        this.removeAll();
        this.add(readEmpleado,BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }
}
