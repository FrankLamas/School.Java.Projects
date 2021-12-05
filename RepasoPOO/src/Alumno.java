
import java.util.Calendar;
import java.util.concurrent.ThreadLocalRandom;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author falco
 */
public class Alumno extends Persona{
    
    private String nc="";
    private String carrera;
    
    //Constructores
    public Alumno(String nombre, int edad, String CURP, char sexo, double peso, double altura,String nc,String carrera) {
        super(nombre, edad, CURP, sexo, peso, altura);
        if (!nc.equals("")) {
            this.nc=nc;
        }else
            generaNumeroControl();
        this.carrera = carrera;
    }
    
    public Alumno(String nombre, String CURP,String nc,String carrera) {
        super(CURP,nombre);
        if (!nc.equals("")) {
            this.nc=nc;
        }else
            generaNumeroControl();
        this.carrera = carrera;
    }
    
    public Alumno(String nombre,int edad,String CURP, char sexo,String nc,String carrera) {
        super(nombre, edad, CURP, sexo);
        if (!nc.equals("")) {
            this.nc=nc;
        }else
            generaNumeroControl();
        this.carrera = carrera;
    }

    // Gets and Sets
    public String getNc() {
        return nc;
    }

    public void setNc(String nc) {
        this.nc = nc;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    //Metodos
    
    private void generaNumeroControl(){
        if (this.nc.equals("")) {
            Calendar cal= Calendar.getInstance();
            int year= cal.get(Calendar.YEAR);
            String pc = (year-2000)+"0";
            int numero = ThreadLocalRandom.current().nextInt(60000,70000);
            this.nc = pc+numero;
        }
    }
    
    public void cambioCarrera(String carreranueva){
        generaNumeroControl();
        this.carrera =carreranueva;
    }
}
