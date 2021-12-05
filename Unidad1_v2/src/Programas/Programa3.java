
package Programas;

import java.util.Scanner;


public class Programa3 {
   
    public void procedimiento3() {
         Scanner sc= new Scanner (System.in);
         System.out.println("Dame los  Celcius: ");
         double x= sc.nextInt();
         double f=((x*1.8)+32);
         System.out.println("Farenheit: "+f);
         double k=(x+273);
         System.out.println("kelvin:"+k);
        
        
    }
    
    
}
