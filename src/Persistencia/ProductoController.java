package Persistencia;

import Logica.Producto;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProductoController {
    private ConexionDB conexDB = new ConexionDB();
    private Statement st;
    private ResultSet rs;
    private Connection con;
    
    public void addProducto(Producto xProducto) {
        String sql = "INSERT INTO Producto (nombre, descripcion, precio) "
                + "VALUES ('" + xProducto.getNombre() + "', '" + xProducto.getDescripcion() + "', "
                + xProducto.getPrecio() + ")";

        try {
            con = conexDB.getConnection();
            st = con.createStatement();
            st.execute("BEGIN");
            st.executeUpdate(sql);

            con.commit();
            conexDB.desconectar();
        } catch (SQLException e) {
            System.err.print(e.toString());
            if (con != null) {
                try {
                    JOptionPane.showMessageDialog(null, "Deshaciendo Cambios");
                    con.rollback();
                    conexDB.desconectar();
                } catch (SQLException ex) {
                    System.out.println("Error: " + ex);
                }
            }
        }
    }
    
     public List<Producto> readProductos(){
        List<Producto> listaProductos = new ArrayList<>();
        String sql = "SELECT * FROM Producto";

        try {
            con = conexDB.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                Producto xProducto = new Producto();
                xProducto.setIdProducto(rs.getInt("id"));
                xProducto.setNombre(rs.getString("nombre"));
                xProducto.setDescripcion(rs.getString("descripcion"));
                xProducto.setPrecio(rs.getDouble("precio"));
                xProducto.setStock(rs.getInt("stock"));

                listaProductos.add(xProducto);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }     
        return listaProductos;
    }
     
     Producto readProducto(int idProducto){
        String sql = "SELECT * FROM Producto WHERE id = " + idProducto;
        Producto xProducto = null;
        
        try {
            con = conexDB.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);

            if (rs.next()) {
                xProducto = new Producto();
                
                xProducto.setIdProducto(rs.getInt("id"));
                xProducto.setNombre(rs.getString("nombre"));
                xProducto.setDescripcion(rs.getString("descripcion"));
                xProducto.setPrecio(rs.getDouble("precio"));
                xProducto.setStock(rs.getInt("stock"));
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e);
            if (con != null) {
                try {
                    JOptionPane.showMessageDialog(null, "Deshaciendo Cambios");
                    con.rollback();
                    conexDB.desconectar();
                } catch (SQLException ex) {
                    System.out.println("Error: " + ex);
                }
            }
        }
        return xProducto;
    }
     
     public void updatePrpducto(Producto xProducto) {
        String sql = "UPDATE Producto SET nombre = '" + xProducto.getNombre() + "', descripcion = '" + xProducto.getDescripcion() 
                +"', precio = " + xProducto.getPrecio()+ ", stock = " + xProducto.getStock() + " WHERE id = " + xProducto.getIdProducto();

        try {
            con = conexDB.getConnection();
            st = con.createStatement();
            st.execute("BEGIN");
            st.execute(sql);

            con.commit();
            conexDB.desconectar();
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            if (con != null) {
                try {
                    JOptionPane.showMessageDialog(null, "Deshaciendo Cambios");
                    con.rollback();
                    conexDB.desconectar();
                } catch (SQLException ex) {
                    System.out.println("Error: " + ex);
                }
            }
        }
    }
     public void deleteServicio(int idProducto) {
        String sql = "DELETE FROM Producto WHERE id = " + idProducto;

        try {
            con = conexDB.getConnection();
            st = con.createStatement();
            st.execute("BEGIN");
            st.execute(sql);

            con.commit();
            conexDB.desconectar();
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            if (con != null) {
                try {
                    JOptionPane.showMessageDialog(null, "Deshaciendo Cambios");
                    con.rollback();
                    conexDB.desconectar();
                } catch (SQLException ex) {
                    System.out.println("Error: " + ex);
                }
            }
        }
    }
}