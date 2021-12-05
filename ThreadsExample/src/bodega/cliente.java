
package bodega;

import java.util.logging.Level;
import java.util.logging.Logger;

public class cliente implements Runnable{
    private Bodega bodega;
    private int num;
    private static int numCliente=1;
    
    public cliente(Bodega b){
        bodega=b;
        num=numCliente++;
    }

    @Override
    public void run() {
        char c;
        for (int i = 0; i < 200; i++) {
            c=bodega.salida();
            System.out.println("Cliente "+num+": "+c);
            try {
                Thread.sleep((int)Math.random()*300);
            } catch (InterruptedException ex) {
                Logger.getLogger(cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
    
    
}
