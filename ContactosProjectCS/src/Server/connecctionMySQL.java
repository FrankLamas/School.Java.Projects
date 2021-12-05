package Server;


import com.mysql.jdbc.Connection;
import java.sql.DriverManager;


public class connecctionMySQL {
    
    public static void main(String[] args) {
        Connection con = getConection();
    }
    
    public static Connection getConection(){
        Connection con=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectocsuno","root","root");
            System.out.println("Conexión Establecida");
        } catch (Exception e) {
            System.out.println("No se pudo conectar prro: "+e.getMessage());
        }
        return con;
    }
}
