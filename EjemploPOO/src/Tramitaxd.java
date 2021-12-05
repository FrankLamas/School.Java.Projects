import java.util.*;

/**
 *
 * @author Blaner
 */
public class Tramitaxd {

    public static void main(String args[]) {
        Scanner tcl = new Scanner(System.in);
        int n;

        System.out.println("ingrese el tamaño de la trama:");
        n = tcl.nextInt();
        int data[] = new int[n];
        System.out.println("ingresa cada numero de la trama:");
        for (int i = 0; i < n; i++) {
            System.out.println("ingresa el numero de la posicion " + (n - i) + ":");
            data[i] = tcl.nextInt();
        }

        System.out.println("ingresa el tamaño del polinomio:");
        n = tcl.nextInt();
        int divisor[] = new int[n];
        System.out.println("ingresa cada numero del polinomio:");
        for (int i = 0; i < n; i++) {
            System.out.println("ingresa el numero " + (n - i) + ":");
            divisor[i] = tcl.nextInt();
        }
        System.out.println("La trama es:");
        int tam[] = divide(data, divisor);
        for (int i = 0; i < tam.length - 1; i++) {
            
            System.out.print(tam[i]);
            
        }
        System.out.println("\n el codigo es: ");

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
        }
        for (int i = 0; i < tam.length - 1; i++) {
            System.out.print(tam[i]);
        }
        System.out.println();
        int sent_data[] = new int[data.length + tam.length - 1];
        System.out.println("ingresa el trama a enviar:");
        for (int i = 0; i < sent_data.length; i++) {
            System.out.println("ingresa los numeros " + (sent_data.length - i)
                    + ":");
            sent_data[i] = tcl.nextInt();
        }
        recibe(sent_data, divisor);
    }

    static int[] divide(int old_data[], int divisor[]) {
        int tam[], i;
        int data[] = new int[old_data.length + divisor.length];
        System.arraycopy(old_data, 0, data, 0, old_data.length);
        tam = new int[divisor.length];
        // xd me volvi loco
        System.arraycopy(data, 0, tam , 0, divisor.length);

        for (i = 0; i < old_data.length; i++) {
            System.out.println((i + 1) + ".) el primer numero es : "
                    + tam[0]);
            System.out.print("residuo : ");
            if (tam[0] == 1) {
                // aqui pasa algo, pero no me acuerdo
                for (int j = 1; j < divisor.length; j++) {
                    tam[j - 1] = exor(tam[j], divisor[j]);
                    System.out.print(tam[j - 1]);
                }
            } else {
                for (int j = 1; j < divisor.length; j++) {
                    tam[j - 1] = exor(tam[j], 0);
                    System.out.print(tam[j - 1]);
                }
            }
            tam[divisor.length - 1] = data[i + divisor.length];
            System.out.println(tam[divisor.length - 1]);
        }
        return tam;
    }

    static int exor(int a, int b) {
        if (a == b) {
            return 0;
        }
        return 1;
    }

    static void recibe(int data[], int divisor[]) {
        int tam[] = divide(data, divisor);
              for (int i = 0; i < tam.length; i++) {
            if (tam[i] != 0) {
                System.out.println("hay un error con el dato...");
                return;
            }
        }
        //:´v no sé que hice pero creo que sirve, pasame :´v
        System.out.println(":v si funciono xd no sé como, pero funciono.");
    }
}
