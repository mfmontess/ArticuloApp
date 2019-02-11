<%-- 
    Document   : cuenta
    Created on : 23/05/2018, 12:00:40 AM
    Author     : MICHAEL
--%>
<%@page import="java.util.*"%>
<%@page import="webservices.Cliente"%>
<%@page import="webservices.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cuenta</h1>
        <jsp:useBean id="ValidCliente" scope="session" class="webservices.Cliente" />
        <jsp:useBean id="ValidUsuario" scope="session" class="webservices.Usuario" />
        
        <div>
            <img src="Image/imagen.jpg" class="img-thumbnail img-responsive" width="50%" height="50%" alt="">
        </div>
        <div>
            <input type="text" name="usuario" class="form-control" id="usuario" value=<jsp:getProperty name="ValidUsuario" property="nombre" />
                                               placeholder="Nombre Usuario" required autofocus>
            <input type="password" name="password" class="form-control" id="password"
                                               placeholder="Contraseña" required>
            <input type="password" name="password" class="form-control" id="password"
                                               placeholder="Confirmar contraseña" required>
        </div>
        <div>
        <input type="text" name="email" class="form-control" id="email" value=<jsp:getProperty name="ValidCliente" property="correo" />
                                           placeholder="Correo electrónico" required autofocus>
        <input type="text" name="direccion" class="form-control" id="direccion" value=<jsp:getProperty name="ValidCliente" property="direccion" />
                                           placeholder="Dirección" required autofocus>
        <input type="number" name="telefono" step="13" class="form-control" id="telefono" value=<jsp:getProperty name="ValidCliente" property="telefono" />
                                           placeholder="Número de teléfono" required autofocus>
        </div>
        <div>
            <button type="submit" class="btn btn-success "><i class="fa fa-sign-in"></i>Actualizar</button>
            <button type="submit" class="btn btn-success "><i class="fa fa-sign-in"></i>Eliminar cuenta</button>
        </div>
    </body>
</html>
