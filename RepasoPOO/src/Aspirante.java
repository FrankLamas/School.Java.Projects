
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
public class Aspirante extends Persona{
    
    //Atributos
    String cAspirante="";
    //Constructores
    
    public Aspirante(String nombre, int edad, String CURP, char sexo, double peso, double altura,String cAspirante) {
        super(nombre, edad, CURP, sexo, peso, altura);
        if (cAspirante.equals("")) {
            generaCodigoAspirante();
        }else
            this.cAspirante = cAspirante;
    }

    public Aspirante(String CURP, String Nombre,String cAspirante) {
        super(CURP, Nombre);
        if (cAspirante.equals("")) {
            generaCodigoAspirante();
        }else
            this.cAspirante = cAspirante;
    }

    public Aspirante(String nombre, int edad, String CURP, char sexo,String cAspirante) {
        super(nombre, edad, CURP, sexo);
        if (cAspirante.equals("")) {
            generaCodigoAspirante();
        }else
            this.cAspirante = cAspirante;
    }
    
    //Metodos
    
    private void generaCodigoAspirante(){
        if (this.cAspirante.equals("")) {
            int numero = ThreadLocalRandom.current().nextInt(1000,10000);
            this.cAspirante = numero+"";
        }
    }
    
}
