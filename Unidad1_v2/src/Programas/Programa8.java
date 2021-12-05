
package Programas;

import java.util.Scanner;

/**
 *
 * @author Marcoromero
 */
public class Programa8 {
    public  void procedimiento() {
        Scanner sc = new Scanner (System.in);
         System.out.println("Nombre: ");
         String nombre = sc.nextLine();
         System.out.println("Cuantas veces quieres repetirlo?: ");
         int numero= sc.nextInt();
         for (int x = 1; x <=numero; x ++  )
         System.out.println(nombre);
        }
           
}
