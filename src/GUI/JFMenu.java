package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JOptionPane;

public class JFMenu extends javax.swing.JFrame {
    JFLogin ventanaLogin = null;
    JPReadServicio pagServicio = null;
    JPReadProducto pagProducto = null;
    JPReadProveedor pagProveedor = null;
    JPReadEmpleado pagEmpleado = null;

    public JFMenu() {
        initComponents();
        vistaServicio();
        setDate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPBackground = new javax.swing.JPanel();
        jPContenido = new javax.swing.JPanel();
        panelRound1 = new GUI.PanelRound();
        jBSalir = new javax.swing.JButton();
        jBEmpleados = new javax.swing.JButton();
        jBProveedores = new javax.swing.JButton();
        jBProductos = new javax.swing.JButton();
        jBServicio = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelRound2 = new GUI.PanelRound();
        jLDate = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPContenido.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPContenidoLayout = new javax.swing.GroupLayout(jPContenido);
        jPContenido.setLayout(jPContenidoLayout);
        jPContenidoLayout.setHorizontalGroup(
            jPContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 824, Short.MAX_VALUE)
        );
        jPContenidoLayout.setVerticalGroup(
            jPContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
        );

        panelRound1.setBackground(new java.awt.Color(11, 0, 45));
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopRight(50);

