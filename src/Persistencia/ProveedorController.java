package Persistencia;

import Logica.Proveedor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProveedorController {
    private ConexionDB conexDB = new ConexionDB();
    private Statement st;
    private ResultSet rs;
    private Connection con;
    
    public void addProveedor(Proveedor xProveedor) {
        String sql = "INSERT INTO Proveedor (nombre, ubicacion, telefono, email) "
                + "VALUES ('" + xProveedor.getNombre() + "', '" + xProveedor.getUbicacion() + "', '"
                + xProveedor.getTelefono() + "', '" + xProveedor.getEmail() + "')";

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
    
    public List<Proveedor> readProveedores(){
        List<Proveedor> listaProveedores = new ArrayList<>();
        String sql = "SELECT * FROM Proveedor";

        try {
            con = conexDB.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                Proveedor xProveedor = new Proveedor();
                xProveedor.setIdProveedor(rs.getInt("id"));
                xProveedor.setNombre(rs.getString("nombre"));
                xProveedor.setUbicacion(rs.getString("ubicacion"));
                xProveedor.setTelefono(rs.getString("telefono"));
                xProveedor.setEmail(rs.getString("email"));

                listaProveedores.add(xProveedor);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }     
        return listaProveedores;
    }
     
    public Proveedor readProveedor(int idProveedor){
        String sql = "SELECT * FROM Proveedor WHERE id = " + idProveedor;
        Proveedor xProveedor = null;
        
        try {
            con = conexDB.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);

            if (rs.next()) {
                xProveedor = new Proveedor();
                
                xProveedor.setIdProveedor(rs.getInt("id"));
                xProveedor.setNombre(rs.getString("nombre"));
                xProveedor.setUbicacion(rs.getString("ubicacion"));
                xProveedor.setTelefono(rs.getString("telefono"));
                xProveedor.setEmail(rs.getString("email"));
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
        return xProveedor;
    }
     
    public void updateProveedor(Proveedor xProveedor) {
        String sql = "UPDATE Proveedor SET nombre = '" + xProveedor.getNombre() + "', ubicacion = '" + xProveedor.getUbicacion() 
                + "', telefono = '" + xProveedor.getTelefono() + "', email = '" + xProveedor.getEmail() + "' WHERE id = " + xProveedor.getIdProveedor();

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
     
    public void deleteProveedor(int idProveedor) {
        String sql = "DELETE FROM Proveedor WHERE id = " + idProveedor;

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

