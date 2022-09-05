package com.athos.controllers;

/**
 *
 * @author Bryan Daniel Cabrera Mendoza
 * @date 3/09/2022
 * @time 22:26:40
 * 
 * Codigo Tecnico: IN5BV
 */

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

import com.athos.models.dao.AutoresDaoImpl;
import com.athos.models.domain.Autores;
import java.util.List;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/ServletAutores")
public class ServletAutores extends HttpServlet{
    
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
        List<Autores> data = new AutoresDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listadoDeAutores", data);
        response.sendRedirect("autores/autores.jsp");
    }
}