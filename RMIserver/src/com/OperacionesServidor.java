package com;

import ObCompa.Equipos;
import ObCompa.Operaciones;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class OperacionesServidor extends UnicastRemoteObject implements Operaciones{

    public OperacionesServidor() throws RemoteException{
        super();
    }
    @Override
    public String agregarDatoAlv() {
        System.out.println("Se agrego alv.");
        return "Fue maravilloso";
    }

    @Override
    public Equipos obtenerEquipo() throws RemoteException {
        Equipos eq = new Equipos();
        eq.setClave(10);
        eq.setNombre("prro");
        return eq;
    }
    
}
