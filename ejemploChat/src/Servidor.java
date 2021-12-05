
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

    static final int PUERTO = 5555;
    private ServerSocket skServidor;
    private ClienteConectado cliente;

    public Servidor() {
        try {
            skServidor = new ServerSocket(PUERTO);
            //skServidor.setSoTimeout(40000);
            System.out.println("Escuchouerto " + PUERTO);//se muestra por pantalla el puerto que esta escuchando
            while (true) {//bucle para contar tres clientes
                Socket skCliente = skServidor.accept(); // Crea objeto para atender a los clientes
                System.out.println("Nuevo cliente ha ingresado.");//se muestra a que clientes esta atendiendo
                cliente = new ClienteConectado(skCliente);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] arg) {
        new Servidor();
    }
}
