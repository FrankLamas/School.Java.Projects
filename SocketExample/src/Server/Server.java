package Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    
    public static void main(String[] args) {
        try{
            System.out.println("Tratando de usar socket");
            ServerSocket server = new ServerSocket(5555);
            while(true){
                Socket socket = server.accept();
                System.out.println("Entró un cliente.");
                HiloCliente cliente = new HiloCliente(socket);
                Thread t = new Thread(cliente);
                t.start();
            }
            //socket.close();
            //System.out.println("Terminó bien");
        }catch(Exception e){
            System.out.println("Hubo un error "+e.getMessage());
            e.printStackTrace();
        }
    }
}
