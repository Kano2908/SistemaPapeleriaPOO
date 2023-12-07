package GUI;

import Logica.ControladoraLogica;
import Logica.Empleado;
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JPReadEmpleado extends javax.swing.JPanel {
    ControladoraLogica controladoraL = new ControladoraLogica();
    JPAddEmpleado addEmpleado = null;
    JPUpdateEmpleado updateEmpleado = null;
    public JPReadEmpleado() {
        initComponents();
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTEmpleados = new javax.swing.JTable();
        jBAgregar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        jLabel1.setText("REVISAR EMPLEADOS");

        jTEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTEmpleados);

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
        addEmpleado = new JPAddEmpleado();
        addEmpleado.setSize(824, 416);
        addEmpleado.setLocation(0,0);
        
        this.removeAll();
        this.add(addEmpleado,BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        if(jTEmpleados.getRowCount() > 0){
            if (jTEmpleados.getSelectedRow() != -1) {
                int idEmpleado = Integer.parseInt(String.valueOf(jTEmpleados.getValueAt(jTEmpleados.getSelectedRow(), 0)));

                updateEmpleado = new JPUpdateEmpleado(idEmpleado);

                updateEmpleado.setSize(824, 416);
                updateEmpleado.setLocation(0, 0);

                this.removeAll();
                this.add(updateEmpleado, BorderLayout.CENTER);
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
        if(jTEmpleados.getRowCount() > 0){
            if (jTEmpleados.getSelectedRow() != -1) {
                int idEmpleado = Integer.parseInt(String.valueOf(jTEmpleados.getValueAt(jTEmpleados.getSelectedRow(), 0)));
                
                controladoraL.eliminarEmpleado(idEmpleado);
                
                JOptionPane.showMessageDialog(null, "Empleado eliminado exitosamente", "Informacion",JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No selecciono ningun empleado", "Error al modificar",JOptionPane.ERROR_MESSAGE);
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
    private javax.swing.JTable jTEmpleados;
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
        
        String titulos[] = {"ID", "Nombre", "Apellido Paterno", "Apellido Paterno", "Direccion", "Telefono"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        
        //Carga de datos desde la BD
        List <Empleado> listaEmpleados = controladoraL.traerEmpleados();
        
        //Recorrer la lista y mostrar las tuplas en la tabla
        if (listaEmpleados != null) {
            for (Empleado emple: listaEmpleados) {
                Object[] atributos = {emple.getIdEmpleado(), emple.getNombre(), emple.getApellidoPaterno(), 
                    emple.getApellidoMaterno(), emple.getDireccion(), emple.getTelefono()};
                
                modeloTabla.addRow(atributos);
            }
        }
        jTEmpleados.setModel(modeloTabla);
    }
}
