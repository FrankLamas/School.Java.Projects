/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

/**
 *
 * @author falco
 */
public class Testing {

    public static void main(String[] args) {
        Padre p = new Hijo(2);
        int res = p.hacerSuma(5);
        System.out.println("El resultado de la suma es " + res); // imprimira el resultado de la suma del valor 
        // del constructor mas el parametro que se 
        //mande en el metodo hacer suma
    }
}
