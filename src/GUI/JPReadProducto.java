package GUI;

import Logica.ControladoraLogica;
import Logica.Producto;
import java.awt.BorderLayout;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JPReadProducto extends javax.swing.JPanel {
    ControladoraLogica controladoraL = new ControladoraLogica();
    JPAddProducto addProducto = null;
    JPUpdateProducto updateProducto = null;
    public JPReadProducto() {
        initComponents();
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProductos = new javax.swing.JTable();
        jBAgregar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        jLabel1.setText("REVISAR PRODUCTOS");

        jTProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTProductos);

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
        addProducto = new JPAddProducto();
        addProducto.setSize(824, 416);
        addProducto.setLocation(0,0);
        
        this.removeAll();
        this.add(addProducto,BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        if(jTProductos.getRowCount() > 0){
            if (jTProductos.getSelectedRow() != -1) {
                int idProducto = Integer.parseInt(String.valueOf(jTProductos.getValueAt(jTProductos.getSelectedRow(), 0)));

                updateProducto = new JPUpdateProducto(idProducto);

                updateProducto.setSize(824, 416);
                updateProducto.setLocation(0, 0);

                this.removeAll();
                this.add(updateProducto, BorderLayout.CENTER);
                this.revalidate();
                this.repaint();
            } else {
                JOptionPane.showMessageDialog(null, "No selecciono ningun producto", "Error al modificar",JOptionPane.ERROR_MESSAGE);
            }
        } else{
            JOptionPane.showMessageDialog(null, "No hay registros para modificar", "Error al modificar",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        if(jTProductos.getRowCount() > 0){
            if (jTProductos.getSelectedRow() != -1) {
                int idProducto = Integer.parseInt(String.valueOf(jTProductos.getValueAt(jTProductos.getSelectedRow(), 0)));
                
                controladoraL.eliminarProducto(idProducto);
                
                JOptionPane.showMessageDialog(null, "Producto eliminado exitosamente", "Informacion",JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No selecciono ningun producto", "Error al modificar",JOptionPane.ERROR_MESSAGE);
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
    private javax.swing.JTable jTProductos;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        // Declarar formatoMoneda para la visualizacion en la tabla
        DecimalFormat formatoMoneda = new DecimalFormat("$#,##0.00");
        //Definir el modelo de la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel(){
          //Filas y columnas no editables al hacer doble click
            @Override
            public boolean isCellEditable (int row, int colum){
             return false;   
            }
        };
        
        String titulos[] = {"ID", "Nombre", "Descripcion", "Precio", "Stock"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        
        //Carga de datos desde la BD
        List <Producto> listaProductos = controladoraL.traerProductos();
        
        //Recorrer la lista y mostrar las tuplas en la tabla
        if (listaProductos != null) {
            for (Producto produ: listaProductos) {
                Object[] atributos = {produ.getIdProducto() , produ.getNombre(), produ.getDescripcion(), formatoMoneda.format(produ.getPrecio()), produ.getStock()};
                
                modeloTabla.addRow(atributos);
            }
        }
        jTProductos.setModel(modeloTabla);
    }
}
