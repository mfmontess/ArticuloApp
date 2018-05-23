<%-- 
    Document   : iniciarSesion
    Created on : 22/05/2018, 06:59:50 PM
    Author     : MICHAEL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Prueba</title>
    </head>
    <body>
        <h1>Iniciar Sesión</h1>
        <br>
        <form role="form" method="POST" action="iniciarSesion">
            <div>
                <input type="text" name="nombreUsuario" value="" placeholder="Usuario" id="nombreUsuario" required autofocus>
                <br>
                <input type="password" name="contrasena" value="" placeholder="Contraseña" id="contrasena" required>
            </div>
            <br>
            <div>
                <input type="submit" name="enviar" value="Iniciar Sesión">
            </div>
            <br>
            <div>
                <%
                    HttpSession sesion= request.getSession();
                    if(sesion.getAttribute("error") != null){   
                        out.println("<label>Usuario o contraseña invalidos.</label>");
                    }
                %>
            </div>
            <br>
            <div>
                <a href="registrarse.jsp">Registrarse</a>
            </div>
        </form>
    </body>
</html>
