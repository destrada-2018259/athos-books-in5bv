/*
Jefferson Gadiel Yuman Pérez  2021335
Bryan Daniel Cabrera Mendoza  2021302
Juan Jose Rivas Alvarez 2020573
Daniel de Jesús Estrada Rojo 2018259
Dorbal Emilio Aldana Ramos 2021604
Código Técnico: IN5BV
Grupo: 1 (Jueves)
Fecha de Creación: 16/08/2022
Fecha de Modificación: 
*/

DROP DATABASE IF EXISTS db_athos_books_in5bv;
CREATE DATABASE db_athos_books_in5bv;
USE db_athos_books_in5bv;

DROP TABLE IF EXISTS autores;
CREATE TABLE IF NOT EXISTS autores(
	id_autor INT NOT NULL AUTO_INCREMENT,
	nombre1 VARCHAR(25) NOT NULL,
    nombre2 VARCHAR(25) NULL,
    nombre3 VARCHAR(25) NULL,
    apellido1 VARCHAR(25) NULL,
    apellido2 VARCHAR(25)NULL,
    pais_origen VARCHAR(30) NOT NULL,
    fecha_nacimiento varchar(50) NOT NULL,
    CONSTRAINT pk_autores PRIMARY KEY (id_autor)
);

DROP TABLE IF EXISTS generos_literarios;
CREATE TABLE IF NOT EXISTS generos_literarios(
	id_genero INT NOT NULL AUTO_INCREMENT,
    nombre_genero VARCHAR(25) NOT NULL,
    descripcion_genero VARCHAR(120) NULL,
    CONSTRAINT pk_generos_literarios PRIMARY KEY (id_genero)
);

DROP TABLE IF EXISTS clientes;
CREATE TABLE IF NOT EXISTS clientes(
	id_cliente INT NOT NULL AUTO_INCREMENT,
    nombre1 VARCHAR(25) NOT NULL,
    nombre2 VARCHAR(25) NULL,
    nombre3 VARCHAR(25) NULL,
    apellido1 VARCHAR(25) NOT NULL,
    apellido2 VARCHAR(25)NULL,
    direccion VARCHAR(50) NOT NULL,
    email_cliente VARCHAR(50) NOT NULL,
    telefono_cliente VARCHAR(8) NOT NULL,
    CONSTRAINT pk_clientes PRIMARY KEY (id_cliente)
);

DROP TABLE IF EXISTS editoriales;
CREATE TABLE IF NOT EXISTS editoriales(
	id_editorial INT NOT NULL AUTO_INCREMENT,
    nombre_editorial VARCHAR(25) NOT NULL,
    pais_editorial VARCHAR(30) NOT NULL,
    direccion_editorial VARCHAR(50) NOT NULL,
    telefono_editorial VARCHAR(8) NOT NULL,
    email_editorial VARCHAR(50) NOT NULL,
    CONSTRAINT pk_editoriales PRIMARY KEY (id_editorial)
);

DROP TABLE IF EXISTS proveedores;
CREATE TABLE IF NOT EXISTS proveedores(
	id_proveedor INT NOT NULL AUTO_INCREMENT,
    nombre_proveedor VARCHAR(25) NOT NULL,
    telefono_proveedor VARCHAR(8) NOT NULL,
    email_proveedor VARCHAR(50) NOT NULL,
    CONSTRAINT pk_proveedores PRIMARY KEY (id_proveedor)
);

DROP TABLE IF EXISTS horarios;
CREATE TABLE IF NOT EXISTS horarios(
	id_horario INT NOT NULL AUTO_INCREMENT,
    horario_inicio TIME NOT NULL,
    horario_final TIME NOT NULL,
    lunes TINYINT(1) NULL,
    martes TINYINT(1) NULL,
    miercoles TINYINT(1) NULL,
    jueves TINYINT(1) NULL,
    viernes TINYINT(1) NULL,
    sabado TINYINT(1) NULL,
    domingo TINYINT(1) NULL,
    CONSTRAINT pk_horarios PRIMARY KEY (id_horario)
);

DROP TABLE IF EXISTS roles;
CREATE TABLE IF NOT EXISTS roles(
	id INT NOT NULL,
    descripcion VARCHAR(50) NOT NULL,
    CONSTRAINT pk_roles PRIMARY KEY (id)
);

DROP TABLE IF EXISTS usuarios;
CREATE TABLE IF NOT EXISTS usuarios(
	user VARCHAR(25) NOT NULL,
    pass VARCHAR(255) NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    rol_id INT NOT NULL,
    CONSTRAINT pk_usuarios PRIMARY KEY (user),
    CONSTRAINT fk_usuarios_roles
		FOREIGN KEY (rol_id) REFERENCES roles(id)
        ON UPDATE CASCADE ON DELETE CASCADE
);

