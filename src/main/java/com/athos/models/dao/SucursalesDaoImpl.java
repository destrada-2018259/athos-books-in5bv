package com.athos.models.dao;

/**
 *
 * @author Bryan Daniel Cabrera Mendoza
 * @date 4/09/2022
 * @time 14:59:44
 */
import com.athos.db.Conexion;
import com.athos.models.domain.Sucursales;
import com.athos.models.idao.ISucursalesDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SucursalesDaoImpl implements ISucursalesDao {

    private static final String SQL_SELECT = "SELECT id_sucursal, nombre_sucursal, direccion_sucursal, telefono_sucursal, horario_id, proveedor_id  FROM sucursales";
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Sucursales sucursales = null;
    private List<Sucursales> listaSucursales = new ArrayList<>();

    @Override
    public List<Sucursales> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                sucursales = new Sucursales(
                        rs.getInt("id_sucursal"),
                        rs.getString("nombre_sucursal"),
                        rs.getString("direccion_sucursal"),
                        rs.getString("direccion_sucursal"),
                        rs.getString("telefono_sucursal"),
                        rs.getInt("horario_id"),
                        rs.getInt("proovedor_id"));

                listaSucursales.add(sucursales);
            }

        } catch (Exception e) {
        }
        return listaSucursales;
    }

    @Override
    public boolean add(Sucursales sucursales) {
        return false;
    }

    @Override
    public boolean update(Sucursales sucursales) {
        return false;
    }

    @Override
    public boolean delete(Sucursales sucursales) {
        return false;
    }

}
