
package com.gorilampard.webservice;

import com.google.gson.Gson;
import com.gorilampard.webservice.controlador.FacadeRest;
import com.gorilampard.webservice.modelos.Registros;
import com.gorilampard.webservice.modelos.RegistrosJson;
import com.gorilampard.webservice.modelos.ResultadoEstado;
import com.gorilampard.webservice.modelos.Usuarios;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import spark.Request;
import spark.Response;
import spark.Route;
import static spark.Spark.post;
import static spark.Spark.get;
import static spark.Spark.options;
import static spark.Spark.before;
import java.util.List;

/**
 *
 * @author falco
 */
public class Server {
    public final static String NAME_PERSISTENCE="com.gorilampard.usuariosdb";
//    private static void enableCORS(final String origin, final String methods, final String headers) {
//
//        options("/*", (request, response) -> {
//
//            String accessControlRequestHeaders = request.headers("Access-Control-Request-Headers");
//            if (accessControlRequestHeaders != null) {
//                response.header("Access-Control-Allow-Headers", accessControlRequestHeaders);
//            }
//
//            String accessControlRequestMethod = request.headers("Access-Control-Request-Method");
//            if (accessControlRequestMethod != null) {
//                response.header("Access-Control-Allow-Methods", accessControlRequestMethod);
//            }
//
//            return "OK";
//        });
//
//        before((request, response) -> {
//            response.header("Access-Control-Allow-Origin", origin);
//            response.header("Access-Control-Request-Method", methods);
//            response.header("Access-Control-Allow-Headers", headers);
//            // Note: this may or may not be necessary in your particular application
//            response.type("application/json");
//        });
//    }
    public static void main(String[] args) {
        System.out.println("Se incio correctamente.");
        new FacadeRest();
        //endpoint 1
        
        options("/*",
        (request, response) -> {

            String accessControlRequestHeaders = request
                    .headers("Access-Control-Request-Headers");
            if (accessControlRequestHeaders != null) {
                response.header("Access-Control-Allow-Headers",
                        accessControlRequestHeaders);
            }

            String accessControlRequestMethod = request
                    .headers("Access-Control-Request-Method");
            if (accessControlRequestMethod != null) {
                response.header("Access-Control-Allow-Methods",
                        accessControlRequestMethod);
            }

            return "OK";
        });

        before((request, response) -> {response.header("Access-Control-Allow-Origin", "*");response.type("application/json");});
        
        post("/login",new Route() {
            @Override
            public Object handle(Request rqst, Response rspns) throws Exception {
                rspns.type("application/json");
                System.out.println("Entrada: "+rqst.body());
                Usuarios usuario= new Gson().fromJson(rqst.body(), Usuarios.class);
                int estado = FacadeRest.loginUsuario(usuario);
                return new Gson().toJson(new ResultadoEstado(estado));
            }
        });
        
        post("/nuevo", new Route() {
            @Override
            public Object handle(Request rqst, Response rspns) throws Exception {
                rspns.type("application/json");
                System.out.println("Entrada: "+rqst.body());
                Usuarios usuario= new Gson().fromJson(rqst.body(), Usuarios.class);
                int estado = FacadeRest.agregarUsuario(usuario);
                return new Gson().toJson(new ResultadoEstado(estado));
            }
        });
        
        get("/historial", new Route() {
            @Override
            public Object handle(Request rqst, Response rspns) throws Exception {
                rspns.type("application/json");
                String param = rqst.queryParams("username");
                System.out.println("Parametro: "+param);
                List<Registros> lista = FacadeRest.getRegistrosPorUser(param);
                List<RegistrosJson> listaJson = new ArrayList<>();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-dd hh:mm");
                for (Registros registro: lista) {
                    RegistrosJson regJson = new RegistrosJson();
                    regJson.setFecha(sdf.format(registro.getFecha()));
                    listaJson.add(regJson);
                }
                return new Gson().toJson(listaJson);
                
            }
        });
        
        get("/datos", new Route() {
            @Override
            public Object handle(Request rqst, Response rspns) throws Exception {
                rspns.type("application/json");
                String param = rqst.queryParams("username");
                System.out.println("Parametro: "+param);
                Usuarios usario = FacadeRest.getDatosDeUsuario(param);
                usario.setRegistros(null);
                return new Gson().toJson(usario);
                
            }
        });
        
        
    }
}
