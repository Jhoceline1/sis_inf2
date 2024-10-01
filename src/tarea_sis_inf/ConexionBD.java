package tarea_sis_inf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    // Datos de conexión
    private static String url = "jdbc:mysql://bq9ygbdrznflofjfo6jh-mysql.services.clever-cloud.com:3306/bq9ygbdrznflofjfo6jh";
    private static String usuario = "uk14hq8kmxohcw8m";
    private static String contrasena = "u0NbKk64JJDgWbHGKLA0";

    public static Connection conectar() {
        Connection conexion = null;
        
        try {
            // Cargar el driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conexion = DriverManager.getConnection(url, usuario, contrasena);
            System.out.println("Conexión establecida");
        } catch (ClassNotFoundException e) {
            //System.out.println("Error:no encontrado");
            e.printStackTrace();
        } catch (SQLException e) {
            //System.out.println("Error alestablecer la conex " + e.getMessage());
            e.printStackTrace();
        }
        
        return conexion;
    }
    public static void main(String[] args) {
        // Llamamos al método conectar para probar la conexión
        Connection conexion = ConexionBD.conectar();
        
        if (conexion != null) {
            System.out.println("La conexión fue exitosa.");
        } else {
            System.out.println("La conexión falló.");
        }
    }

}


