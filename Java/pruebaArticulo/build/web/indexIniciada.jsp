<%-- 
    Document   : indexIniciada
    Created on : 22/05/2018, 07:15:44 PM
    Author     : MICHAEL
--%>

<%@page import="java.util.*"%>
<%@page import="webservices.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="ValidUsuario" scope="session" class="webservices.Usuario" />
        <h1 align="right">| Hola 
            <jsp:getProperty name="ValidUsuario" property="nombre" />
        </h1>
        <h1>Inicio</h1>
        <div>
            <a href="cuenta.jsp">Cuenta</a>
            <a href="misSolicitudes.jsp">Mis solicitudes</a>
            <a href="misArticulos.jsp">Mis artículos</a>
            <a href="registrarArticulo.jsp">Registrar artículo</a>            
            <a href="index.jsp">Cerrar sesión</a>
        </div>
    </body>
</html>
