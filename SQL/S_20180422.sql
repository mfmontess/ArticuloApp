CREATE DATABASE articuloApp_BD;

CREATE TABLE articuloapp_bd.dominios (
    dominio_id INT AUTO_INCREMENT,
    nombre VARCHAR(100),
    descripcion VARCHAR(200),
    PRIMARY KEY (dominio_id)
);

CREATE TABLE articuloapp_bd.detalles_dominios (
    detalle_dominio_id INT AUTO_INCREMENT,
    dominio_id INT,
    valor VARCHAR(10),
    descripcion VARCHAR(50),
    PRIMARY KEY (detalle_dominio_id),
    FOREIGN KEY (dominio_id) REFERENCES dominios (dominio_id)
);

CREATE TABLE articuloapp_bd.clientes (
    cliente_id INT AUTO_INCREMENT,
    nombre VARCHAR(200),
    direccion VARCHAR(100),
    telefono VARCHAR(10),
    correo VARCHAR(100),
    PRIMARY KEY (cliente_id)
);

CREATE TABLE articuloapp_bd.articulos (
    articulo_id INT AUTO_INCREMENT,
    nombre VARCHAR(100),
    tipo INT,
    estado INT,
    foto VARCHAR(200),
    PRIMARY KEY (articulo_id)
);

CREATE TABLE articuloapp_bd.articulos_clientes (
    articulo_cliente_id INT AUTO_INCREMENT,
    articulo_id INT,
    cliente_id INT,
    fecha_publicacion DATETIME,
    estado INT,
    PRIMARY KEY (articulo_cliente_id),
    FOREIGN KEY (articulo_id) REFERENCES articulos (articulo_id),
    FOREIGN KEY (cliente_id) REFERENCES clientes (cliente_id)
);

CREATE TABLE articuloapp_bd.notificaciones (
  notificacion_id int AUTO_INCREMENT,
  remitente int,
  destinatario int,
  mensaje varchar(200),
  estado int,
  PRIMARY KEY (notificacion_id),
  FOREIGN KEY (remitente) REFERENCES clientes (cliente_id),
  FOREIGN KEY (destinatario) REFERENCES clientes (cliente_id)
);

CREATE TABLE articuloapp_bd.solicitudes (
    solicitud_id INT AUTO_INCREMENT,
    codigo VARCHAR(10),
    tipo INT,
    articulo_cliente_remitente INT,
    articulo_cliente_destinatario INT,
    estado INT,
    observacion VARCHAR(200),
    PRIMARY KEY (solicitud_id),
    FOREIGN KEY (articulo_cliente_remitente) REFERENCES articulos_clientes (articulo_cliente_id),
    FOREIGN KEY (articulo_cliente_destinatario) REFERENCES articulos_clientes (articulo_cliente_id)
);

CREATE TABLE articuloapp_bd.usuarios (
    usuario_id INT AUTO_INCREMENT,
    nombre VARCHAR(50),
    contrasena VARCHAR(10),
    estado INT,
    foto VARCHAR(200),
    cliente_id INT,
    PRIMARY KEY (usuario_id),
    FOREIGN KEY (cliente_id) REFERENCES clientes (cliente_id)
);