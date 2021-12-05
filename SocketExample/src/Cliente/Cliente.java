
package Cliente;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        try {
            System.out.println("Conectando...");
            DataOutputStream salida;
            Socket socket = new Socket("127.0.0.1",5555);
            ///Aquí viene lo chido/////
            String cad = "";
            salida = new DataOutputStream(socket.getOutputStream());
            do {
                System.out.println("Dame un saludo: ");
                cad = new Scanner(System.in).nextLine();
                salida.writeUTF("Frank dice: "+cad);
            } while (!cad.equals("SALIR"));
            socket.close();
            
        } catch (Exception e) {
            System.out.println("No se pudo conectar."+e.getMessage());
            e.printStackTrace();
        }
    }
}
