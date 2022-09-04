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

import com.athos.models.domain.Proveedor;
import com.athos.models.dao.ProveedorDaoImpl;

import java.util.List;
import java.io.IOException;

@WebServlet("/ServletProveedor")
public class ServletProveedor extends HttpServlet{
    
    @Override
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws IOException {
        
    }
    
    @Override
    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        String accion = request.getParameter("accion");
        
        if(accion != null) {
            switch(accion) {
                case "listar":
                    listarProveedores(request, response);
                break;
                
                case "editar":
                break;
                
                case "eliminar":
                break;
            }
        }
    }
    
    private void listarProveedores(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Proveedor> data = new ProveedorDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("ListadoDeProveedores", data);
        response.sendRedirect("proveedores/proveedor.jsp"); 
    }
}