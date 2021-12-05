
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author frank
 */
public class Principal {
    public static void main(String[] args) {
        System.out.println("Prueba");
        
        superclase sc = new superclase();
        sc.atributo1 = 1;
        sc.supermetod();
        
        derivada1 d1 = new derivada1();
        d1.atributo1 = 5;
        d1.atributoderivado1 = 2;
        d1.metododerivado();
        d1.supermetod();
        
        Derivada2 d2 = new Derivada2();
        d2.metododerivado();
        
        List<InterfazPadre> lista = new ArrayList<>();
        lista.add(d1);
        lista.add(d2);
        lista.add(sc);
        System.out.println("_________________________________________________");
        for (InterfazPadre obj : lista) {
            obj.hacersuma();
        }
    }
}
