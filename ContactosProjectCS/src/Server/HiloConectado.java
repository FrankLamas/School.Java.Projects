package Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class HiloConectado extends Thread {
    private static ArrayList<Socket> listaCliente = new ArrayList<Socket>();
    private Socket socket;
    private Operaciones op = new Operaciones();
    
    public HiloConectado(Socket socket) {//constructor del hilo
        listaCliente.add(socket);//vector que almacena todos los clientes para reenviar los mensajes
        this.socket = socket;//socket que conecta con el cliente
        start();
    }
    
    public void run() {
        try {
            boolean terminar = false;
            while (socket.isConnected()) {
                String mensaje = escuchar();//recibe los mensajes del cliente
                String[] prro = mensaje.split("#");//Corta la cadena por # para saber que se va a hacer
                OutputStream os;
                String respuesta ="NCPP";//Respuesta por defecto del servidor
                if (prro[0].equals("add")) { //Cuando el cliente pide agregar un usuario add#nombre;correo
                    op.agregarNuevo(prro[1]);
                    respuesta=op.valores();
                    reenviar(terminar, respuesta);
                }else if(prro[0].equals("b")){ //Cuando el cliente pide buscar b#cadenaabuscar
                    respuesta=op.buscar(prro.length==1?"":prro[1]);
                    os = socket.getOutputStream();//flujo de datos del socket
                    DataOutputStream flujoDOS = new DataOutputStream(os);//se asocia el flujo de datos a un flujo de escritura
                    flujoDOS.writeUTF(respuesta);
                }else if(prro[0].equals("a")){//Cuando el cliente pide una acutalización de los datos solo manda una a
                    respuesta=op.valores();
                    
                    os = socket.getOutputStream();//flujo de datos del socket
                    DataOutputStream flujoDOS = new DataOutputStream(os);//se asocia el flujo de datos a un flujo de escritura
                    flujoDOS.writeUTF(respuesta);
                }else{ //Respuesta en caso de error
                    os = socket.getOutputStream();//flujo de datos del socket
                    DataOutputStream flujoDOS = new DataOutputStream(os);//se asocia el flujo de datos a un flujo de escritura
                    flujoDOS.writeUTF(respuesta);
                }
                
                //envia el mensaje recibido a todos los clientes de la lista
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
    
    private void reenviar(boolean terminar, String mensaje) {
        OutputStream os;
        try {
            for (int cont = 0; cont < listaCliente.size(); cont++) {//bucle que recorre los clientes para enviarles el mensaje
                if (listaCliente.get(cont).isConnected()) {
                    os = listaCliente.get(cont).getOutputStream();//flujo de datos del socket
                    DataOutputStream flujoDOS = new DataOutputStream(os);//se asocia el flujo de datos a un flujo de escritura
                    flujoDOS.writeUTF(mensaje);//se escribe el mensaje
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //Se escucha constantemente el cliente
    private String escuchar() throws IOException {
        InputStream aux = socket.getInputStream(); // flujo de datos del socket
        DataInputStream flujo = new DataInputStream(aux); //se asocia el flujo de datos a un flujo de lectura
        return flujo.readUTF();//se lee el mensaje
    }
}
