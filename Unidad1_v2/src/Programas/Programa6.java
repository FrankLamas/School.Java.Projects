package Programas;

import java.util.Scanner;

public class Programa6 {

    public void proceso(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Dame un numero");
        int a=sc.nextInt();
        a%=2;
        if (a==0) 
            System.out.println("El numero es par");
        else
            System.out.println("El numero es impar");
    }
}
