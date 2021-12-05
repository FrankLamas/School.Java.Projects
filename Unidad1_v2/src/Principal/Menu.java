package Principal;
import java.util.Scanner;
import Programas.*;
public class Menu {
    public static void main(String[] args) {
        int i=1; 
        do{
        System.out.println("1) Area de un triangulo");
        System.out.println("2) IVA de un producto");
        System.out.println("3) Convertir grados");
        System.out.println("4) Convertir las horas");
        System.out.println("5) Obtener el doble de un numero menor a 50");
        System.out.println("6) Determinar si un numero es paro impar");
        System.out.println("7) Desplegar un numero romano menor a 7");
        System.out.println("8) Impre un nmbre las veces que se pide");
        System.out.println("9) Despliega una lista del 1 al 500");
        System.out.println("10) Factorial");
            System.out.println("11) Salir");
        
        System.out.println("¿Que obcion quieres?:");
        int lee= new Scanner(System.in).nextInt();
         i=lee;
        switch(lee){
            case 1:
                programa1 ro=new programa1();
                ro.area();
                break;
            case 2:
                Programa2 ri=new Programa2();
                ri.proceso();
                break;
            case 3:
                     Programa3 iv=new Programa3();
                     iv.procedimiento3();
                     break;
            case 4:
                Programa4 rub=new Programa4();
                rub.procedimiento();
                break;
            case 5:
                Programa5 jp=new Programa5();
                jp.proceso();
                break;
            case 6:
                Programa6 fa=new Programa6();
                fa.proceso();
                break;
            case 7:
                Programa7 ang=new Programa7();
                ang.proceso();
                break;
            case 8:
                Programa8 mr=new Programa8();
                      mr.procedimiento();
                      break;
            case 9:
                Programa9 el=new Programa9();
                el.porceso();
                break;
            case 10:
                Programa10 pe=new Programa10();
                pe.porceso();
                break;
            default:
                break;
        }
         }while (i<11);
    }
    
}
