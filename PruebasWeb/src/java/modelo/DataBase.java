package modelo;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
public class DataBase {
    private final String server= "jdbc:mysql://localhost/web";
    private final String user="root";
    private final String pass = "root";
    
    public Connection cone;
    
    public DataBase(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cone=DriverManager.getConnection(server,user,pass);
            System.out.println("Ah prro estas conectado");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void agregarDato(String nombre,String pass){
        String sentence = "INSERT INTO Usuario (nombre,contrasena) VALUES('"+nombre+"', '"+pass+"');";
        try {
            Statement sql = cone.createStatement();
            sql.executeUpdate(sentence);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void addUsuarioPreparado(String nombre,String pass){
        try {
            PreparedStatement ps = cone.prepareStatement("INSERT INTO Usuario (nombre,contrasena) VALUES(?,?);");
            ps.setString(1, nombre);
            ps.setString(2, pass);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void addUsuarioSP(String nombre,String pass){
        try {
            CallableStatement ps = cone.prepareCall("{CALL SP_AddUsuario(?, ?)}");
            ps.setString(1, nombre);
            ps.setString(2, pass);
            ps.execute();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void editarUsuario(String nombre,String pass,int id){
        String sentence = "UPDATE Usuario SET nombre= '"+nombre+"', contrasena='"+pass+"' WHERE idUsuario="+id+";";
        try {
            Statement sql = cone.createStatement();
            sql.executeUpdate(sentence);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void editarUsuarioPreparado(String nombre,String pass,int id){
        try {
            PreparedStatement ps = cone.prepareStatement("UPDATE Usuario SET nombre= ?, contrasena=? WHERE idUsuario=?;");
            ps.setString(1, nombre);
            ps.setString(2, pass);
            ps.setInt(3, id);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void editarUsuarioSP(String nombre,String pass,int id){
        try {
            CallableStatement ps = cone.prepareCall("{CALL SP_EditarUsuario(?, ?, ?)}");
            ps.setString(1, nombre);
            ps.setString(2, pass);
            ps.setInt(3, id);
            ps.execute();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
