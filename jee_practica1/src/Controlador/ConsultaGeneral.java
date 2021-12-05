package Controlador;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import Modelo.Datos;
import javax.persistence.Entity;
public class ConsultaGeneral {
    public String[][] getDatos(){
        String[][] datos = new String[20][2];
        EntityManager em;
        EntityManagerFactory emf;
        emf=Persistence.createEntityManagerFactory("jee_practica1PU");
        em=emf.createEntityManager();
        Query query = em.createNamedQuery("Datos.findAll");
        List<Datos> listDatos = query.getResultList();
        int cont=0;
        for(Datos datos1:listDatos){
            datos[cont][0]=datos1.getId().toString();
            datos[cont][1]=datos1.getTexto();
            cont++;
        }
        return datos;
    }
}
