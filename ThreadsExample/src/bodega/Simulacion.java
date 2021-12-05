
package bodega;

import java.io.IOException;

public class Simulacion {
    public static void main(String[] args) throws IOException {
        Bodega b = new Bodega();
        cliente c1 = new cliente(b);
        Thread h1c = new Thread(c1);
        proveedor p1 = new proveedor(b);
        Thread h1p = new Thread(p1);
        
        h1c.start();
        h1p.start();
        
        int i = System.in.read();
        h1c.stop();
        h1p.stop();
    }
}
