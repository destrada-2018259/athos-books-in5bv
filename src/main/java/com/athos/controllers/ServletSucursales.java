package com.athos.controllers;

/**
 *
 * @author Bryan Daniel Cabrera Mendoza
 * @date 4/09/2022
 * @time 14:47:41
 */


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

import com.athos.models.dao.SucursalesDaoImpl;
import com.athos.models.domain.Sucursales;
import java.util.List;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/ServletSucursales")
public class ServletSucursales extends HttpServlet{
    
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
        List<Sucursales> data = new SucursalesDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listadoDeSucursales", data);
        response.sendRedirect("clientes/cliente.jsp");
    }
}
