<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Artículo app</title>
        <meta charset="utf-8">
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
                <a class="navbar-brand" href="index.jsp">Artículo app</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse"
                        data-target="#navbarSupportedContent"
                        aria-controls="navbarSupportedContent" aria-expanded="false"
                        aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mc-auto text-center">
                        <li class="nav-item active"><a class="nav-link" href="#">Finalidad
                                <span class="sr-only">(current)</span>
                            </a></li>
                        <li class="nav-item active"><a class="nav-link" href="iniciarSesion.jsp">Iniciar
                                Sesión <span class="sr-only">(current)</span>
                            </a></li>
                        <li class="nav-item active"><a class="nav-link" href="#">Ayuda
                                <span class="sr-only">(current)</span>
                            </a></li>
                    </ul>
                </div>
            </nav>

            <div class="container">
                <form class="form-horizontal" role="form" method="POST" action="/login">
                    <div class="row">
                        <div class="col-md-3"></div>
                        <div class="col-md-6">
                            <h2>Iniciar Sesión</h2>
                            <hr>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-3"></div>
                        <div class="col-md-6">
                            <div class="form-group has-danger">
                                <label class="sr-only" for="email">E-Mail Address</label>
                                <div class="input-group mb-2 mr-sm-2 mb-sm-0">
                                    <div class="input-group-addon" style="width: 2.6rem"><i class="fa fa-at"></i></div>
                                    <input type="text" name="email" class="form-control" id="email"
                                           placeholder="Usuario" required autofocus>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-3">
                            <div class="form-control-feedback">
                                <span class="text-danger align-middle">
                                    <i class="fa fa-close"></i>
                                </span>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-3"></div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <label class="sr-only" for="password">Password</label>
                                <div class="input-group mb-2 mr-sm-2 mb-sm-0">
                                    <div class="input-group-addon" style="width: 2.6rem"><i class="fa fa-key"></i></div>
                                    <input type="password" name="password" class="form-control" id="password"
                                           placeholder="Contraseña" required>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-3">
                            <div class="form-control-feedback">
                                <span class="text-danger align-middle">
                                    <!-- Put password error message here -->
                                </span>
                            </div>
                        </div>
                    </div>
                    <div class="row" style="padding-top: -3rem">
                        <div class="col-md-5"></div>
                        <div class="col-md-6">
                            <a class="btn btn-link" href="registrarse.html">Registrarse</a>
                            <a class="btn btn-link" href="/password/reset">Olvidé contraseña</a> <br>
                            <a href="indexIniciada.jsp"><button type="submit" class="btn btn-success"><i class="fa fa-sign-in"></i>Iniciar Sesion</button></a>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
