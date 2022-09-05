
package com.athos.controllers;

/**
 *
 * @author Daniel de Jesús Estrada Rojo
 * @date 2/09/2022
 * @time 21:50:51
 *
 * Codigo Tecnico: IN5BV
 */

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

import com.athos.models.dao.InteresDaoImpl;
import com.athos.models.domain.Interes;
import java.util.List;
import java.io.IOException;
import java.util.ArrayList;


@WebServlet("/ServletIntereses")
public class ServletIntereses extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String accion = request.getParameter("accion");
        if (accion != null){
        
            switch (accion){
            
                case "listar":
                    listarIntereses(request, response);
                    break;
                case "editar":

                    break;
                case "eliminar":

                    break;
                default:
            }
        }
    }
    
    private void listarIntereses(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Interes> data = new InteresDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listadoDeIntereses", data);
        response.sendRedirect("intereses/intereses.jsp");
    }
}
