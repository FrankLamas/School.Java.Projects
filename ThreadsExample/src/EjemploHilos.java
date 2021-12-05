/**
 *
 * @author falco
 */
public class EjemploHilos implements Runnable{
    //Es el metodo main del hijo alv!
    int i;
    
    public EjemploHilos(int i){
        this.i=i;
    }
    @Override
    public void run() {
        while(true){
            System.out.println("Hilo Externo"+i);
        }
    }
    
    
    
}
