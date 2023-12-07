package GUI;

import Logica.ControladoraLogica;
import Logica.Servicio;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;

public class JPUpdateServicio extends javax.swing.JPanel {
    ControladoraLogica controladoraL = new ControladoraLogica();
    JPReadServicio pagServicio = null;
    
    public JPUpdateServicio(int idServicio) {
        initComponents();
        cargarDatos(idServicio);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLIdServicio = new javax.swing.JLabel();
        jTFIdServicio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTFDescripcionS = new javax.swing.JTextField();
        jTFTipoS = new javax.swing.JTextField();
        jTFCostoS = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jBModificar = new javax.swing.JButton();
        jBRegresar = new javax.swing.JButton();
        jCBDisponibilidad = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        jLabel1.setText("MODIFICAR SERVICIO");

        jLIdServicio.setText("IdServicio");

        jTFIdServicio.setEditable(false);
        jTFIdServicio.setEnabled(false);

        jLabel2.setText("Tipo Servicio");

        jLabel3.setText("Descripción");

        jLabel4.setText("Costo");

        jLabel5.setText("Disponibilidad");

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

        jCBDisponibilidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "En existencia", "Sin existencia" }));

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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jLIdServicio)
                                        .addGap(12, 12, 12)
                                        .addComponent(jTFIdServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(12, 12, 12)
                                            .addComponent(jTFTipoS, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(5, 5, 5)
                                            .addComponent(jLabel3)
                                            .addGap(12, 12, 12)
                                            .addComponent(jTFDescripcionS, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(71, 71, 71)
                                        .addComponent(jLabel5))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFCostoS, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                    .addComponent(jCBDisponibilidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jBModificar))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBRegresar)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBRegresar)
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jTFCostoS, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTFIdServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLIdServicio)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jCBDisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFTipoS, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTFDescripcionS, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jBModificar)
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        String idServicio = jTFIdServicio.getText();
        String tipoServicio = jTFTipoS.getText();
        String descripcion = jTFDescripcionS.getText();
        String costo = jTFCostoS.getText();
        String disponibilidad = (String) jCBDisponibilidad.getSelectedItem();
        
        try {
            if (!tipoServicio.isEmpty() && !descripcion.isEmpty() && !costo.isEmpty() && !disponibilidad.endsWith("Seleccionar")) {
                double costoNum = Double.parseDouble(costo);
                
                controladoraL.modificarServicio(idServicio, tipoServicio, descripcion, costoNum, disponibilidad);

                JOptionPane.showMessageDialog(null, "Servicio modficado exitosamente", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                regresarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar datos", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El costo debe ser un valor numérico", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegresarActionPerformed
        regresarTabla();
    }//GEN-LAST:event_jBRegresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBRegresar;
    private javax.swing.JComboBox<String> jCBDisponibilidad;
    private javax.swing.JLabel jLIdServicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTFCostoS;
    private javax.swing.JTextField jTFDescripcionS;
    private javax.swing.JTextField jTFIdServicio;
    private javax.swing.JTextField jTFTipoS;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos(int idServicio){
        Servicio xServicio = controladoraL.traerServicio(idServicio);
        
        jTFIdServicio.setText(String.valueOf(xServicio.getIdServicio()));
        jTFTipoS.setText(xServicio.getTipoServicio());
        jTFDescripcionS.setText(xServicio.getDescripcion());
        jTFCostoS.setText(String.valueOf(xServicio.getCosto()));
        
        if(xServicio.getDisponibilidad().equals("En existencia")){
            jCBDisponibilidad.setSelectedIndex(1);
        } else if (xServicio.getDisponibilidad().equals("Sin existencia")){
            jCBDisponibilidad.setSelectedIndex(2);
        }
    }
    
    public void regresarTabla(){
        pagServicio = new JPReadServicio();
        pagServicio.setSize(824, 416);
        pagServicio.setLocation(0,0);
        
        this.removeAll();
        this.add(pagServicio,BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }
}
