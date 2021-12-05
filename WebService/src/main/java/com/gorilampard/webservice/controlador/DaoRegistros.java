package com.gorilampard.webservice.controlador;

import com.gorilampard.webservice.Server;
import com.gorilampard.webservice.modelos.Registros;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author falco
 */
public class DaoRegistros {
    public void agregarRegistro(Registros registro)
    {
        try {
            EntityManagerFactory factory = Persistence.createEntityManagerFactory(Server.NAME_PERSISTENCE);
            EntityManager em = factory.createEntityManager();
            em.getTransaction().begin();
            em.persist(registro);
            em.getTransaction().commit();
            em.close();
            factory.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
