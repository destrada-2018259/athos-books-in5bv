
<nav class="navbar navbar-expand-lg menu-athos sticky-top">
    <div class="container">
        <p class="logo-header">Men?</p>
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
                        <li><a class="dropdown-item" href="${pageContext.request.contextPath}/ServletAutores?accion=listar">Autores</a></li>
                        <li><a class="dropdown-item" href="${pageContext.request.contextPath}/ServletPersona?accion=listar">Personas</a></li>
                        <li><a class="dropdown-item" href="${pageContext.request.contextPath}/ServletEditorial?accion=listar">Editoriales</a></li>
                        <li><a class="dropdown-item" href="${pageContext.request.contextPath}/ServletCliente?accion=listar">Clientes</a></li>
                        <li><a class="dropdown-item" href="${pageContext.request.contextPath}/ServletSucursales?accion=listar">Sucursales</a></li>
                        <li><a class="dropdown-item" href="${pageContext.request.contextPath}/ServletProveedor?accion=listar">Proveedores</a></li>
                        <li><a class="dropdown-item" href="${pageContext.request.contextPath}/ServletHorario?accion=listar">Horarios</a></li>
                        <li><a class="dropdown-item" href="${pageContext.request.contextPath}/ServletLibro?accion=listar">Libros</a></li>
                        <li><a class="dropdown-item" href="${pageContext.request.contextPath}/ServletAsociacion?accion=listar">Autores y sus libros</a></li>
                        <li><a class="dropdown-item" href="${pageContext.request.contextPath}/ServletIntereses=accion=listar">Intereses del cliente</a></li>
                        <li><a class="dropdown-item" href="${pageContext.request.contextPath}/ServletRenta?accion=listar">Rentas</a></li>
                        <li><hr class="dropdown-divider"></li>
                        <li><a class="dropdown-item" href="#">Something else here</a></li>
                    </ul>
                </li>
            </ul>

        </div>
    </div>
</nav>




