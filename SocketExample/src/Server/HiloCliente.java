
package Server;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HiloCliente implements Runnable{

    DataInputStream entrada;
    

    public HiloCliente(Socket socket) {
        try {
            this.entrada = new DataInputStream(socket.getInputStream());
        } catch (Exception ex) {
            
        }
    }
    
    
    
    
    
    @Override
    public void run() {
        try {
            while(true){
                String texto = entrada.readUTF();
                System.out.println(texto);
            }
        } catch (Exception e) {
        }
    }
    
}
