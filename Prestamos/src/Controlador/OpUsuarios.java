package Controlador;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import Modelo.Usuario;
import java.util.List;
import javax.persistence.Query;

public class OpUsuarios {
    public void addUsuarios(String nombre,String domicilio, String aval, String domicilioAval, String telefonoAval){
        try {
            EntityManager em;
            EntityManagerFactory emf;
            emf = Persistence.createEntityManagerFactory("PrestamosPU");
            em = emf.createEntityManager();
            em.getTransaction().begin();
            Usuario u = new Usuario();
            u.setNombre(nombre);
            u.setDomicilio(domicilio);
            u.setAval(aval);
            u.setDomicilioaval(domicilioAval);
            u.setTelefonoaval(telefonoAval);
            em.persist(u);
            em.flush();
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error Prrooo: " + e.getMessage());
        }
    }

    public String[][] getDatos() {
        String[][] datos = null;
        try {
            EntityManager em;
            EntityManagerFactory emf;
            emf = Persistence.createEntityManagerFactory("PrestamosPU");
            em = emf.createEntityManager();
            Query query = em.createNamedQuery("Usuario.findAll");
            List<Usuario> listDatos = query.getResultList();
            datos = new String[listDatos.size()][6];
            int cont = 0;
            for (Usuario datos1 : listDatos) {
                datos[cont][0] = datos1.getIdusuario().toString();
                datos[cont][1] = datos1.getNombre();
                datos[cont][2] = datos1.getDomicilio();
                datos[cont][3] = datos1.getAval();
                datos[cont][4] = datos1.getDomicilioaval();
                datos[cont][5] = datos1.getTelefonoaval();
                cont++;
            }
        } catch (Exception e) {
            System.out.println("No se pudo prro: " + e.getMessage());
        }
        return datos;
    }

    public String[][] buscar(int num, String cad) {
        String[][] datos = null;
        try {
            EntityManager em;
            EntityManagerFactory emf;
            emf = Persistence.createEntityManagerFactory("PrestamosPU");
            em = emf.createEntityManager();
            Query query = null;
            switch (num) {
                case 0:
                    query = em.createNamedQuery("Usuario.findByIdusuario");
                    query.setParameter("idusuario", Integer.parseInt(cad));
                    break;
                case 1:
                    query = em.createNamedQuery("Usuario.findByNombre");
                    query.setParameter("nombre", cad);
                    break;
                case 2:
                    query = em.createNamedQuery("Usuario.findByDomicilio");
                    query.setParameter("domicilio", cad);
                    break;
                case 3:
                    query = em.createNamedQuery("Usuario.findByAval");
                    query.setParameter("aval", cad);
                    break;
                case 4:
                    query = em.createNamedQuery("Usuario.findByDomicilioaval");
                    query.setParameter("domicilioaval", cad);
                    break;
                case 5:
                    query = em.createNamedQuery("Usuario.findByTelefonoaval");
                    query.setParameter("telefonoaval", cad);
                    break;
            }
//        Query query = em.createNamedQuery("Usuario.findByIdusuario");
//        query.setParameter("idusuario", num);
            List<Usuario> listDatos = query.getResultList();
            datos = new String[listDatos.size()][6];
            int cont = 0;
            for (Usuario datos1 : listDatos) {
                datos[cont][0] = datos1.getIdusuario().toString();
                datos[cont][1] = datos1.getNombre();
                datos[cont][2] = datos1.getDomicilio();
                datos[cont][3] = datos1.getAval();
                datos[cont][4] = datos1.getDomicilioaval();
                datos[cont][5] = datos1.getTelefonoaval();
                cont++;
            }
        } catch (Exception e) {
            System.out.println("Error alv: "+e.getMessage());
        }
        //Datos datoClase = (Datos) query.getSingleResult();
        //dato=datoClase.getTexto();
        return datos;
    }
    
    public void updateDato(int idusuario,String nombre,String domicilio,String aval, String domicilioAval, String telefonoAval){
        EntityManager em;
        EntityManagerFactory emf;
        emf=Persistence.createEntityManagerFactory("PrestamosPU");
        em=emf.createEntityManager();
        Usuario dato=(Usuario)em.getReference(Usuario.class, idusuario);
        //dato.setTexto(d);
        dato.setNombre(nombre);
        dato.setDomicilio(domicilio);
        dato.setAval(aval);
        dato.setDomicilioaval(domicilioAval);
        dato.setTelefonoaval(telefonoAval);
        em.getTransaction().begin();
        em.persist(dato);
        em.getTransaction().commit();
    }
}
