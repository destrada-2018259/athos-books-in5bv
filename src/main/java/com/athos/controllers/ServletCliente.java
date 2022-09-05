
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

import com.athos.models.dao.ClienteDaoImpl;
import com.athos.models.domain.Cliente;
import java.util.List;
import java.io.IOException;
import java.util.ArrayList;


@WebServlet("/ServletCliente")
public class ServletCliente extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String accion = request.getParameter("accion");
        if (accion != null){
        
            switch (accion){
            
                case "listar":
                    listarClientes(request, response);
                    break;
                case "editar":

                    break;
                case "eliminar":

                    break;
                default:
            }
        }
    }
    
    private void listarClientes(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Cliente> data = new ClienteDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listadoDeClientes", data);
        response.sendRedirect("sucursales/sucursal.jsp");
    }
}
