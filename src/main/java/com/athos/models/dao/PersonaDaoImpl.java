package com.athos.models.dao;

/**
 * @author Jefferson Gadiel Yuman Pérez
 * @date 3/09/2022
 */

import com.athos.db.Conexion;
import com.athos.models.domain.Persona;
import com.athos.models.idao.IPersonaDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonaDaoImpl implements IPersonaDao{
    
    private static final String SQL_SELECT = "SELECT id_persona, nombre1, nombre2, nombre3, apellido1, apellido2 FROM personas";
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Persona persona = null;
    private List<Persona> listaPersonas = new ArrayList<>();
    
    @Override
    public List<Persona> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();
            while(rs.next()) {
                persona = new Persona(
                    rs.getInt("id_persona"),
                    rs.getString("nombre1"),
                    rs.getString("nombre2"),
                    rs.getString("nombre3"),
                    rs.getString("apellido1"),
                    rs.getString("apellido2"));
                listaPersonas.add(persona);
            }
        }catch(SQLException e) {
            System.err.println("Se produjo un error al intentar listar los registros de la tabla personas");
            e.printStackTrace(System.out);
        }catch(Exception e) {
            e.printStackTrace(System.out);
        }finally {
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        return listaPersonas;
    }
    
    @Override
    public boolean add(Persona persona) {
        return false;
    }
    
    @Override
    public boolean update(Persona persona) {
        return false;
    }
    
    @Override
    public boolean delete(Persona persona) {
        return false;
    }
}
