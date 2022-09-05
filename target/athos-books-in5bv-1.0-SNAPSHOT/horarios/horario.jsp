<%-- 
    Document   : horarios
    Created on : 21 ago 2022, 14:18:17
    Author     : juan jose rivas alvarez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Principal-Athos-Books</title>
        <link rel="stylesheet" type="text/css" href="../assets/css/estilos-athos-books.css"/>
        <link rel="stylesheet" type="text/css" href="../assets/css/bootstrap.css"/>
        <link rel="stylesheet" type="text/css" href="../assets/css/bootstrap.min.css"/>
        <link rel="stylesheet" type="text/css" href="../assets/css/pattern.min.css">
        <script type="text/javascript" src="../assets/js/bootstrap.bundle.js"></script>
        <script src="../assets/js/FontAwesome.js"> </script>
    </head>
    <body>
        <header>
            <p>Horarios</p>
        </header>
        <jsp:include page="../WEB-INF/paginas/comunes/cabecera.jsp" />
        <main>
            <section id="actions" class="py-4 mb-4">
                <div class="container">
                    <div class="row">
                        <div class="col-12">
                            <a class="btn btn-primary" role="button" href="#">Agregar</a>
                        </div>
                    </div>
                </div>
            </section>
            
            <section id="nombre-entidad">
                <div class="container mb-5 pb-5">
                    
                    <div class="row">
                        <div class="col-12">
                            <div class="card">
                                <div class="card-header">
                                    <h4>
                                        Lista Horarios
                                    </h4>
                                </div>
                            </div>
                            <table class="table table-stripped">
                                <thead class="table-dark">
                                    <tr>
                                        <th>#</th>
                                        <th>Lunes</th>
                                        <th>Martes</th>
                                        <th>Miercoles</th>
                                        <th>Jueves</th>
                                        <th>Viernes</th>
                                        <th>Horario Inicio</th>
                                        <th>Horario Final</th>
                                        <th>Editar</th>
                                        <th>Eliminar</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>1</td>
                                        <td>registro1</td>
                                        <td>registro2</td>
                                        <td>registro3</td>
                                        <td>registro4</td>
                                        <td>registro5</td>
                                        <td>registro6</td>
                                        <td>registro7</td>
                                        <td><i class="fa-solid fa-pen-to-square"></i></td>
                                        <td><i class="fa-solid fa-trash-can"></i></td>
                                    </tr>
                                    <tr>
                                        <td>2</td>
                                        <td>registro1</td>
                                        <td>registro2</td>
                                        <td>registro3</td>
                                        <td>registro4</td>
                                        <td>registro5</td>
                                        <td>registro6</td>
                                        <td>registro7</td>
                                        <td><i class="fa-solid fa-pen-to-square"></i></td>
                                        <td><i class="fa-solid fa-trash-can"></i></td>
                                    </tr>
                                    <tr>
                                        <td>3</td>
                                        <td>registro1</td>
                                        <td>registro2</td>
                                        <td>registro3</td>
                                        <td>registro4</td>
                                        <td>registro5</td>
                                        <td>registro6</td>
                                        <td>registro7</td>
                                        <td><i class="fa-solid fa-pen-to-square"></i></td>
                                        <td><i class="fa-solid fa-trash-can"></i></td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </section>
        </main>
    </body>
</html>