package Persistencia;

import Logica.Servicio;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ServicioController {
    private ConexionDB conexDB = new ConexionDB();
    private Statement st;
    private ResultSet rs;
    private Connection con;
    
    public void addServicio(Servicio xServicio) {
        String sql = "INSERT INTO Servicio (tipoServicio, descripcion, costo, disponibilidad) "
                + "VALUES ('" + xServicio.getTipoServicio() + "', '" + xServicio.getDescripcion() + "', "
                + xServicio.getCosto() + " , '" + xServicio.getDisponibilidad() + "')";

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
    
    public List<Servicio> readServicios(){
        List<Servicio> listaServicios = new ArrayList<>();
        String sql = "SELECT * FROM Servicio";

        try {
            con = conexDB.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                Servicio xServicio = new Servicio();
                xServicio.setIdServicio(rs.getInt("id"));
                xServicio.setTipoServicio(rs.getString("tipoServicio"));
                xServicio.setDescripcion(rs.getString("descripcion"));
                xServicio.setCosto(rs.getDouble("costo"));
                xServicio.setDisponibilidad(rs.getString("disponibilidad"));

                listaServicios.add(xServicio);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }     
        return listaServicios;
    }
    
    Servicio readServicio(int idServicio){
        String sql = "SELECT * FROM Servicio WHERE id = " + idServicio;
        Servicio xServicio = null;
        
        try {
            con = conexDB.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);

            if (rs.next()) {
                xServicio = new Servicio();
                
                xServicio.setIdServicio(rs.getInt("id"));
                xServicio.setTipoServicio(rs.getString("tipoServicio"));
                xServicio.setDescripcion(rs.getString("descripcion"));
                xServicio.setCosto(rs.getDouble("costo"));
                xServicio.setDisponibilidad(rs.getString("disponibilidad"));
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
        return xServicio;
    }
    
    public void updateServicio(Servicio xServicio) {
        String sql = "UPDATE Servicio SET tipoServicio = '" + xServicio.getTipoServicio() + "', descripcion = '" + xServicio.getDescripcion() 
                +"', costo = " + xServicio.getCosto() + ", disponibilidad = '" + xServicio.getDisponibilidad() + "' WHERE id = " + xServicio.getIdServicio();

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
    
    public void deleteServicio(int idServicio) {
        String sql = "DELETE FROM Servicio WHERE id = " + idServicio;

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
