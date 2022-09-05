package com.athos.controllers;

/**
 *
 * @author Juan Jose Rivas Alvarez
 * @date 4 sep 2022
 * @time 16:02:20
 * Carné: 2020573
 * Grupo: 1
 * Codigo Tecnico: IN5BV
 */

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;


import com.athos.models.dao.HorarioDaoImpl;
import com.athos.models.domain.Horario;
import java.util.List;
import java.io.IOException;


@WebServlet("/ServletHorario")
public class ServletHorario extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        String accion = request.getParameter("accion");
        if (accion != null) {
            switch (accion){
                case "listar": 
                    listarHorario(request, response);
                break;
                case "editar":
                    
                break;
                case "eliminar":
                
                break;
            }
        }
    }
    
    private void listarHorario(HttpServletRequest request, HttpServletResponse response) throws IOException{
        List<Horario> data = new HorarioDaoImpl().getALL();
        HttpSession session = request.getSession();
        session.setAttribute("listadoDeHorarios", data);
        response.sendRedirect("horarios/horario.jsp");
    }
    
    
}
