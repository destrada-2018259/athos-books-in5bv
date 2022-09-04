
package com.athos.controllers;

/**
 *
 * @author Dorbal Emilio Adana Ramos
 * @date 4/09/2022
 * @time 14:23:53
 * Carné 2021604
 * Código técnico: IN5BV
 * Grupo: 1
 */
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

import com.athos.models.dao.AsociacionDaoImpl;
import com.athos.models.domain.Asociacion;
import java.util.List;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/ServletAsociacion")
public class ServletAsociacion extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String accion = request.getParameter("accion");
        if (accion != null)
        {
            switch (accion)
            {
                case "listar":
                    listarAsociacion(request, response);
                    break;
                case "editar":

                    break;
                case "eliminar":

                    break;
                default:
            }
        }
    }
    
    private void listarAsociacion(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Asociacion> data = new AsociacionDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listadoDeAsociacion", data);
        response.sendRedirect("asociacion-autores-libros/asociacion-autores-libros.jsp");
    }
}
