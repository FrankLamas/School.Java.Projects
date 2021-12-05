package Programas;
import java.util.Scanner;


/**
 *
 * @author xXRUBENXx
 */
public class Programa4 {
    public void procedimiento() {
Scanner sc=new Scanner(System.in);
int h;
System.out.printf("Dame la hora en formato de 24 hrs: ");
h=sc.nextInt();
if(h==12){
System.out.println("Tu hora es: "+h+" p.m.");
}
else if(h>12){
h=h-12;
System.out.println("Tu hora es: "+h+" p.m."); }
else{
if(h==0){
System.out.println("Tu hora es: 12 a.m."); }
else if(h<12){
System.out.println("Tu hora es: "+h+" a.m."); }
}
}
}


    

