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
                  <a class="navbar-brand" href="indexIniciada.jsp">Artículo app</a>
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
                      <li class="nav-item active"><a class="nav-link" href="finalidadIniciada.jsp">Finalidad
                              <span class="sr-only">(current)</span>
                          </a></li>
                      <li class="nav-item dropdown">
                          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                              Mi Perfil
                          </a>
                          <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                              <a class="dropdown-item" href="cuenta.jsp">Cuenta</a>
                              <a class="dropdown-item" href="misSolicitudes.jsp">Mis solicitudes</a>
                              <a class="dropdown-item" href="misArticulos.jsp">Mis artículos</a>
                              <a class="dropdown-item" href="registrarArticulo.jsp">Registrar artículo</a>
                              <div class="dropdown-divider"></div>
                              <a class="dropdown-item" href="index.jsp">Cerrar sesión</a>
                          </div>
                      </li>
                      <li class="nav-item"><a class="nav-link" href="articulosDisponibles.jsp">Artículos disponibles
                              <span class="sr-only">(current)</span>
                          </a></li>
                      <li class="nav-item"><a class="nav-link" href="#">Ayuda
                              <span class="sr-only">(current)</span>
                          </a></li>
                  </ul>
              </div>
          </nav>
            <div class="padding">
                <h1>Proyecto</h1>
            </div>
            <article class="padding">
                <div class="p-3 mb-2 bg-dark text-white">
                  <p class="text-justify">En la mayoría de hogares se está viviendo el furor de uso de los dispositivos móviles, los cuales le han quitado importancia a otros artículos como lo son los libros, juegos de mesa y de consolas de videojuegos. Por su distinta versatilidad y diversidad, los dispositivos móviles han hecho que los demás artículos de ocio sean dejados de lado para ser apilados y acumulados sin encontrar o retomar los servicios que brindan, de manera que hacen.</p>
                  <p class="text-justify">El excesivo espacio que ocupan estos artículos como lo son los libros, videojuegos y juegos de mesa por el acumulamiento una vez sus dueños ha perdido el interés en estos, genera una gran incomodidad en hogares, oficinas u otros lugares, llevando a que las personas los desechen de manera inadecuada sin importar el valor e importancia que pueden poseer estos artículos para otras personas.</p>
                  <p class="text-justify">Según la Encuesta de Consumo Cultural del Dane y artículos del periódico el Tiempo, en Colombia las personas mayores de 25 años dejan de leer no por falta de dinero sino por pérdida del interés la lectura, de igual forma a partir del siglo XIX, el interés por los juegos de mesa y videojuegos ha disminuido lo cual ha provocado que muchos artículos no sean vueltos a usar y terminan apilados o “arrumados” en las casas ocupando espacios que puede ser utilizado para otros artículos que si despierten interese en los usuarios. </p>
                  <h2>Objetivo general </h2>
                  <p class="text-justify">Construir un software orientado al intercambio de artículos que no sean usados como los libros, videojuegos y juegos de mesa; aplicando una metodología de desarrollo de software.</p>
                  <h3>Objetivos específicos</h3>
                  <p class="text-justify">
                    •	Recopilar y plantear los requisitos necesarios para construir una herramienta que permita a los usuarios el intercambio o donación de artículos que no utilicen.
                    <br>
                    •	Analizar las diferentes opciones que existen en el mercado para el intercambio de artículos con el fin de definir las bases para el desarrollo de una herramienta informática.
                    <br>
                    •	Implementar un módulo de donación donde se le permita al usuario ofrecer su artículo desde que no sea posible hacer el intercambio o no quiera intercambiarlo.
                    <br>
                    •	Permitir que el usuario seleccione opción de envío del artículo capturando los datos de destino y solicitando su confirmación de recibido.
                  </p>
                </div>
                </article>
            <footer class="text-center">
                <small class="text-center">&copy;2018 derechos de ChechoSoft Colombia</small>
            </footer>
        </div>
    </body>
</html>
