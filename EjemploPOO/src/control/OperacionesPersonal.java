
package control;

import java.util.List;
import modelos.BDVirtual;
import modelos.Personal;

/**
 *
 * @author Laboratorio
 */
public class OperacionesPersonal {
    
   public boolean agregarPersonal(Personal p)
   {
       BDVirtual.datos.add(p);
       return true;
}
   public List<Personal> getPersonal(){
       return BDVirtual.datos;
   }
   
}