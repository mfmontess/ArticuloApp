<!DOCTYPE html>
<html lang="es">
    <head>
        <%@page contentType="text/html"%>
        <%@page pageEncoding="UTF-8"%>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Artículo app</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="estilos/estilos.css">
        <link rel="stylesheet"
              href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
        <script
        src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script
        src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
        <script
        src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
    </head>
    <body class="body-background">
        <div class="container">
            <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
                <div class="navbar-header">
                    <a class="navbar-brand" href="indexIniciada.jsp">Artí­culo app</a>
                </div>
                <div class="navbar">
                    <button class="navbar-toggler" type="button" data-toggle="collapse"
                            data-target="#navbarSupportedContent"
                            aria-controls="navbarSupportedContent" aria-expanded="false"
                            aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                </div>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto text-center">
                        <li class="nav-item"><a class="nav-link" href="indexIniciada.jsp">Inicio
                                <span class="sr-only">(current)</span>
                            </a></li>
                        <li class="nav-item"><a class="nav-link" href="#">Finalidad
                                <span class="sr-only">(current)</span>
                            </a></li>
                        <li class="nav-item dropdown active">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                Mi Perfil
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <a class="dropdown-item" href="cuenta.jsp">Cuenta</a>
                                <a class="dropdown-item" href="misSolicitudes.jsp">Mis solicitudes</a>
                                <a class="dropdown-item" href="misArticulos.jsp">Mis artículos</a>
                                <a class="dropdown-item" href="registrarArticulo.jsp">Registrar artículos</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="index.jsp">Cerrar sesión</a>
                            </div>
                        </li>
                        <li class="nav-item"><a class="nav-link" href="#">Artí­culos disponibles
                                <span class="sr-only">(current)</span>
                            </a></li>
                        <li class="nav-item"><a class="nav-link" href="#">Ayuda
                                <span class="sr-only">(current)</span>
                            </a></li>
                    </ul>
                </div>
            </nav>
            <div class="padding">
              <h1 class="text-center">Mis solicitudes</h1>
            </div>
            <c:forEach items="${solicitudes}" var="solicitud">
                <div class="">
                    <aside class="">
                        <div class="form-group">
                            <%-- <img src="Image/${solicitud.articuloEmisor.foto}" class="img-thumbnail"alt=""> --%>
                            <img src="Image/libro.jpg" class="portadas" alt="">
                        </div>
                    </aside>
                </div>
                <div class="form-group">
                    <fieldset class="scheduler-border">
                        <legend class="scheduler-border">Descripción del articulo</legend>
                        <article class="padding">
                            <%-- <p class="text-justify">${solicitud.descripcion}</p> --%>
                            <p class="text-justify">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                        </article>
                        <footer class="text-right">
                            <div class="btn-group btn-group-sm">
                                <button type="button" class="btn btn-success">Aceptar</button>
                                <button type="button" class="btn btn-warning">Rechazar</button>
                                <button type="button" class="btn btn-danger">Cancelar</button>
                            </div>
                        </footer>
                    </fieldset>
                </div>
            </c:forEach>
        </div>
        <footer class="text-center">
            <small class="text-center">&copy;2018 derechos de ChechoSoft Colombia</small>
        </footer>
    </body>
</html>
