package com.athos.controllers;

/**
 * @author Jefferson Gadiel Yuman Pérez
 * @date 3/09/2022
 */

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

import com.athos.models.domain.Libro;
import com.athos.models.dao.LibroDaoImpl;

import java.util.List;
import java.io.IOException;

@WebServlet("/ServletLibro")
public class ServletLibro extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        
        String accion = request.getParameter("accion");
        
        if(accion != null) {
            switch(accion) {
                case "listar":
                    listarLibro(request, response);
                break;
                
                case "editar":
                break;
                
                case "eliminar":
                break;
            }
        }
    }
    
    private void listarLibro(HttpServletRequest request, HttpServletResponse response) throws IOException{
        List<Libro> data = new LibroDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("ListadoDeLibro", data);
        response.sendRedirect("libros/libro.jsp");
    }
}