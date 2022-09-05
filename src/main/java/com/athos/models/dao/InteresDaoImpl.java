/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.athos.models.dao;

/**
 *
 * @author Daniel de Jesús Estrada Rojo
 * @date 4/09/2022
 * @time 17:50:54
 *
 * Codigo Tecnico: IN5BV
 */

import com.athos.db.Conexion;
import com.athos.models.domain.Editorial;
import com.athos.models.domain.Interes;
import com.athos.models.idao.IInteresDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class InteresDaoImpl implements IInteresDao{

        private static final String SQL_SELECT = "SELECT id_interes, genero_literario_id, cliente_id FROM intereses";
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Interes interes = null;
    private List<Interes> listaIntereses = new ArrayList<>();
    
    @Override
    public List<Interes> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();
            
            while(rs.next()){
                interes = new Interes(
                        rs.getInt("id_interes"),
                        rs.getInt("genero_literario_id"),
                        rs.getInt("cliente_id"));
                listaIntereses.add(interes);
            }
            
        } catch (Exception e) {
        }
        return listaIntereses;
    }

    @Override
    public boolean add(Interes interes) {
        return false;
    }

    @Override
    public boolean update(Interes interes) {
        return false;
    }

    @Override
    public boolean delete(Interes interes) {
        return false;
    }

}
