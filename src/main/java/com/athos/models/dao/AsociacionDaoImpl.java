
package com.athos.models.dao;

import com.athos.db.Conexion;
import com.athos.models.domain.Asociacion;
import com.athos.models.idao.IAsociacionDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Dorbal Emilio Aldana Ramos
 * @date 4/09/2022
 * @time 14:01:19
 * Carné 2021604
 * Código técnico: IN5BV
 * Grupo: 1
 */
public class AsociacionDaoImpl implements IAsociacionDao{
    public static final String SQL_SELECT = "SELECT libro_id, autor_id, genero_id FROM asociacion_autores_libros";

    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Asociacion asociacion = null;
    private List<Asociacion> listaAsociacion = new ArrayList<>();
    
    @Override
    public List<Asociacion> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();
            
            while (rs.next()) {
                asociacion = new Asociacion(rs.getString("libro_id"), rs.getInt("autor_id"), rs.getInt("genero_id"));
                listaAsociacion.add(asociacion);
                
            }
        } catch (Exception e) {
        } finally {
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        return listaAsociacion;
    }

    @Override
    public boolean add(Asociacion asociacion) {
        return false;
    }

    @Override
    public boolean update(Asociacion asociacion) {
        return false;
    }

    @Override
    public boolean delete(Asociacion asociacion) {
        return false;
    }

}
