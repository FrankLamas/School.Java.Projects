/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import Modelo.Datos;

public class ConsultaIndividual {
    public String getDato(int num){
        String dato="";
        EntityManager em;
        EntityManagerFactory emf;
        emf=Persistence.createEntityManagerFactory("jee_practica1PU");
        em=emf.createEntityManager();
        Query query = em.createNamedQuery("Datos.findById");
        query.setParameter("id", num);
        Datos datoClase = (Datos) query.getSingleResult();
        dato=datoClase.getTexto();
        return dato;
    }
}
