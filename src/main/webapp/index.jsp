
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Principal-Athos-Books</title>
        <link rel="stylesheet" type="text/css" href="./assets/css/estilos-athos-books.css"/>
        <link rel="stylesheet" type="text/css" href="./assets/css/bootstrap.css"/>
        <link rel="stylesheet" type="text/css" href="./assets/css/bootstrap.min.css"/>
        <script type="text/javascript" src="./assets/js/bootstrap.bundle.js"></script>
    </head>
    <body>

        <div class="row">
            <div class="col-12">
                <header>
                    <p>Athos.</p>
                </header>
            </div>
        </div>

        <jsp:include page="./WEB-INF/paginas/comunes/cabecera.jsp" />

        <main>
            <section id="slider">
                <div class="container">
                    <div class="row">
                        <div class="col-12">
                            <div id="carouselExampleCaptions" class="carousel slide" data-bs-ride="false">
                                <div class="carousel-indicators">
                                    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
                                    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
                                    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
                                </div>
                                <div class="carousel-inner">
                                    <div class="carousel-item active">
                                        <img src="./assets/images/imagen2.jpg" class="d-block w-100" alt="...">
                                        <div class="carousel-caption d-none d-md-block">
                                            <h5>¿Eres un adicto a la lectura?</h5>
                                            <p>Si es así, Athos Books va a saciar esa necesidad de lectura.</p>
                                        </div>
                                    </div>
                                    <div class="carousel-item">
                                        <img src="./assets/images/imagen4.jpg" class="d-block w-100" alt="...">
                                        <div class="carousel-caption d-none d-md-block">
                                            <h5>Renta, lee, devuelve, repite.</h5>
                                            <p>Con nosotros podrás rentar tus títulos favoritos, de cualquier género y al mejor precio.</p>
                                        </div>
                                    </div>
                                    <div class="carousel-item">
                                        <img src="./assets/images/imagen3.jpg" class="d-block w-100" alt="...">
                                        <div class="carousel-caption d-none d-md-block">
                                            <h5>Los mejores libros, en el mejor lugar</h5>
                                            <p>La iniciativa de Athos Books es de lectores para lectores.</p>
                                        </div>
                                    </div>
                                    <div class="carousel-item">
                                        <img src="./assets/images/imagen1.jpg" class="d-block w-100" alt="...">
                                        <div class="carousel-caption d-none d-md-block">
                                            <h5>Los mejores libros, en el mejor lugar</h5>
                                            <p>La iniciativa de Athos Books es de lectores para lectores.</p>
                                        </div>
                                    </div>
                                </div>
                                <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
                                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                                    <span class="visually-hidden">Previous</span>
                                </button>
                                <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
                                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                                    <span class="visually-hidden">Next</span>
                                </button>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
        </main>
        <script type="text/javascript" src="./assets/js/script.js"></script>
    </body>
</html>
