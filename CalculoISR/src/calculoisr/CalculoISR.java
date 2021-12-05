
package calculoisr;

import java.util.Scanner;

public class CalculoISR {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double sal, is;
        System.out.println("********SISTEMA DE CALCULO ISR POR NOMINA**************");
        System.out.println("Ingresa el sueldo por nomina para el calculo de isr: ");

        sal = s.nextDouble();

        if (sal >= 0 && sal <= 244.8) {
            is = sal * 0.19;
            System.out.println("El isr es de :" +is);
        }

        else if (sal > 244.8 && sal <= 2077.5) {
            is = sal * 0.064;
            System.out.println("El isr es de :" +is);
        }        

        else if (sal > 2077.5 && sal <= 3651) {
            is = sal * 0.1088;
            System.out.println("El isr es de :" +is);
        }
        
        else if (sal > 3651 && sal <= 4244.1) {
            is = sal * 0.16;
            System.out.println("El isr es de :" +is);
        }
        
        else if (sal > 4244.1 && sal <= 5081.4) {
            is = sal * 0.1792;
            System.out.println("El isr es de :" +is);
        }
        
        else if (sal > 5081.4 && sal <= 10248.45) {
            is = sal * 0.2136;
            System.out.println("El isr es de :" +is);
        }
        
        else if (sal > 10248.45 && sal <= 16153.05) {
            is = sal * 0.2352;
            System.out.println("El isr es de :" +is);
        }
        
        else if (sal > 16153.05) {
            is = sal * 0.3;
            System.out.println("El isr es de :" +is);
        }
        
        else {
            System.out.println("ERROR");
        }
    }
    
}
