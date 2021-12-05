
package com.gorilampard.pruebas;

import com.gorilampard.webservice.controlador.DaoRegistros;
import com.gorilampard.webservice.controlador.DaoUsuario;
import com.gorilampard.webservice.modelos.Registros;
import com.gorilampard.webservice.modelos.Usuarios;
import java.util.Date;


public class Prueba {
    public static void main(String[] args) {
//        Usuarios usuario = new Usuarios();
//        usuario.setNombre("Lampard");
//        usuario.setApellido("Lamas");
//        usuario.setCelular("3312454945");
//        usuario.setColonia("Santuario");
//        usuario.setDomicilio("Emiliano Zapata");
//        usuario.setEstado("Jalisco");
//        usuario.setFechaNacimiento("1997-10-03");
//        usuario.setPoblación("Magdalena");
//        usuario.setUsername("Lampard");
//        usuario.setPass("123");
        
        DaoUsuario dao = new DaoUsuario();
//        dao.addUsuario(usuario);
        for (Usuarios u: dao.getTodos()) {
            System.out.println("Nombre: "+u.getNombre());
            
        }
//        System.out.println(dao.getLogin("Frank","13"));
//        Usuarios u = dao.getLogin("Frank","123");
//        
//        Registros r = new Registros();
//        r.setFecha(new Date());
//        r.setUsuario(u);
//        DaoRegistros daor = new DaoRegistros();
//        daor.agregarRegistro(r);
//        
//        for(Registros reg: u.getRegistros()) {
//            System.out.println(reg.getFecha());
//        }
        System.out.println("Termino");
        
    }
}
