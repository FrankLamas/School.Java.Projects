/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class ClienteConectado extends Thread {
    
    private static ArrayList<Socket> listaCliente = new ArrayList<Socket>();
    private Socket socket;

    public ClienteConectado(Socket socket) {//constructor del hilo
        listaCliente.add(socket);//vector que almacena todos los clientes para reenviar los mensajes
        this.socket = socket;//socket que conecta con el cliente
        start();
    }

    public void run() {
        try {
            boolean terminar = false;
            while (true) {
                String mensaje = escuchar();//recibe los mensajes del cliente
                reenviar(terminar, mensaje);//envia el mensaje recibido a todos los clientes de la lista
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    private void reenviar(boolean terminar, String mensaje) {
        OutputStream os;
        try {
            for (int cont = 0; cont < listaCliente.size(); cont++) {//bucle que recorre los clientes para enviarles el mensaje
                os = listaCliente.get(cont).getOutputStream();//flujo de datos del socket
                DataOutputStream flujoDOS = new DataOutputStream(os);//se asocia el flujo de datos a un flujo de escritura
                flujoDOS.writeUTF(mensaje);//se escribe el mensaje
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String escuchar() throws IOException {
        InputStream aux = socket.getInputStream(); // flujo de datos del socket
        DataInputStream flujo = new DataInputStream(aux); //se asocia el flujo de datos a un flujo de lectura
        return flujo.readUTF();//se lee el mensaje
    }
    
}
