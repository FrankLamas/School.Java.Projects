package Cliente;

import ObCompa.Equipos;
import ObCompa.Operaciones;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class cliente {
    public static void main(String[] args) throws RemoteException, NotBoundException {
        System.out.println("Buscando registro...");
        Registry reg = LocateRegistry.getRegistry("127.0.0.1",5001);
        Operaciones op = (Operaciones) reg.lookup("objRemoto");
        System.out.println("Ejecutando metodo");
        System.out.println("El servidor dice: "+op.agregarDatoAlv());
        Equipos eq = op.obtenerEquipo();
        System.out.println("Equipo: "+eq.getClave()+", "+eq.getNombre());
    }
}
