<%-- 
    Document   : AddUsuario
    Created on : 24/04/2020, 10:37:14 AM
    Author     : falco
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% //Aquí va el codigo de java
            Date fecha = new Date();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");
            String fechafrm = formato.format(fecha);
            
            
        %>
        
        <form method="POST" action="ctrAddUsuario">
            Nombre <input type="text" name="nombre">
            <br>
            Password <input type="text" name="pass">
            <br><br>
            <input type="submit" value="Guardar">
        </form>
        La fecha es: <%out.print(fechafrm);%> 
    </body>
</html>
