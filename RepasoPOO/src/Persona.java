/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author francisco lamas
 */
public class Persona {
    
    //Atributos y sus gets y sets
    private String nombre="";
    private int edad=0;
    private String CURP;
    private char sexo='H';
    private double peso=0;
    private double altura=0;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCURP() {
        return CURP;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    //Contructores
    public Persona(String CURP,String Nombre){
        this.nombre=Nombre;
        this.CURP = CURP;
    }
    public Persona(String nombre,int edad,String CURP, char sexo, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.CURP = CURP;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    public Persona(String nombre,int edad,String CURP, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.CURP = CURP;
        this.sexo = sexo;
    }
    
    
    //Metodos
    //Calucar MC: calculara si la persona esta en su peso ideal (peso en kg/(altura^2 en m)),
    //si esta fórmula devuelve un valor menor que 20, la función devuelve un -1, si devuelve
    //un número entre 20 y 25 (incluidos), significa que esta por debajo de su peso ideal la
    //función devuelve un 0 y si devuelve un valor mayor que 25 significa que tiene
    //sobrepeso, la función devuelve un 1.
    
    public int calcularMC(){
        double iMC = this.peso/(Math.pow(altura, 2)); 
        if (iMC<20) {
            return -1;
        }else if (iMC>=20 && iMC<=25) {
            return 0;
        }else
            return 1;
    }
    
    public boolean esMayorDeEdad(){
        if (edad>17) {
            return true;
        }else
            return false;
    }
    
    public void comprobarSexo(char sexo){
        this.sexo = sexo;
    }
}
