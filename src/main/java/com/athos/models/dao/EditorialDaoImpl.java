
package com.athos.models.dao;

/**
 *
 * @author Daniel de Jesús Estrada Rojo
 * @date 4/09/2022
 * @time 16:43:21
 *
 * Codigo Tecnico: IN5BV
 */
import com.athos.db.Conexion;
import com.athos.models.domain.Editorial;
import com.athos.models.idao.IEditorialDao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.util.List;
import java.util.ArrayList;

public class EditorialDaoImpl implements IEditorialDao{
    
    private static final String SQL_SELECT = "SELECT id_editorial, nombre_editorial, sede_editorial, direccion_editorial, telefono_editorial, email_editorial, sitio_web, fundacion FROM editoriales";
    private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement pstmt = null;
    private Editorial editorial = null;
    private List<Editorial> listaEditoriales = new ArrayList<>();

    @Override
    public List<Editorial> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();
            
            while(rs.next()){
                editorial = new Editorial(
                        rs.getInt("id_editorial"),
                        rs.getString("nombre_editorial"),
                        rs.getString("sede_editorial"),
                        rs.getString("direccion_editorial"),
                        rs.getString("telefono_editorial"),
                        rs.getString("email_editorial"),
                        rs.getString("sitio_web"),
                        rs.getDate("fundacion").toLocalDate());
            }
            
        } catch (Exception e) {
        }
        return listaEditoriales;
    }

    @Override
    public boolean add(Editorial editorial) {
        return false;
    }

    @Override
    public boolean update(Editorial editorial) {
        return false;
    }

    @Override
    public boolean delete(Editorial editorial) {
        return false;
    }
    
}
