package com.athos.models.dao;

/**
 *
 * @author Juan Jose Rivas Alvarez
 * @date 4 sep 2022
 * @time 16:04:24
 * Carné: 2020573
 * Grupo: 1
 * Codigo Tecnico: IN5BV
 */
import com.athos.db.Conexion;
import com.athos.models.domain.Horario;
import com.athos.models.idao.IHorarioDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HorarioDaoImpl implements IHorarioDao  {
    
    public static final String SQL_SELECT = "SELECT id_horario, horario_inicio, horario_final, lunes, martes, miercoles, jueves, viernes, sabado, domingo FROM horarios";
    
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Horario horario = null;
    private List<Horario> listaHorario = new ArrayList<>();

    @Override
    public List<Horario> getALL() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();
            while (rs.next()) {                
                horario = new Horario(rs.getInt("id_horario"), rs.getTime("horario_inicio").toLocalTime(), rs.getTime("horario_final").toLocalTime(), rs.getBoolean("lunes"), rs.getBoolean("martes"), rs.getBoolean("miercoles"), rs.getBoolean("jueves"), rs.getBoolean("viernes"), rs.getBoolean("sabado"), rs.getBoolean("domingo"));
                listaHorario.add(horario);
            }
        } catch (SQLException e) {  
            System.err.println("Se a producido un error al listar los horarios");
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        return listaHorario;
    }

    @Override
    public boolean add(Horario horario) {
        return false;
    }

    @Override
    public boolean update(Horario horario) {
         return false;
    }

    @Override
    public boolean delete(Horario horario) {
        return false;
    }
   
    
}

