<%-- 
    Document   : Clientes
    Created on : 25/08/2022, 13:11:48
    Author     : Daniel de Jesús Estrada Rojo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
        <script src="../assets/js/FontAwesome.js"></script>
    </head>
    <body>

        <div class="row">
            <div class="col-12">
                <header>
                    <p>Clientes</p>
                </header>
            </div>
        </div>


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
                                        Lista de Clientes
                                    </h4>
                                </div>
                            </div>
                            <table class="table table-stripped">
                                <thead class="table-dark">
                                    <tr>
                                        <th>#</th>
                                        <th>Dirección</th>
                                        <th>Email</th>
                                        <th>Telefono</th>
                                        <th>Nit</th>
                                        <th>Persona Id</th>
                                        <th>Editar</th>
                                        <th>Eliminar</th>
                                    </tr>
                                </thead>
                                <tbody>

                                    <c:forEach var="cliente" items="${listadoDeClientes}">
                                        <tr>
                                            <td>${cliente.idCliente}</td>
                                            <td>${cliente.direccion}</td>
                                            <td>${cliente.emailCliente}</td>
                                            <td>${cliente.telefonoCliente}</td>
                                            <td>${cliente.nit}</td>
                                            <td>${cliente.personaId}</td>
                                            <td><i class="fa-solid fa-pen-to-square"></i></td>
                                            <td><i class="fa-solid fa-trash-can"></i></td>
                                        </tr>
                                    </c:forEach>


                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </section>
        </main>
    </body>
</html>
