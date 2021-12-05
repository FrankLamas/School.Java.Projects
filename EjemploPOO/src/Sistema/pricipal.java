package Sistema;

import control.OperacionesPersonal;
import java.util.Scanner;
import modelos.Personal;

public class pricipal {
    
  final  String nombreApp="SISTEMA RH";
  private int version = 1;
    public static void main(String[] args) {
        
        pricipal prog=new pricipal();
        System.out.println(prog.nombreApp);
        System.out.println("Version: " + prog.version);
        menu m=new menu();
        m.lanzarMenu();             
        Personal persona1=new Personal("Carlos Lamas", "17061031");
        Personal persona2=new Personal("Estefania Ulloa","17061154");
        
        OperacionesPersonal op= new OperacionesPersonal();
        op.agregarPersonal(persona1);
        op.agregarPersonal(persona2);
        
        /// Imprimir la lista
        
        }
    }


class menu{
    int opcion;
    void lanzarMenu(){
        
        while(opcion!=5) 
        {
            System.out.println("Menu");
            System.out.println("1) Agregar");
            System.out.println("2) Consultar");
            System.out.println("3) Mostrar");
            System.out.println("4) Baja");
            System.out.println("5) salir ");
            opcion= new Scanner(System.in).nextInt();
            seleccionadorOpcion(opcion);
        }
    }
        private void seleccionadorOpcion(int opcion){
            switch(opcion){
                case 1:
                    System.out.println("Agregar");
                    System.out.print("Nombre: ");
                    String nombre=new Scanner(System.in).nextLine();
                    System.out.print("Clave: ");
                    String clave=new Scanner(System.in).nextLine();
                    Personal pe=new Personal(nombre, clave);
                   OperacionesPersonal  op=new OperacionesPersonal();
                   
                   op.agregarPersonal(pe);
                    break;
                case 2:
                    System.out.println("Consultar");
                    OperacionesPersonal  c=new OperacionesPersonal();
                    for(Personal p : c.getPersonal()){
            System.out.println(p);
                    }
                    break;
                    
                case 3:
                    System.out.println("Mostrar");
                    break;
                case 4:
                    System.out.println("Baja");
                    break;
                default:
                    System.out.println("opcion invalida");
                    break;
                
                case 5:
                    System.out.println("saliendo.....");
                    break;
            }
        }
    }
            
    
