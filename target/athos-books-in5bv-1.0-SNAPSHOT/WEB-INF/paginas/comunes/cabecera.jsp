
<nav class="navbar navbar-expand-lg menu-athos sticky-top">
    <div class="container">
        <p class="logo-header">Menú</p>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link" aria-current="page" href="${pageContext.request.contextPath}/index.jsp">Principal</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Sobre Nosotros</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        Entidades
                    </a>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="${pageContext.request.contextPath}/autores/autores.jsp">Autores</a></li>
                        <li><a class="dropdown-item" href="${pageContext.request.contextPath}/personas/personas.jsp">Personas</a></li>
                        <li><a class="dropdown-item" href="${pageContext.request.contextPath}/editoriales/editorial.jsp">Editoriales</a></li>
                        <li><a class="dropdown-item" href="${pageContext.request.contextPath}/clientes/cliente.jsp">Clientes</a></li>
                        <li><a class="dropdown-item" href="${pageContext.request.contextPath}/sucursales/sucursal.jsp">Sucursales</a></li>
                        <li><a class="dropdown-item" href="${pageContext.request.contextPath}/proveedores/proveedor.jsp">Proveedores</a></li>
                        <li><a class="dropdown-item" href="${pageContext.request.contextPath}/horarios/horario.jsp">Horarios</a></li>
                        <li><a class="dropdown-item" href="${pageContext.request.contextPath}/libros/libro.jsp">Libros</a></li>
                        <li><a class="dropdown-item" href="${pageContext.request.contextPath}/asociacion-autores-libros/asociacion-autores-libros.jsp">Autores y sus libros</a></li>
                        <li><a class="dropdown-item" href="${pageContext.request.contextPath}/intereses/intereses.jsp">Intereses del cliente</a></li>
                        <li><a class="dropdown-item" href="${pageContext.request.contextPath}/proveedores-sucursal/proveedores-sucursales.jsp">Proveedores de cada sucursal</a></li>
                        <li><a class="dropdown-item" href="${pageContext.request.contextPath}/rentas/renta.jsp">Rentas</a></li>
                        <li><hr class="dropdown-divider"></li>
                        <li><a class="dropdown-item" href="#">Something else here</a></li>
                    </ul>
                </li>
            </ul>

        </div>
    </div>
</nav>




