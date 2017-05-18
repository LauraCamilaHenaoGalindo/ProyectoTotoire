
package util;

import java.sql.*;

public class Conexion {
    
     public String driver, url, user, password, bd;
    public Connection conexion;

    public Conexion() {
        driver = "com.mysql.jdbc.Driver";
        user = "root";
        password = "";
        bd = "bdtotoire";
        url = "jdbc:mysql://localhost:3306/bdtotoire";

        try {
            Class.forName(driver).newInstance();
            conexion = DriverManager.getConnection(url, user, password);
            System.out.println("Conexion Establecida");
        } catch (Exception e) {
            System.out.println("Error En La Conexion" + e);
        }
    }

    public Connection ObtenerConexion() {
        return conexion;
    }

    public Connection CerrarConexion() throws SQLException {
        conexion.close();
        conexion = null;
        return conexion;
    }
    
    public static void main(String[] args){
    new Conexion();
    }
    
}
