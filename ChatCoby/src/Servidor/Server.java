/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    static final int PUERTO = 5555;
    private ServerSocket skServidor;
    private ClienteConectado cliente;

    public Server() {
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
        new Server();
    }
}
