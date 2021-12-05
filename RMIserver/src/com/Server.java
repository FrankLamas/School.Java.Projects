
package com;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) throws RemoteException {
        System.out.println("Abriendo servidor alv prro...");
        OperacionesServidor op = new OperacionesServidor();
        Registry registry = LocateRegistry.createRegistry(5001);
        registry.rebind("objRemoto", op);
    }
}
