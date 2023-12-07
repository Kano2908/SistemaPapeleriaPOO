package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionDB {
    private String bd = "papeleriaPF";
    private String url = "jdbc:mysql://localhost:3306/";
    private String user = "root";                           
    private String psw = "";
    private String driver = "com.mysql.cj.jdbc.Driver";
    private Connection con;
    
    public Connection getConnection(){
        try{
            Class.forName(this.driver);
            con = DriverManager.getConnection(url+bd, user, psw);
            con.setAutoCommit(false);
            System.out.println("Conexion Establecida En: "+bd);
        } catch(Exception e){
            System.out.println("No Se Conecto: "+e);
        }
        return con;
    }
    
    public void desconectar(){
        try{
            this.con.setAutoCommit(true);
            this.con.close();
        } catch(Exception e){
            System.out.println("Error: "+e);
        }
    }
}
