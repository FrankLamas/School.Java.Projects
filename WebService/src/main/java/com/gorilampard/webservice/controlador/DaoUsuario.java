package com.gorilampard.webservice.controlador;

import com.gorilampard.webservice.Server;
import com.gorilampard.webservice.modelos.Usuarios;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author falco
 */
public class DaoUsuario {
    public boolean addUsuario(Usuarios usuario) 
    {
        try {
            EntityManagerFactory factory = Persistence.createEntityManagerFactory(Server.NAME_PERSISTENCE);
            EntityManager em = factory.createEntityManager();
            em.getTransaction().begin();
            em.persist(usuario);
            em.getTransaction().commit();
            em.close();
            factory.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return false;
        }
    }
    
    public List<Usuarios> getTodos()
    {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory(Server.NAME_PERSISTENCE);
        EntityManager em = factory.createEntityManager();
        Query q = em.createQuery("select u from Usuarios u");
        List<Usuarios> lista = q.getResultList();
        em.close();
        factory.close();
        return lista;
    }
    
    public Usuarios existeUsuario(String username)
    {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory(Server.NAME_PERSISTENCE);
        EntityManager em = factory.createEntityManager();
        Query q = em.createQuery("select u from Usuarios u where u.username=:Usuario");
        q.setParameter("Usuario",username);
        Usuarios u;
        try {
            u=(Usuarios) q.setMaxResults(1).getSingleResult();
        } catch (NoResultException e) {
            System.out.println(e.getMessage());
            u=null;
        }finally{
            em.close();
            factory.close();
        }
        return u;
    }
    
    public Usuarios getLogin(String username,String pass)
    {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory(Server.NAME_PERSISTENCE);
        EntityManager em = factory.createEntityManager();
        Query q = em.createQuery
        ("select u from Usuarios u where u.username=:Usuario AND u.pass=:Password");
        q.setParameter("Usuario",username);
        q.setParameter("Password", pass);
        Usuarios u;
        try {
            u=(Usuarios) q.setMaxResults(1).getSingleResult();
        } catch (NoResultException e) {
            System.out.println(e.getMessage());
            u=null;
        }finally{
            em.close();
            factory.close();
        }
        return u;
    }
    
    
}
