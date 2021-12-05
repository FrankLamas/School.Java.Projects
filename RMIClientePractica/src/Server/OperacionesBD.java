
package Server;

import java.util.List;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface OperacionesBD extends Remote{
    //Este es el menu del restaurant :v
    public Boolean addDatos(Pedidos pedido) throws RemoteException;
    public List<Pedidos> mostrarDatos() throws RemoteException;
    public String[][] mostrar() throws RemoteException;
}
