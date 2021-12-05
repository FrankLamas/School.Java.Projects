package modelos;



public class Personal {
    private String Nombre;
    private int edad;
    private String area;
    private String telefono;
    private String domicilio;
    private String cp;
    private String clave;
    public String getNombre(){
   
        return Nombre;
}

public void setNombre(String nombre){
    this.Nombre=nombre;

}

    public Personal(String nombre, String clave) {
        this.Nombre = nombre;
        this.clave = clave;
    }

    public String getClave() {
        
        return clave;
    }

    public void setClave(String clave) {
        
        this.clave = clave;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }
    
    @Override
    public String toString(){
     return clave + " " + Nombre ;   
    }
        
}
