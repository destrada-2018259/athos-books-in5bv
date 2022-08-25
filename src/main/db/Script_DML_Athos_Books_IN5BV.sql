/*
Jefferson Gadiel Yuman Pérez  2021335
Bryan Daniel Cabrera Mendoza  2021302
Juan Jose Rivas Alvarez 2020573
Daniel de Jesús Estrada Rojo 2018259
Dorbal Emilio Aldana Ramos 2021604
Código Técnico: IN5BV
Grupo: 1 (Jueves)
Fecha de Creación: 16/08/2022
Fecha de Modificación: 22/08/2022
*/

USE db_athos_books_in5bv;
-- Inserciones en la tabla autores
INSERT INTO autores(nombre1, apellido1, pais_origen, fecha_nacimiento) 
VALUES("William", "Shakespeare", "Inglaterra", "23/03/1564");
INSERT INTO autores(nombre1, apellido1, apellido2, pais_origen, fecha_nacimiento) 
VALUES("Miguel", "de Cervantes", "Saavedra", "España", "29/09/1547");
INSERT INTO autores(nombre1, nombre2, apellido1, pais_origen, fecha_nacimiento) 
VALUES("Stephen", "Edwin", "King", "Estados Unidos", "21/09/1947");
INSERT INTO autores(nombre1, nombre2, nombre3, apellido1, pais_origen, fecha_nacimiento) 
VALUES("John", "Ronald", "Reuel","Tolkien","Sudáfrica","3/01/1895");
INSERT INTO autores(nombre1, nombre2, apellido1, pais_origen, fecha_nacimiento) 
VALUES("Annelies", "Marie", "Frank", "Alemania", "12/06/1929");
INSERT INTO autores(nombre1, pais_origen, fecha_nacimiento) 
VALUES("Homero", "Grecia", "Siglo VIII a.C");
INSERT INTO autores(nombre1, pais_origen, fecha_nacimiento) 
VALUES("Platón", "Grecia", "387 a.C");
INSERT INTO autores(nombre1, apellido1, pais_origen, fecha_nacimiento) 
VALUES("Joanne", "Rowling", "Reino Unido", "31/07/1965");
INSERT INTO autores(nombre1, apellido1, apellido2, pais_origen, fecha_nacimiento) 
VALUES("José", "Milla", "y Vidaurre", "Guatemala", "04/08/1822");
INSERT INTO autores(nombre1, nombre2, apellido1, apellido2, pais_origen, fecha_nacimiento) 
VALUES("Miguel","Angel","Asturias","Rosales","Guatemala","19/10/1889");
INSERT INTO autores(nombre1, apellido1, pais_origen, fecha_nacimiento) 
VALUES("Dante", "Alighieri", "Italia", "29/05/1265");
INSERT INTO autores(nombre1, nombre2, apellido1, pais_origen, fecha_nacimiento) 
VALUES("Jules", "Gabriel", "Verne", "Francia", "08/02/1828");
INSERT INTO autores(nombre1, nombre2, apellido1, apellido2, pais_origen, fecha_nacimiento) 
VALUES("Charles","John","Huffam","Dickens","Reino Unido","07/06/1812");


-- Inserciones en la tabla generos_literarios

