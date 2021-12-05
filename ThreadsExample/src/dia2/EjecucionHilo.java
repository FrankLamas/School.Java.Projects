
package dia2;

public class EjecucionHilo {
    public static void main(String[] args) throws InterruptedException {
        Thread h1 = new Thread(new Hilo());
        h1.start();
        int i = 0;
        while(i!=100){
            System.out.println("Hilo Principal");
            Thread.sleep(500);
            i++;
        }
    }
}