DROP TABLE IF EXISTS sucursales;
CREATE TABLE IF NOT EXISTS sucursales(
	id_sucursal INT NOT NULL AUTO_INCREMENT,
    nombre_sucursal VARCHAR(25) NOT NULL,
    direccion_sucursal VARCHAR(50) NOT NULL,
    telefono_sucursal VARCHAR(8) NOT NULL,
    horario_id INT,
    CONSTRAINT pk_sucursales PRIMARY KEY (id_sucursal),
    CONSTRAINT fk_sucursales_horarios
		FOREIGN KEY (horario_id) REFERENCES horarios(id_horario)
        ON UPDATE CASCADE ON DELETE CASCADE
);

DROP TABLE IF EXISTS proveedores_sucursales;
CREATE TABLE IF NOT EXISTS proveedores_sucursales(
	id_proveedor_sucursal INT NOT NULL AUTO_INCREMENT,
    proveedor_id INT,
    sucursal_id INT,
    CONSTRAINT pk_proveedores_sucursales PRIMARY KEY (id_proveedor_sucursal),
    CONSTRAINT fk_proveedores_proveedores_sucursales
		FOREIGN KEY (proveedor_id) REFERENCES proveedores(id_proveedor)
        ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT fk_sucursales_proveedores_sucursales
		FOREIGN KEY (sucursal_id) REFERENCES sucursales(id_sucursal)
        ON UPDATE CASCADE ON DELETE CASCADE
);

DROP TABLE IF EXISTS intereses;
CREATE TABLE IF NOT EXISTS intereses(
	id_interes INT NOT NULL AUTO_INCREMENT,
    genero_id INT,
    cliente_id INT,
    CONSTRAINT pk_intereses PRIMARY KEY (id_interes),
    CONSTRAINT fk_intereses_generos
		FOREIGN KEY (genero_id) REFERENCES generos_literarios(id_genero)
        ON UPDATE CASCADE ON DELETE CASCADE,
    CONSTRAINT fk_intereses_clientes
		FOREIGN KEY (cliente_id) REFERENCES clientes(id_cliente)
        ON UPDATE CASCADE ON DELETE CASCADE    
);

DROP TABLE IF EXISTS genero_autores;
CREATE TABLE IF NOT EXISTS genero_autores(
	id_genero_autor INT NOT NULL AUTO_INCREMENT,
    autor_id INT,
    genero_id INT,
    CONSTRAINT pk_genero_autores PRIMARY KEY (id_genero_autor),
    CONSTRAINT fk_genero_autores_autores
		FOREIGN KEY (autor_id) REFERENCES autores(id_autor)
        ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT fk_genero_autores_generos
		FOREIGN KEY (genero_id) REFERENCES generos_literarios(id_genero)
        ON UPDATE CASCADE ON DELETE CASCADE
);

DROP TABLE IF EXISTS libros;
CREATE TABLE IF NOT EXISTS libros(
	isbn BIGINT NOT NULL AUTO_INCREMENT,
    nombre_libro VARCHAR(25) NOT NULL,
    prologo VARCHAR(120) NULL,
    stock INT NOT NULL,
    edicion VARCHAR(25) NOT NULL,
    editorial_id INT,
    genero_id INT,
    autor_id INT,
    proveedor_id INT,
    CONSTRAINT pk_libros PRIMARY KEY (isbn),
    CONSTRAINT fk_libros_editoriales
		FOREIGN KEY (editorial_id) REFERENCES editoriales(id_editorial)
        ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT fk_libros_generos
		FOREIGN KEY (genero_id) REFERENCES generos_literarios(id_genero)
        ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT fk_libros_autores
		FOREIGN KEY (autor_id) REFERENCES autores(id_autor)
        ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT fk_libros_proveedores
		FOREIGN KEY (proveedor_id) REFERENCES proveedores(id_proveedor)
        ON UPDATE CASCADE ON DELETE CASCADE
);

DROP TABLE IF EXISTS rentas;
CREATE TABLE IF NOT EXISTS rentas(
	id_renta INT NOT NULL AUTO_INCREMENT,
    fecha_renta DATE NOT NULL,
    fecha_devolucion DATE NOT NULL,
    cliente_id INT,
    libro_id BIGINT,
    sucursal_id INT,
    CONSTRAINT pk_rentas PRIMARY KEY (id_renta),
    CONSTRAINT fk_rentas_clientes
		FOREIGN KEY (cliente_id) REFERENCES clientes(id_cliente)
        ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT fk_rentas_libros
		FOREIGN KEY (libro_id) REFERENCES libros(isbn)
        ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT fk_rentas_sucursales
		FOREIGN KEY (sucursal_id) REFERENCES sucursales(id_sucursal)
        ON UPDATE CASCADE ON DELETE CASCADE
);