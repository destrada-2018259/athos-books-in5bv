package com.athos.controllers;

/**
 *
 * @author Juan Jose Rivas Alvarez
 * @date 4 sep 2022
 * @time 17:15:38
 * Carné: 2020573
 * Grupo: 1
 * Codigo Tecnico: IN5BV
 */

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;

import com.athos.models.dao.EmpleadoDaoImpl;
import com.athos.models.domain.Empleado;
import java.util.List;
import java.io.IOException;


@WebServlet("/ServletEmpleado")
public class ServletEmpleado extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        
    }
    
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        String accion = request.getParameter("accion");
        if (accion != null) {
            switch (accion){
                case "listar": 
                    listarEmpleados(request, response);
                break;
                case "editar":
                    
                break;
                case "eliminar":
                
                break;
            }
        }
    }
    
    public void listarEmpleados(HttpServletRequest request, HttpServletResponse response) throws IOException{
        List<Empleado> data = new EmpleadoDaoImpl().getAll();
        HttpSession session = request.getSession();
        session.setAttribute("listadoDeEmpleados", data);
        response.sendRedirect("empleados/empleado.jsp");
    }
    
}