INSERT INTO generos_literarios(nombre_genero, descripcion_genero) 
VALUES("Epopeya","La epopeya es un relato épico o narrativo, escrito la mayor parte de las veces en verso largo (hexámetro) o prosa, que consiste en la narración extensa de acciones trascendentales o dignas de memoria para un pueblo en torno a la figura de un héroe representativo de sus virtudes de más estima.");
INSERT INTO generos_literarios(nombre_genero, descripcion_genero)
VALUES("Novela", "Es una obra literaria en la que se narra una acción fingida en todo o en parte y cuyo fin es causar placer estético");
INSERT INTO generos_literarios(nombre_genero, descripcion_genero)
VALUES("Ciencia ficción", "Ciencia ficción es la denominación de uno de los géneros derivados de la literatura de ficción, junto con la literatura fantástica y la narrativa de terror");
INSERT INTO generos_literarios(nombre_genero)
VALUES("Comedia", "El género dramático opuesto a la tragedia y, por lo tanto, relacionado casi siempre con historias con final feliz");
INSERT INTO generos_literarios(nombre_genero, descripcion_genero)
VALUES("Romance","Es un género que expone historias en su mayoría amorosas y poéticas.");
INSERT INTO generos_literarios(nombre_genero, descripcion_genero)
VALUES("Poema","es una composición literaria del género de la lírica, usualmente de breve extensión, que consiste en la descripción subjetiva de un estado emocional, existencial o de alguna vivencia. ");
INSERT INTO generos_literarios(nombre_genero, descripcion_genero)
VALUES("Sátira","Poema utilizado para ridiculizar a alguien o a algo. ");
INSERT INTO generos_literarios(nombre_genero, descripcion_genero)
VALUES("Oda","Poema que trata un tema serio y elevado. ");
INSERT INTO generos_literarios(nombre_genero, descripcion_genero)
VALUES("Poema épico", "Relata las hazañas heroicas con el propósito de glorificar a una patria.");
INSERT INTO generos_literarios(nombre_genero, descripcion_genero)
VALUES("Drama","Los personajes luchan contra la adversidad, que suele causarle gran daño. Pueden intervenir elementos cómicos y entonces toma el nombre de tragicomedia. ");

-- Inserciones en la tabla Clientes

INSERT INTO clientes(nombre1, nombre2, apellido1, apellido2, direccion, email_cliente, telefono_cliente) 
VALUES("Dorbal","Emilio","Aldana","Ramos", "zona 10 Sector 3", "daldana@gmail.com", "12345678");
INSERT INTO clientes(nombre1, nombre2, apellido1, apellido2, direccion, email_cliente, telefono_cliente) 
VALUES("Juan","José","Rivas","Alvarez", "zona 7 Landívar", "jrivas@gmail.com", "87654321");
INSERT INTO clientes(nombre1, nombre2, apellido1, apellido2, direccion, email_cliente, telefono_cliente) 
VALUES("Bryan","Daniel","Cabrera","Mendoza", "Villanueva", "bcabrera@gmail.com", "13467982");
INSERT INTO clientes(nombre1, nombre2, apellido1, apellido2, direccion, email_cliente, telefono_cliente) 
VALUES("Jefferson","Gadiel","Yuman","Perez", "Chimaltenango", "jyuman@gmail.com", "91763265");
INSERT INTO clientes(nombre1, nombre2, apellido1, apellido2, direccion, email_cliente, telefono_cliente) 
VALUES("Daniel","de Jesús","Estrada","Rojo", "zona 11 Carabanchel", "destrada@gmail.com", "32459876");
INSERT INTO clientes(nombre1, nombre2, nombre3, apellido1, apellido2, direccion, email_cliente, telefono_cliente) 
VALUES("Julio","José","Sebastián","Farnés","Olmedo", "zona 10 Sector 5", "jfarnes@gmail.com", "82288228");
INSERT INTO clientes(nombre1, nombre2, apellido1, apellido2, direccion, email_cliente, telefono_cliente) 
VALUES("Jefferson","Alexander","Calderón","Martínez", "zona 21 Sector 3", "jcalderon@gmail.com", "12658234");
INSERT INTO clientes(nombre1, nombre2, apellido1, apellido2, direccion, email_cliente, telefono_cliente) 
VALUES("Anyelo","Antuan","García","Galvez", "zona 8 Sector 11", "agarcia@gmail.com", "77889955");
INSERT INTO clientes(nombre1, nombre2, apellido1, apellido2, direccion, email_cliente, telefono_cliente) 
VALUES("Juan","Pablo","Morales","Salazar", "zona 21", "jmorales@gmail.com", "54568789");
INSERT INTO clientes(nombre1, nombre2,nombre3, apellido1, apellido2, direccion, email_cliente, telefono_cliente) 
VALUES("Bill","Abel","Bickson","Garcia","Rangel", "zona 11 Carabanchel", "bgarcia@gmail.com", "71283964");
INSERT INTO clientes(nombre1, nombre2, apellido1, apellido2, direccion, email_cliente, telefono_cliente) 
VALUES("Alan","René","López","Lucas", "zona 18 centro", "alopez@gmail.com", "64319746");

-- Inserciones









