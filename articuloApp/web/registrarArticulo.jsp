<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>Artículo app</title>
        <meta name="viewport" content="width=device-width, initial-scal e=1">
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
                <a class="navbar-brand" href="indexIniciada.jsp">Artículo app</a>
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
                                Registrar artículo
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <a class="dropdown-item" href="cuenta.jsp">Cuenta</a>
                                <a class="dropdown-item" href="misSolicitudes.jsp">Mis solicitudes</a>
                                <a class="dropdown-item" href="misArticulos.jsp">Mis artículos</a>
                                <a class="dropdown-item" href="registrarArticulo.jsp">Registrar artículo</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="index.jsp">Cerrar sesion</a>
                            </div>
                        </li>
                        <li class="nav-item active"><a class="nav-link" href="#">Artículos disponibles
                                <span class="sr-only">(current)</span>
                            </a></li>
                        <li class="nav-item active"><a class="nav-link" href="#">Ayuda
                                <span class="sr-only">(current)</span>
                            </a></li>
                    </ul>
                </div>
            </nav>

            <h2>Registrar artículo</h2>
            <br>
            <div class="container-fluid" style="margin:20px">
                <div class="row">
                    <div class="col">
                        <div style="margin:10px" >
                            <img src="Image/mesa.png" class="img-thumbnail"alt="">
                        </div>
                    </div>
                    <div class="col-md-10 border border-dark">
                        <div class="" style="margin:10px">
                            <h4>Descripción del artículo</h4>
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Nombre del artículo" id="nomArticulo">
                            </div>
                            <div class="form-group">
                                <textarea class="form-control" rows="5" placeholder="Descripción del artículo" id="descripcionArticulo"></textarea>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div Align="right">
                <a href="registrarArticulo.jsp"><button type="submit" class="btn btn-success"><i class="fa fa-sign-in"></i>Registrar</button></a>
            </div>
        </div>
    </body>
</html>
