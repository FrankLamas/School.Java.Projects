
package com.gorilampard.webservice.controlador;

import com.gorilampard.webservice.modelos.Registros;
import com.gorilampard.webservice.modelos.Usuarios;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FacadeRest {
    private static DaoUsuario daoU;
    private static DaoRegistros daoR;

    public FacadeRest()
    {
        daoU = new DaoUsuario();
        daoR = new DaoRegistros();
    }

    //Requerimiento
    public static int loginUsuario(Usuarios usuario)
    {
        usuario =  daoU.getLogin(usuario.getUsername(), usuario.getPass());
        if (usuario!=null) {
            Registros r = new Registros();
            r.setUsuario(usuario);
            r.setFecha(new Date());
            daoR.agregarRegistro(r);
        }
        int estado = usuario==null?0:1;
        return estado;
    }
    
    public static int agregarUsuario(Usuarios u)
    {
        Usuarios uExiste = daoU.existeUsuario(u.getUsername());
        if (uExiste==null) {
            if (daoU.addUsuario(u))
                return 1;
            else
                return 0;
        }else
            return 2;
    }
    
    public static List<Registros> getRegistrosPorUser(String username)
    {
        List<Registros> registros = new ArrayList<>();
        Usuarios usuario = daoU.existeUsuario(username);
        if (usuario!=null)
            registros = usuario.getRegistros();
        return registros;
    }
    
    public static Usuarios getDatosDeUsuario(String username)
    {
        Usuarios user = daoU.existeUsuario(username);
        return user;
    }
}
