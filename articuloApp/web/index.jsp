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
                    <ul class="navbar-nav mr-auto text-center">
                        <li class="nav-item active"><a class="nav-link" href="index.jsp">Inicio
                                <span class="sr-only">(current)</span>
                            </a></li>
                        <li class="nav-item"><a class="nav-link" href="#">Finalidad
                                <span class="sr-only">(current)</span>
                            </a></li>
                        <li class="nav-item"><a class="nav-link" href="iniciarSesion.jsp">Iniciar
                                Sesión <span class="sr-only">(current)</span>
                            </a></li>
                        <li class="nav-item"><a class="nav-link" href="#">Ayuda
                                <span class="sr-only">(current)</span>
                            </a></li>
                    </ul>
                </div>
            </nav>

            <div id="carouselExampleIndicators" class="carousel slide padding" data-ride="carousel">
                <ol class="carousel-indicators">
                    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                </ol>
                <div class="carousel-inner">
                    <div class="carousel-item active" id="slider-principal">
                        <img class="d-block w-100" src="Image/slide1.jpg" alt="">
                    </div>
                    <div class="carousel-item" id="slider-principal">
                        <img class="d-block w-100" src="Image/slide2.jpg" alt="">
                    </div>
                    <div class="carousel-item" id="slider-principal">
                        <img class="d-block w-100" src="Image/slide3.jpg" alt="">
                    </div>
                </div>
                <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>
            <article class="padding">
                <div class="p-3 mb-2 bg-dark text-white">
                    <p class="text-justify">El excesivo espacio que ocupan estos artículos como lo son los libros, videojuegos y juegos de mesa por el acumulamiento una vez sus dueños ha perdido el interés en estos, genera una gran incomodidad en hogares, oficinas u otros lugares, llevando a que las personas los desechen de manera inadecuada sin importar el valor e importancia que pueden poseer estos artículos para otras personas.</p>
                </div>
            </article>
            <footer class="text-center">
                <small class="text-center">&copy;2018 derechos de ChechoSoft Colombia</small>
            </footer>
        </div>
    </body>
</html>
