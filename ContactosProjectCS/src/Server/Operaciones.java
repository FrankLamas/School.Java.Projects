package Server;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Operaciones {
    PreparedStatement ps;
    ResultSet rs;
//    
//    public static void main(String[] args) {
//        Operaciones op = new Operaciones();
//        
//        System.out.println(op.buscar("f"));
//    }
//    
    public void agregarNuevo(String contacto){
        try {
            String[] nuevoc = contacto.split(";");
            connecctionMySQL c = new connecctionMySQL();
            Connection con =null;
            con=c.getConection();
            ps = con.prepareStatement("INSERT INTO contacto(Nombre,Email) VALUES(?,?);");
            ps.setString(1, nuevoc[0]);
            ps.setString(2, nuevoc[1]);
            int res = ps.executeUpdate();
            if (res>0) {
                System.out.println("Se guardó tu registro");
            }else{
                System.out.println("Algo ocurrio que no salio nada alv prro");
            }
            con.close();
        } catch (Exception e) {
            System.out.println("No se pudo, Error: "+e.getMessage());
        }
    }
    
    public String valores(){
        String cad="";
        try {
            connecctionMySQL c = new connecctionMySQL();
            Connection con =null;
            con=c.getConection();
            ps = con.prepareStatement("SELECT * FROM contacto;");
            rs = ps.executeQuery();
            while(rs.next()){
                String aux =rs.getString("Id")+";"+rs.getString("Nombre")+";"+rs.getString("Email")+"#";
                //System.out.println(aux);
                cad=cad+aux;
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Hubo un error alv: "+e.getMessage());
        }
        return cad;
    }
    
    public String buscar(String b){
        String cad="";
        try {
            connecctionMySQL c = new connecctionMySQL();
            Connection con =null;
            con=c.getConection();
            ps = con.prepareStatement("SELECT * FROM contacto WHERE Id LIKE('%"+b+"%') or Nombre LIKE('%"+b+"%') or Email LIKE('%"+b+"%');");
            rs = ps.executeQuery();
            while(rs.next()){
                String aux =rs.getString("Id")+";"+rs.getString("Nombre")+";"+rs.getString("Email")+"#";
                //System.out.println(aux);
                cad=cad+aux;
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Hubo un error alv: "+e.getMessage());
        }
        return cad;
    }
    
}
