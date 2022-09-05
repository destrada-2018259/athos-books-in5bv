package com.athos.models.dao;

/**
 * @author Jefferson Gadiel Yuman Pérez
 * @date 4/09/2022
 */

import com.athos.db.Conexion;
import com.athos.models.domain.Libro;
import com.athos.models.idao.ILibroDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LibroDaoImpl implements ILibroDao{
    
    private static final String SQL_SELECT = "SELECT isbn, nombre_libro, prologo, stock, edicion, editorial_id, proveedor_id FROM libros";
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Libro libro = null;
    private List<Libro> listaLibros = new ArrayList<>();
    
    @Override
    public List<Libro> getAll() {
        try{
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();
            while(rs.next()) {
                libro = new Libro(
                    rs.getString("isbn"),
                    rs.getString("nombre_libro"),
                    rs.getString("prologo"),
                    rs.getInt("stock"),
                    rs.getString("edicion"),
                    rs.getInt("editorial_id"),
                    rs.getInt("proveedor_id"));
                listaLibros.add(libro);
            }
        }catch(SQLException e) {
            System.err.println("Se produjo un error al intentar listar los registros de la tabla libros");
            e.printStackTrace(System.out);
        }catch(Exception e) {
            e.printStackTrace(System.out);
        }finally {
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        return listaLibros;
    }
    
    @Override
    public boolean add(Libro libro) {
        return false;
    }
    
    @Override
    public boolean update(Libro libro) {
        return false;
    }
    
    @Override
    public boolean delete(Libro libro) {
        return false;
    }
}