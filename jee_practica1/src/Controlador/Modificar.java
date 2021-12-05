package Controlador;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import Modelo.Datos;

public class Modificar {
    public void updateDato(int n,String d){
        EntityManager em;
        EntityManagerFactory emf;
        emf=Persistence.createEntityManagerFactory("jee_practica1PU");
        em=emf.createEntityManager();
        Datos dato=(Datos)em.getReference(Datos.class, n);
        dato.setTexto(d);
        em.getTransaction().begin();
        em.persist(dato);
        em.getTransaction().commit();
    }
}
