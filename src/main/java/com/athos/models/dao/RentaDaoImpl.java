
package com.athos.models.dao;

import com.athos.db.Conexion;
import com.athos.models.domain.Renta;
import com.athos.models.idao.IRentaDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dorbal Emilio Aldana Ramos
 * @date 3/09/2022
 * @time 12:51:54
 * Carné 2021604
 * Código técnico: IN5BV
 * Grupo: 1
 */
public class RentaDaoImpl implements IRentaDao{

    public static final String SQL_SELECT = "SELECT id_renta, fecha_renta, fecha_devolucion, cliente_id, libro_id, sucursal_id FROM rentas";
    
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Renta renta = null;
    private List<Renta> listaRenta = new ArrayList<>();
    
    @Override
    public List<Renta> getALL() {
        try
        {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();
            while (rs.next())
            {
                renta = new Renta(rs.getInt("id_renta"), rs.getDate("fecha_renta").toLocalDate(), rs.getDate("fecha_devolucion").toLocalDate(), rs.getInt("cliente_id"), rs.getString("libro_id"), rs.getInt("sucursal_id"));
                listaRenta.add(renta);

            }
        } catch (SQLException e)
        {
            System.err.println("Se produjo un error al intentar listar las rentas");
            e.printStackTrace(System.out);
        } catch (Exception e)
        {
            e.printStackTrace(System.out);
        } finally
        {
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        return listaRenta;
    }

    @Override
    public boolean add(Renta renta) {
        return false;
    }

    @Override
    public boolean update(Renta renta) {
        return false;
    }

    @Override
    public boolean delete(Renta renta) {
        return false;
    }
}
