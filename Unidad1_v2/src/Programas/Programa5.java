package Programas;

import java.util.Scanner;

public class Programa5 {

    public void proceso(){
        Scanner scr = new Scanner(System.in);
int Num;
System.out.println("Dame un Numero");
Num = scr.nextInt();
if(Num<50)
System.out.println("Doble" + 2*Num);
else 
System.out.println("Triple" + 3*50);
    }
    
}
