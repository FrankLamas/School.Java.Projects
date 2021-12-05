
package bodega;

import java.util.logging.Level;
import java.util.logging.Logger;

public class proveedor implements Runnable{
    private Bodega bodega;
    private int num;
    private static int numProducto=1;
    
    public proveedor(Bodega b){
        bodega=b;
        num=numProducto++;
    }

    @Override
    public void run() {
        char c;
        for (int i = 0; i < 200; i++) {
            c=(char) (Math.random()*26+'A');
            System.out.println("Proveedor: "+c);
            bodega.entrada(c);
            try {
                Thread.sleep((int)Math.random()*300);
            } catch (InterruptedException ex) {
                Logger.getLogger(proveedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
