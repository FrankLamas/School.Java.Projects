
package bodega;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Bodega {
    private List<Character> bodega= new ArrayList<>();
    
    public synchronized void entrada(char c){
        bodega.add(c);
        this.notify();
    }
    
    public synchronized char salida(){
        char c;
        while(bodega.size()==0){
            try {
                this.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Bodega.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        c = bodega.remove(bodega.size()-1);
        return c;
    }
    
    
}
