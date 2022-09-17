
package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    

    public static Connection getConexionBD(){
        Connection cn=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost/entrada4","root","");
            System.out.println("Se Conecto");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("NO SE CONECTO");
        } return cn;
    }
    public static void main(String[] args) {
         Conexion obj = new Conexion();
        Conexion.getConexionBD();
}
}
