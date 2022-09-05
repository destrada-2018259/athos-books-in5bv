package com.athos.models.dao;

/**
 *
 * @author Juan Jose Rivas Alvarez
 * @date 4 sep 2022
 * @time 17:16:26
 * Carné: 2020573
 * Grupo: 1
 * Codigo Tecnico: IN5BV
 */

import com.athos.db.Conexion;
import com.athos.models.domain.Empleado;
import com.athos.models.idao.IEmpleadoDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDaoImpl implements IEmpleadoDao{
    
    public static final String SQL_SELECT = "SELECT id_empleado, fecha_contratacion, persona_id, sucursal_id FROM empleados";
    
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Empleado empleado = null;
    private List<Empleado> listaEmpleado = new ArrayList<>();

    @Override
    public List<Empleado> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();
            while (rs.next()) {                
                empleado = new Empleado(rs.getInt("id_empleado"), rs.getDate("fecha_contratacion").toLocalDate(), rs.getInt("persona_id"), rs.getInt("sucursal_id"));
                listaEmpleado.add(empleado);
            }
        } catch (SQLException e) {  
            System.err.println("Se a producido un error al listar las Sucursales");
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        return listaEmpleado;
    }

    @Override
    public boolean add(Empleado empleado) {
        return false;
    }

    @Override
    public boolean update(Empleado empleado) {
        return false;
    }

    @Override
    public boolean delete(Empleado empleado) {
        return false;
    }
}
