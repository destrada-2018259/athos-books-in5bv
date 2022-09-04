package com.athos.models.dao;

/**
 * @author Jefferson Gadiel Yuman Pérez
 * @date 3/09/2022
 */

import com.athos.db.Conexion;
import com.athos.models.domain.Proveedor;
import com.athos.models.idao.IProveedorDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProveedorDaoImpl implements IProveedorDao{
    
    private static final String SQL_SELECT = "SELECT id_proveedor, nombre_proveedor, telefono_proveedor, email_proveedor, direccion FROM proveedores";
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Proveedor proveedor = null;
    private List<Proveedor> listaProveedores = new ArrayList<>();
    
    @Override
    public List<Proveedor> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();
            while(rs.next()) {
                proveedor = new Proveedor(
                    rs.getInt("id_proveedor"),
                    rs.getString("nombre_proveedor"),
                    rs.getString("telefono_proveedor"),
                    rs.getString("email_proveedor"),
                    rs.getString("direccion"));
                listaProveedores.add(proveedor);
            }
        }catch(SQLException e) {
            System.err.println("Se produjo un error al intentar listar los registros de la entidad Proveedores");
            e.printStackTrace(System.out);
        }catch(Exception e) {
            e.printStackTrace(System.out);
        }finally {
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        return listaProveedores;
    }
    
    @Override
    public boolean add(Proveedor proveedor) {
        return false;
    }
    
    @Override
    public boolean update(Proveedor proveedor) {
        return false;
    }
    
    @Override
    public boolean delete(Proveedor proveedor) {
        return false;
    }
}