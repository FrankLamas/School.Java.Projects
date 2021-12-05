package Programas;

import java.util.Scanner;

public class Programa10 {

 public void porceso(){

Scanner s = new Scanner(System.in);

int suma = 1;

System.out.print("ingrese el Numero ");

int n = s.nextInt();

for (int i = n; i>1; i--){

suma = suma * i;
}

System.out.println("el Factorial de el numero " +n+ " es " + suma );


}
    
}
