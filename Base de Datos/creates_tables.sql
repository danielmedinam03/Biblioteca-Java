CREATE SCHEMA biblioteca;
USE biblioteca;

CREATE TABLE usuario(
	id_usuario VARCHAR (5) PRIMARY KEY,
    nombre_u VARCHAR (50),
    programa_u VARCHAR (20),
    campus_u VARCHAR (20)
);
CREATE TABLE libros(
	id_libro VARCHAR (10) PRIMARY KEY,
    nombre_l VARCHAR (50),
    autor_l VARCHAR (50),
    editorial_l VARCHAR (25),
    nro_paginas_l INTEGER,
    anio_l INTEGER,
    disponible_l VARCHAR (10)
);

CREATE TABLE video(
	id_video VARCHAR(10) PRIMARY KEY,
	equipo_v VARCHAR (20),
	color_v VARCHAR (15),
    marca_v VARCHAR (20),
    disponible_v VARCHAR (10)
);

CREATE TABLE espacios(
	id_espacios VARCHAR(10) PRIMARY KEY,
	nombre_e VARCHAR (50),
    capacidad_e INTEGER,
    descripcion_e VARCHAR(300),
    disponible_e VARCHAR (10)
);

CREATE TABLE reserva(
	id_reserva VARCHAR (10) PRIMARY KEY,
    id_producto VARCHAR(10),
    tipo_reserva VARCHAR (15),
    fecha_salida DATETIME,
    fecha_entrega DATETIME
);





