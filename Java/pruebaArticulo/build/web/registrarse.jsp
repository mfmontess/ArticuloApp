<%-- 
    Document   : registrarse
    Created on : 22/05/2018, 07:16:13 PM
    Author     : MICHAEL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registrarse</h1>
        <br>
        <form role="form" method="POST" action="registro">
            <div>
                <input type="text" name="usuario" class="form-control" id="usuario"
                                                   placeholder="Nombre Usuario" required autofocus>
                <br>
                <input type="password" name="password" class="form-control" id="password"
                                                   placeholder="Contraseña" required>
                <br>
                <input type="password" name="password" class="form-control" id="password"
                                               placeholder="Confirmar contraseña" required>
            </div>
            <br>
            <div>
                <input type="text" name="nombre" class="form-control" id="nombre"
                                                   placeholder="Nombre Cliente" required autofocus>
                <br>
                <input type="text" name="email" class="form-control" id="email"
                                                   placeholder="Correo electrónico" required autofocus>
                <br>
                <input type="text" name="direccion" class="form-control" id="direccion"
                                                   placeholder="Dirección" required autofocus>
                <br>
                <input type="number" name="telefono" class="form-control" id="telefono"
                                               placeholder="Número de teléfono" required autofocus>
            </div>
            <div>
                <input class="form-check-input" type="checkbox"> Acepta terminos y condiciones</input>
                <button type="submit" class="btn btn-success ">Registrarse</button>
            </div>
            <br>
            <div>
                <%
                    HttpSession sesion= request.getSession();
                    if(sesion.getAttribute("error") != null){   
                        out.println("<label>Error en el registro.</label>");
                    }
                %>
            </div>
        </form>
    </body>
</html>
