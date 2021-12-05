package javafor;
public class Suma { 
    import java.util.Scanner  
            public class main{
                public static void main(String[]args){
                    Scanner entrada = new Scanner(System.in);
                    int valor = 0;
                    int suma = 0;
                    for (int x =1; x<=10; x++){ 
                        System.out.println("Dame la calificacion"+x);
                        valor = entrada.nextlnt();
                        suma = suma+valor;
                    } 
                    double promedio = suma/10;
                    System.out.println("La suma de tus calificaciones es:" +suma);
                    System.out.println("Tu promedio es de:" +promedio);
                }
            } 
    
}
