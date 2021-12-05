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
public class Padre {
    int a;
    public Padre(int a){
        this.a = a;
    }
    public int hacerSuma(int b){
        int res;
        res= a+b;
        return res;
    }
}
