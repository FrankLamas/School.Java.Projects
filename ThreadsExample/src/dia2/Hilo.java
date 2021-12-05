
package dia2;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Hilo implements Runnable{
    @Override
    public void run() {
        int i=0;
        while(true){
            System.out.println("Hilo Exerno Alv");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
            i++;
            if (i==100) {
                break;
            }
        }
    }
}
