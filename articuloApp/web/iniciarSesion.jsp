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
                    <a class="navbar-brand" href="index.jsp">Artículo app</a>
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
                    <ul class="navbar-nav mc-auto text-center">
                        <li class="nav-item"><a class="nav-link" href="index.jsp">Inicio
                                <span class="sr-only">(current)</span>
                            </a></li>
                        <li class="nav-item"><a class="nav-link" href="#">Finalidad
                                <span class="sr-only">(current)</span>
                            </a></li>
                        <li class="nav-item active"><a class="nav-link" href="iniciarSesion.jsp">Iniciar
                                Sesión <span class="sr-only">(current)</span>
                            </a></li>
                        <li class="nav-item"><a class="nav-link" href="#">Ayuda
                                <span class="sr-only">(current)</span>
                            </a></li>
                    </ul>
                </div>
            </nav>

            <div class="container">
                <div class="row">
                    <div class="col-md-3"></div>
                    <div class="col-md-6">
                        <fieldset class="scheduler-border">
                            <legend class="scheduler-border">Iniciar Sesión</legend>
                            <form class="form-horizontal" role="form" method="POST" action="iniciarSesion">
                                <div class="center-input">
                                    <div class="form-group">
                                        <label class="" for="nombreUsuario">
                                            <input type="text" class="form-control" name="nombreUsuario" value="" placeholder="Usuario" id="nombreUsuario" required autofocus>
                                        </label>
                                    </div>
                                    <div class="form-group">
                                        <label for="contrasena">
                                            <input type="password" class="form-control" name="contrasena" value="" placeholder="Contraseña" id="contrasena" required>
                                        </label>
                                    </div>

                                </div>
                                <footer class="text-center">
                                    <div class="form-group">
                                        <label for="enviar">
                                            <input type="submit" class="btn btn-success" name="enviar" value="Iniciar Sesión">
                                        </label>
                                    </div>
                                    <a href="registrarse.jsp">Registrarse</a>,
                                    <a href="/password/reset">Olvidé contraseña</a>
                                </footer>
                            </form>
                        </fieldset>
                    </div>
                </div>
            </div>
        </div>
        <footer class="text-center">
            <small class="text-center">&copy;2018 derechos de ChechoSoft Colombia</small>
        </footer>
    </body>
</html>
