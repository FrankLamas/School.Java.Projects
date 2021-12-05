package Programas;

import java.util.Scanner;


public class Programa2 {
public void proceso(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Dime precio del articulo: ");
    int a=sc.nextInt();
    a*=0.84;
    System.out.println("Resultado es: "+a);
}    
}
