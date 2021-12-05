package Controlador;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import Modelo.Datos;

public class Eliminar {
    public void deleteDato(int numero){
        EntityManager em;
        EntityManagerFactory emf;
        emf=Persistence.createEntityManagerFactory("jee_practica1PU");
        em=emf.createEntityManager();
        Datos d=em.find(Datos.class,numero);
        em.getTransaction().begin();
        em.remove(d);
        em.getTransaction().commit();
    }
}
