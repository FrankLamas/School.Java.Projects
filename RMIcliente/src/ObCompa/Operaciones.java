package ObCompa;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Operaciones extends Remote{
    public String agregarDatoAlv() throws RemoteException;
    public Equipos obtenerEquipo() throws RemoteException;
    
}