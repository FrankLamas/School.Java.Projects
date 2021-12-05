package Controlador;

import Modelo.Prestamo;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class OpPrestamos {
    
    public void addPrestamo(String clave, int idu){
        try {
            EntityManager em;
            EntityManagerFactory emf;
            emf = Persistence.createEntityManagerFactory("PrestamosPU");
            em = emf.createEntityManager();
            em.getTransaction().begin();
            Prestamo p = new Prestamo();
            p.setClave(clave);
            p.setIdusuario(idu);
            p.setEstado("Pendiente");
            Date date = new Date();
            DateFormat df = new SimpleDateFormat("dd/MM/yy");
            System.out.println(df.format(date));
            Calendar c = Calendar.getInstance();
            c.setTime(date);
            c.add(Calendar.DAY_OF_YEAR, 15);
            System.out.println(df.format(c.getTime()));
            p.setFecha(df.format(date));
            p.setFechaentrega(df.format(c.getTime()));
            em.persist(p);
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
            Query query = em.createNamedQuery("Prestamo.findAll");
            List<Prestamo> listDatos = query.getResultList();
            datos = new String[listDatos.size()][6];
            int cont = 0;
            for (Prestamo datos1 : listDatos) {
                datos[cont][0] = datos1.getIdprestamo().toString();
                datos[cont][1] = datos1.getFecha();
                datos[cont][2] = datos1.getFechaentrega();
                datos[cont][3] = datos1.getEstado();
                datos[cont][4] = datos1.getClave();
                datos[cont][5] = String.valueOf(datos1.getIdusuario());
                
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
                    query = em.createNamedQuery("Prestamo.findByIdprestamo");
                    query.setParameter("idprestamo", Integer.parseInt(cad));
                    break;
                case 1:
                    query = em.createNamedQuery("Prestamo.findByFecha");
                    query.setParameter("fecha", cad);
                    break;
                case 2:
                    query = em.createNamedQuery("Prestamo.findByFechaentrega");
                    query.setParameter("fechaentrega", cad);
                    break;
                case 3:
                    query = em.createNamedQuery("Prestamo.findByEstado");
                    query.setParameter("estado", cad);
                    break;
                case 4:
                    query = em.createNamedQuery("Prestamo.findByClave");
                    query.setParameter("clave", cad);
                    break;
                case 5:
                    query = em.createNamedQuery("Prestamo.findByIdusuario");
                    query.setParameter("idusuario", Integer.parseInt(cad));
                    break;
            }
//        Query query = em.createNamedQuery("Usuario.findByIdusuario");
//        query.setParameter("idusuario", num);
            List<Prestamo> listDatos = query.getResultList();
            datos = new String[listDatos.size()][6];
            int cont = 0;
            for (Prestamo datos1 : listDatos) {
                datos[cont][0] = datos1.getIdprestamo().toString();
                datos[cont][1] = datos1.getFecha();
                datos[cont][2] = datos1.getFechaentrega();
                datos[cont][3] = datos1.getEstado();
                datos[cont][4] = datos1.getClave();
                datos[cont][5] = String.valueOf(datos1.getIdusuario());
                cont++;
            }
        } catch (Exception e) {
            System.out.println("Error alv: "+e.getMessage());
        }
        //Datos datoClase = (Datos) query.getSingleResult();
        //dato=datoClase.getTexto();
        return datos;
    }
    
    public void updateDato(int idprestamo, String Estado){
        EntityManager em;
        EntityManagerFactory emf;
        emf=Persistence.createEntityManagerFactory("PrestamosPU");
        em=emf.createEntityManager();
        Prestamo dato=(Prestamo)em.getReference(Prestamo.class, idprestamo);
        //dato.setTexto(d);
        dato.setEstado(Estado);
        em.getTransaction().begin();
        em.persist(dato);
        em.getTransaction().commit();
    }
}
