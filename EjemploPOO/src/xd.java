
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author falco
 */
public class xd {
    public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);
          System.out.print("Introduce el número de elementos a mostrar de la serie: ");
          int limite = sc.nextInt();
          sc.close();

          for(int i = 0; i<limite; i++){
               System.out.print(funcionFibonacci(i) + ", ");
          }
     }

     private static int funcionFibonacci(int num){
          if(num == 0 || num==1)
               return num;
          else
               return funcionFibonacci(num-1) + funcionFibonacci(num-2);
     }

}

