/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author falco
 */
public class superclase implements InterfazPadre{
    int atributo1;
    public void supermetod(){
        System.out.println("Que hongo HTPM?"+atributo1);
    }

    @Override
    public void hacersuma() {
       supermetod();
    }
    
}
