package principal;

/**
 *Operaciones de el menu
 * @author Carlos
 */
public class Cuenta {
    
    private int saldo=0;
    
    public void  HacerDeposito(int cuenta){
         saldo+=cuenta;
       
    }
    public  void RetirarSaldo(int a){
          saldo-=a;   
    }

    @Override
    public String toString() {
        return "Tu saldo es: "+ saldo;
    }

        
}