        jBSalir.setBackground(new java.awt.Color(9, 0, 39));
        jBSalir.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jBSalir.setForeground(new java.awt.Color(255, 255, 255));
        jBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesGUI/flecha.png"))); // NOI18N
        jBSalir.setText("             Salir");
        jBSalir.setBorder(null);
        jBSalir.setBorderPainted(false);
        jBSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBSalirMouseExited(evt);
            }
        });
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBEmpleados.setBackground(new java.awt.Color(9, 0, 39));
        jBEmpleados.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jBEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        jBEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesGUI/empleados.png"))); // NOI18N
        jBEmpleados.setText("Empleados");
        jBEmpleados.setBorder(null);
        jBEmpleados.setBorderPainted(false);
        jBEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBEmpleadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBEmpleadosMouseExited(evt);
            }
        });
        jBEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEmpleadosActionPerformed(evt);
            }
        });

        jBProveedores.setBackground(new java.awt.Color(9, 0, 39));
        jBProveedores.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jBProveedores.setForeground(new java.awt.Color(255, 255, 255));
        jBProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesGUI/proveedores.png"))); // NOI18N
        jBProveedores.setText("Proveedores");
        jBProveedores.setBorder(null);
        jBProveedores.setBorderPainted(false);
        jBProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBProveedoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBProveedoresMouseExited(evt);
            }
        });
        jBProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBProveedoresActionPerformed(evt);
            }
        });

        jBProductos.setBackground(new java.awt.Color(9, 0, 39));
        jBProductos.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jBProductos.setForeground(new java.awt.Color(255, 255, 255));
        jBProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesGUI/productos.png"))); // NOI18N
        jBProductos.setText("    Productos");
        jBProductos.setBorder(null);
        jBProductos.setBorderPainted(false);
        jBProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBProductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBProductosMouseExited(evt);
            }
        });
        jBProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBProductosActionPerformed(evt);
            }
        });

        jBServicio.setBackground(new java.awt.Color(9, 0, 39));
        jBServicio.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jBServicio.setForeground(new java.awt.Color(255, 255, 255));
        jBServicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesGUI/ventas.png"))); // NOI18N
        jBServicio.setText("     Servicios");
        jBServicio.setBorder(null);
        jBServicio.setBorderPainted(false);
        jBServicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBServicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBServicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBServicioMouseExited(evt);
            }
        });
        jBServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBServicioActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesGUI/papeleria.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PAPELERIA");

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jBServicio, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
            .addComponent(jBSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jBEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jBProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jBProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jBServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        jLDate.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLDate.setText("Hoy Es {dayname} {day} de {year}");

        jLabel.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel.setText("BIENVENIDO USUARIO");

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLDate)
                .addGap(16, 16, 16))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLDate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout jPBackgroundLayout = new javax.swing.GroupLayout(jPBackground);
        jPBackground.setLayout(jPBackgroundLayout);
        jPBackgroundLayout.setHorizontalGroup(
            jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBackgroundLayout.createSequentialGroup()
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRound2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPBackgroundLayout.setVerticalGroup(
            jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPBackgroundLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPBackgroundLayout.createSequentialGroup()
                        .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalirMouseEntered
        jBSalir.setBackground(new Color(17,0,73));
    }//GEN-LAST:event_jBSalirMouseEntered

    private void jBSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalirMouseExited
        jBSalir.setBackground(new Color(9,0,39));
    }//GEN-LAST:event_jBSalirMouseExited

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        ventanaLogin = new JFLogin();
        
        JOptionPane.showMessageDialog(null, "Saliendo", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        
        ventanaLogin.setVisible(true);
        ventanaLogin.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBEmpleadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEmpleadosMouseEntered
        jBEmpleados.setBackground(new Color(17,0,73));
    }//GEN-LAST:event_jBEmpleadosMouseEntered

    private void jBEmpleadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEmpleadosMouseExited
        jBEmpleados.setBackground(new Color(9,0,39));
    }//GEN-LAST:event_jBEmpleadosMouseExited

    private void jBEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEmpleadosActionPerformed
        pagEmpleado = new JPReadEmpleado();
        pagEmpleado.setSize(824, 416);
        pagEmpleado.setLocation(0,0);
        
        jPContenido.removeAll();
        jPContenido.add(pagEmpleado,BorderLayout.CENTER);
        jPContenido.revalidate();
        jPContenido.repaint();
    }//GEN-LAST:event_jBEmpleadosActionPerformed

    private void jBProveedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBProveedoresMouseEntered
        jBProveedores.setBackground(new Color(17,0,73));
    }//GEN-LAST:event_jBProveedoresMouseEntered

    private void jBProveedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBProveedoresMouseExited
        jBProveedores.setBackground(new Color(9,0,39));
    }//GEN-LAST:event_jBProveedoresMouseExited

    private void jBProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProveedoresActionPerformed
        pagProveedor = new JPReadProveedor();
        pagProveedor.setSize(824, 416);
        pagProveedor.setLocation(0,0);
        
        jPContenido.removeAll();
        jPContenido.add(pagProveedor,BorderLayout.CENTER);
        jPContenido.revalidate();
        jPContenido.repaint();
    }//GEN-LAST:event_jBProveedoresActionPerformed

    private void jBProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBProductosMouseEntered
        jBProductos.setBackground(new Color(17,0,73));
    }//GEN-LAST:event_jBProductosMouseEntered

    private void jBProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBProductosMouseExited
        jBProductos.setBackground(new Color(9,0,39));
    }//GEN-LAST:event_jBProductosMouseExited

    private void jBProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProductosActionPerformed
        pagProducto = new JPReadProducto();
        pagProducto.setSize(824, 416);
        pagProducto.setLocation(0,0);
        
        jPContenido.removeAll();
        jPContenido.add(pagProducto,BorderLayout.CENTER);
        jPContenido.revalidate();
        jPContenido.repaint();
    }//GEN-LAST:event_jBProductosActionPerformed

    private void jBServicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBServicioMouseEntered
        jBServicio.setBackground(new Color(17,0,73));
    }//GEN-LAST:event_jBServicioMouseEntered

    private void jBServicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBServicioMouseExited
        jBServicio.setBackground(new Color(9,0,39));
    }//GEN-LAST:event_jBServicioMouseExited

    private void jBServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBServicioActionPerformed
        vistaServicio();
    }//GEN-LAST:event_jBServicioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEmpleados;
    private javax.swing.JButton jBProductos;
    private javax.swing.JButton jBProveedores;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBServicio;
    private javax.swing.JLabel jLDate;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPBackground;
    private javax.swing.JPanel jPContenido;
    private GUI.PanelRound panelRound1;
    private GUI.PanelRound panelRound2;
    // End of variables declaration//GEN-END:variables

    public void vistaServicio(){
        pagServicio = new JPReadServicio();
        pagServicio.setSize(824, 416);
        pagServicio.setLocation(0,0);
        
        jPContenido.removeAll();
        jPContenido.add(pagServicio,BorderLayout.CENTER);
        jPContenido.revalidate();
        jPContenido.repaint();
    }
    
    private void setDate(){
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale("es", "ES");
        jLDate.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'de' yyyy ", spanishLocale)));
    }
}