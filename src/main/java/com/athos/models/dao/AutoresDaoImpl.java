/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.athos.models.dao;

/**
 *
 * @author Bryan Daniel Cabrera Mendoza
 * @date 4/09/2022
 * @time 14:42:49
 */
import com.athos.db.Conexion;
import com.athos.models.domain.Autores;
import com.athos.models.idao.IAutoresDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AutoresDaoImpl implements IAutoresDao {

    private static final String SQL_SELECT = "SELECT id_autor, pais_origen, fecha_nacimiento, persona_id FROM autores";
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Autores autores = null;
    private List<Autores> listaAutores = new ArrayList<>();

    @Override
    public List<Autores> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                autores = new Autores(
                        rs.getInt("id_autor"),
                        rs.getString("pais_origen"),
                        rs.getString("fecha_nacimiento"),
                        rs.getString("persona_id"),
                        rs.getString("nit"),
                        rs.getInt("persona_id"));
                listaAutores.add(autores);
            }

        } catch (Exception e) {
        }
        return listaAutores;
    }

    @Override
    public boolean add(Autores autores) {
        return false;
    }

    @Override
    public boolean update(Autores autores) {
        return false;
    }

    @Override
    public boolean delete(Autores autores) {
        return false;
    }
}
