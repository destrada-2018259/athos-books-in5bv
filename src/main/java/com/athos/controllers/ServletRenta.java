
package com.athos.controllers;

/**
 *
 * @author USUARIO
 * @date 3/09/2022
 * @time 14:57:20
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

import com.athos.models.dao.RentaDaoImpl;
import com.athos.models.domain.Renta;
import java.util.List;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/ServletRenta")
public class ServletRenta extends HttpServlet{

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
                    listarRenta(request, response);
                    break;
                case "editar":

                    break;
                case "eliminar":

                    break;
                default:
            }
        }
    }

    private void listarRenta(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Renta> data = new RentaDaoImpl().getALL();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listadoDeRentas", data);
        response.sendRedirect("rentas/renta.jsp");
    }
    
}
