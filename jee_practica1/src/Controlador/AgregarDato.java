package Controlador;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import Modelo.Datos;
public class AgregarDato {
    public void addDato(int num,String texto){
        EntityManager em;
        EntityManagerFactory emf;
        emf = Persistence.createEntityManagerFactory("jee_practica1PU");
        em=emf.createEntityManager();
        em.getTransaction().begin();
        Datos datos = new Datos();
        datos.setId(num);
        datos.setTexto(texto);
        em.persist(datos);
        em.flush();
        em.getTransaction().commit();
    }
}
