<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>Art�culo app</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet"
              href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
        <script
        src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script
        src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
        <script
        src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container">
            <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
                <a class="navbar-brand" href="indexIniciada.jsp">Art�culo app</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse"
                        data-target="#navbarSupportedContent"
                        aria-controls="navbarSupportedContent" aria-expanded="false"
                        aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto text-center">
                        <li class="nav-item active"><a class="nav-link" href="#">Finalidad
                                <span class="sr-only">(current)</span>
                            </a></li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                Mis solicitudes
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <a class="dropdown-item" href="cuenta.jsp">Cuenta</a>
                                <a class="dropdown-item" href="misSolicitudes.jsp">Mis solicitudes</a>
                                <a class="dropdown-item" href="misArticulos.jsp">Mis art�culos</a>
                                <a class="dropdown-item" href="registrarArticulo.jsp">Registrar art�culo</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="index.jsp">Cerrar sesion</a>
                            </div>
                        </li>
                        <li class="nav-item active"><a class="nav-link" href="#">Art�culos disponibles
                                <span class="sr-only">(current)</span>
                            </a></li>
                        <li class="nav-item active"><a class="nav-link" href="#">Ayuda
                                <span class="sr-only">(current)</span>
                            </a></li>
                    </ul>
                </div>
            </nav>
            <h2>Mis solicitudes</h2>
            <c:forEach items="${solicitudes}" var="solicitud">
                <div class="container-fluid" style="margin:20px">
                    <div class="row">
                        <div class="col">

                            <div style="margin:10px" >
                                <img src="Image/${solicitud.articuloEmisor.foto}" class="img-thumbnail"alt="">
                            </div>
                        </div>
                        <div class="col-md-10 border border-dark">
                            <div class="" style="margin:10px">
                                <h4 >Descripci�n del articulo</h4>
                                <p>${solicitud.descripcion}</p>
                                <div class="btn-group btn-group-sm">
                                    <button type="button" class="btn btn-success">Aceptar</button>
                                    <button type="button" class="btn btn-warning">Rechazar</button>
                                    <button type="button" class="btn btn-danger">Cancelar</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </c:forEach>
            <div class="container-fluid" style="margin:20px">
                <div class="row">
                    <div class="col">

                        <div style="margin:10px" >
                            <img src="Image/libro.jpg" class="img-thumbnail"alt="">
                        </div>
                    </div>
                    <div class="col-md-10 border border-dark">
                        <div class="" style="margin:10px">
                            <h4 >Descripci�n del articulo</h4>
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                            <div class="btn-group btn-group-sm">
                                <button type="button" class="btn btn-success">Aceptar</button>
                                <button type="button" class="btn btn-warning">Rechazar</button>
                                <button type="button" class="btn btn-danger">Cancelar</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="container-fluid" style="margin:20px">
                <div class="row">
                    <div class="col">
                        <div style="margin:10px" >
                            <img src="Image/game.jpg" class="img-thumbnail"alt="">
                        </div>
                    </div>
                    <div class="col-md-10 border border-dark">
                        <div class="" style="margin:10px">
                            <h4 >Descripci�n del articulo</h4>
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                            <div class="btn-group btn-group-sm">
                                <button type="button" class="btn btn-success">Aceptar</button>
                                <button type="button" class="btn btn-warning">Rechazar</button>
                                <button type="button" class="btn btn-danger">Cancelar</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
