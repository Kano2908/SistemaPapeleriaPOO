package GUI;

import Logica.ControladoraLogica;
import Logica.Proveedor;
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JPReadProveedor extends javax.swing.JPanel {
    ControladoraLogica controladoraL = new ControladoraLogica();
    JPAddProveedor addProveedor = null;
    JPUpdateProveedor updateProveedor = null;
    public JPReadProveedor() {
        initComponents();
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProveedores = new javax.swing.JTable();
        jBAgregar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        jLabel1.setText("REVISAR PROVEEDORES");

        jTProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTProveedores);

        jBAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesGUI/add.png"))); // NOI18N
        jBAgregar.setToolTipText("Agregar");
        jBAgregar.setBorderPainted(false);
        jBAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jBModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesGUI/editar.png"))); // NOI18N
        jBModificar.setToolTipText("Modificar");
        jBModificar.setBorderPainted(false);
        jBModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBeliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesGUI/borrar.png"))); // NOI18N
        jBeliminar.setToolTipText("Eliminar");
        jBeliminar.setBorderPainted(false);
        jBeliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBeliminar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jBAgregar, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jBModificar, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 31, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(jBModificar)
                        .addGap(18, 18, 18)
                        .addComponent(jBeliminar)))
                .addGap(41, 41, 41))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        addProveedor = new JPAddProveedor();
        addProveedor.setSize(824, 416);
        addProveedor.setLocation(0,0);
        
        this.removeAll();
        this.add(addProveedor,BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        if(jTProveedores.getRowCount() > 0){
            if (jTProveedores.getSelectedRow() != -1) {
                int idProveedor = Integer.parseInt(String.valueOf(jTProveedores.getValueAt(jTProveedores.getSelectedRow(), 0)));

                updateProveedor = new JPUpdateProveedor(idProveedor);

                updateProveedor.setSize(824, 416);
                updateProveedor.setLocation(0, 0);

                this.removeAll();
                this.add(updateProveedor, BorderLayout.CENTER);
                this.revalidate();
                this.repaint();
            } else {
                JOptionPane.showMessageDialog(null, "No selecciono ningun proveedor", "Error al modificar",JOptionPane.ERROR_MESSAGE);
            }
        } else{
            JOptionPane.showMessageDialog(null, "No hay registros para modificar", "Error al modificar",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        if(jTProveedores.getRowCount() > 0){
            if (jTProveedores.getSelectedRow() != -1) {
                int idProveedor = Integer.parseInt(String.valueOf(jTProveedores.getValueAt(jTProveedores.getSelectedRow(), 0)));
                
                controladoraL.eliminarProveedor(idProveedor);
                
                JOptionPane.showMessageDialog(null, "Proveedor eliminado exitosamente", "Informacion",JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No selecciono ningun proveedor", "Error al modificar",JOptionPane.ERROR_MESSAGE);
            }
        } else{
            JOptionPane.showMessageDialog(null, "No hay registros para eliminar", "Error al modificar",JOptionPane.ERROR_MESSAGE);
        }
        cargarTabla();
    }//GEN-LAST:event_jBeliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTProveedores;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        //Definir el modelo de la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel(){
          //Filas y columnas no editables al hacer doble click
            @Override
            public boolean isCellEditable (int row, int colum){
             return false;   
            }
        };
        
        String titulos[] = {"ID", "Nombre", "Ubicacion", "Telefono", "Email"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        
        //Carga de datos desde la BD
        List <Proveedor> listaProveedores = controladoraL.traerProveedores();
        
        //Recorrer la lista y mostrar las tuplas en la tabla
        if (listaProveedores != null) {
            for (Proveedor prov: listaProveedores) {
                Object[] atributos = {prov.getIdProveedor(), prov.getNombre(), prov.getUbicacion(), prov.getTelefono(), prov.getEmail()};
                
                modeloTabla.addRow(atributos);
            }
        }
        jTProveedores.setModel(modeloTabla);
    }
}
