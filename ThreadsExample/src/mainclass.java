
public class mainclass {
    public static void main(String[] args) {
        //para crear un hilo se necesita la instancia de Runnable
        EjemploHilos h = new EjemploHilos(1);
        EjemploHilos h2 = new EjemploHilos(2);
        Thread t = new Thread(h);
        Thread t2 = new Thread(h2);
        
        t.start();
        t2.start();
        while(true){
            Hilo2 h3 = new Hilo2();
        h3.start();
            System.out.println("Hilo Principal");
        }
    }
}
