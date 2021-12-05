package Server;

import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author falco
 */
public class Server {
    static final int PUERTO = 5555;
    private ServerSocket skServidor;
    private HiloConectado cliente;

    public Server() {
        try {
            skServidor = new ServerSocket(PUERTO);
            //skServidor.setSoTimeout(40000);
            System.out.println("Escucho Puerto: " + PUERTO);//se muestra por pantalla el puerto que esta escuchando
            while (true) {
                Socket skCliente = skServidor.accept(); // Crea objeto para atender a los clientes
                System.out.println("Nuevo cliente ha ingresado.");//se muestra a que clientes esta atendiendo
                cliente = new HiloConectado(skCliente);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] arg) {
        new Server();
    }
}
