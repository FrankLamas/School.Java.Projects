/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

/**
 *
 * @author falco
 */
public class hiloChats implements Runnable{
    public Cliente cliente;
    Socket socket;
    public hiloChats(Cliente cliente,Socket socket){
        this.cliente = cliente;
        this.socket=socket;
    }

    @Override
    public void run() {
        try {
            while (true) {//bucle para continuar la lectura
                InputStream aux = socket.getInputStream(); // flujo de datos del socket
                DataInputStream flujo = new DataInputStream(aux); //se asocia el flujo de datos a un flujo de lectura
                cliente.agregarMSN(flujo.readUTF()+"\n");
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
    
}
