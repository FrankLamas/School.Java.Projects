package principal;

import java.util.Scanner;

/**
 *Menu de un estado de cuenta
 * @author Carlos
 */
public class Menu {
    public static void main(String[] args) {
        opciones hola=new opciones();
        hola.lanzarmenu();
    }
    
}
class opciones{
    Cuenta op=new Cuenta();
    int a;
            void lanzarmenu(){
    while(a!=4){
        System.out.println("1) Hacer un Deposito");
        System.out.println("2) Retirar");
        System.out.println("3) Consultar Saldo");
        System.out.println("4) Salir");
        a=new Scanner(System.in).nextInt();
        operacion(a);
    }
            }
            private void operacion(int a){
     switch(a){
            case 1:
                
                System.out.print("Cuanto va a Depositar: ");
                int dinero=new Scanner(System.in).nextInt();
                op.HacerDeposito(dinero);
                break;
            case 2:
                
                System.out.print("Cuanto vas a Retirar: ");
                int retiro=new Scanner(System.in).nextInt();
                op.RetirarSaldo(retiro);
                break;
            case 3:
                
                System.out.println("Tu saldo es: "+op.toString());
                break;
            
            default:
                System.out.println("Esa opcion no sirve...");
                break;
            case 4:
                break;
        }   
    }
}
