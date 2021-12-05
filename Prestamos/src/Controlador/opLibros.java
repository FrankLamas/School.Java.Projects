package Controlador;

import Modelo.Libro;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class opLibros {
    public void addLibro(String clave,String titulo,String autor, int nejemplares){
        try {
            EntityManager em;
            EntityManagerFactory emf;
            emf = Persistence.createEntityManagerFactory("PrestamosPU");
            em = emf.createEntityManager();
            em.getTransaction().begin();
            Libro libro = new Libro();
            libro.setClave(clave);
            libro.setTitulo(titulo);
            libro.setAutor(autor);
            libro.setNejemplares(nejemplares);
            em.persist(libro);
            em.flush();
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("No se pudo prro: "+e.getMessage());
        }
    }
    public String[][] getDatos() {
        String[][] datos = null;
        try {
            EntityManager em;
            EntityManagerFactory emf;
            emf = Persistence.createEntityManagerFactory("PrestamosPU");
            em = emf.createEntityManager();
            Query query = em.createNamedQuery("Libro.findAll");
            List<Libro> listDatos = query.getResultList();
            datos = new String[listDatos.size()][4];
            int cont = 0;
            for (Libro datos1 : listDatos) {
                datos[cont][0] = datos1.getClave();
                datos[cont][1] = datos1.getTitulo();
                datos[cont][2] = datos1.getAutor();
                datos[cont][3] = String.valueOf(datos1.getNejemplares());
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
                    query = em.createNamedQuery("Libro.findByClave");
                    query.setParameter("clave", cad.toUpperCase());
                    break;
                case 1:
                    query = em.createNamedQuery("Libro.findByTitulo");
                    query.setParameter("titulo", cad);
                    break;
                case 2:
                    query = em.createNamedQuery("Libro.findByAutor");
                    query.setParameter("autor", cad);
                    break;
            }
//        Query query = em.createNamedQuery("Usuario.findByIdusuario");
//        query.setParameter("idusuario", num);
            List<Libro> listDatos = query.getResultList();
            datos = new String[listDatos.size()][6];
            int cont = 0;
            for (Libro datos1 : listDatos) {
                datos[cont][0] = datos1.getClave();
                datos[cont][1] = datos1.getTitulo();
                datos[cont][2] = datos1.getAutor();
                datos[cont][3] = String.valueOf(datos1.getNejemplares());
                cont++;
            }
        } catch (Exception e) {
            System.out.println("Error alv: "+e.getMessage());
        }
        //Datos datoClase = (Datos) query.getSingleResult();
        //dato=datoClase.getTexto();
        return datos;
    }
    
    public void updateDato(String clave,String titulo,String autor, int nejemplares){
        EntityManager em;
        EntityManagerFactory emf;
        emf=Persistence.createEntityManagerFactory("PrestamosPU");
        em=emf.createEntityManager();
        Libro dato=(Libro)em.getReference(Libro.class, clave.toUpperCase());
        //dato.setTexto(d);
        dato.setTitulo(titulo);
        dato.setAutor(autor);
        dato.setNejemplares(nejemplares);
        em.getTransaction().begin();
        em.persist(dato);
        em.getTransaction().commit();
    }
}
