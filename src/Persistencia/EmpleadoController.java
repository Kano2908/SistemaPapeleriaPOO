package Persistencia;

import Logica.Empleado;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class EmpleadoController {
    private ConexionDB conexDB = new ConexionDB();
    private Statement st;
    private ResultSet rs;
    private Connection con;

    public void addEmpleado(Empleado xEmpleado) {
        String sql = "INSERT INTO Empleado (nombre, apellidoPaterno, apellidoMaterno, direccion, telefono) "
                + "VALUES ('" + xEmpleado.getNombre() + "', '" + xEmpleado.getApellidoPaterno() + "', '"
                + xEmpleado.getApellidoMaterno() + "', '" + xEmpleado.getDireccion() + "', '"
                + xEmpleado.getTelefono() + "')";

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

    public List<Empleado> readEmpleados() {
        List<Empleado> listaEmpleados = new ArrayList<>();
        String sql = "SELECT * FROM Empleado";

        try {
            con = conexDB.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                Empleado xEmpleado = new Empleado();
                xEmpleado.setIdEmpleado(rs.getInt("id"));
                xEmpleado.setNombre(rs.getString("nombre"));
                xEmpleado.setApellidoPaterno(rs.getString("apellidoPaterno"));
                xEmpleado.setApellidoMaterno(rs.getString("apellidoMaterno"));
                xEmpleado.setDireccion(rs.getString("direccion"));
                xEmpleado.setTelefono(rs.getString("telefono"));

                listaEmpleados.add(xEmpleado);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return listaEmpleados;
    }

    public Empleado readEmpleado(int idEmpleado) {
        String sql = "SELECT * FROM Empleado WHERE id = " + idEmpleado;
        Empleado xEmpleado = null;

        try {
            con = conexDB.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);

            if (rs.next()) {
                xEmpleado = new Empleado();

                xEmpleado.setIdEmpleado(rs.getInt("id"));
                xEmpleado.setNombre(rs.getString("nombre"));
                xEmpleado.setApellidoPaterno(rs.getString("apellidoPaterno"));
                xEmpleado.setApellidoMaterno(rs.getString("apellidoMaterno"));
                xEmpleado.setDireccion(rs.getString("direccion"));
                xEmpleado.setTelefono(rs.getString("telefono"));
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
        return xEmpleado;
    }

    public void updateEmpleado(Empleado xEmpleado) {
        String sql = "UPDATE Empleado SET nombre = '" + xEmpleado.getNombre() + "', apellidoPaterno = '"
                + xEmpleado.getApellidoPaterno() + "', apellidoMaterno = '" + xEmpleado.getApellidoMaterno()
                + "', direccion = '" + xEmpleado.getDireccion() + "', telefono = '" + xEmpleado.getTelefono()
                + "' WHERE id = " + xEmpleado.getIdEmpleado();

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

    public void deleteEmpleado(int idEmpleado) {
        String sql = "DELETE FROM Empleado WHERE id = " + idEmpleado;

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