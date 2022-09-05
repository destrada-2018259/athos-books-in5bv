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
import com.athos.models.domain.Cliente;
import com.athos.models.domain.Interes;
import com.athos.models.idao.IClienteDao;
import com.athos.models.idao.IInteresDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDaoImpl implements IClienteDao{

    private static final String SQL_SELECT = "SELECT id_cliente, direccion, email_cliente, telefono_cliente, nit, persona_id FROM clientes";
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Cliente cliente = null;
    private List<Cliente> listaClientes = new ArrayList<>();
    
    @Override
    public List<Cliente> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();
            
            while(rs.next()){
                cliente = new Cliente(
                        rs.getInt("id_cliente"),
                        rs.getString("direccion"),
                        rs.getString("email_cliente"),
                        rs.getString("telefono_cliente"),
                        rs.getString("nit"),
                        rs.getInt("persona_id"));
                listaClientes.add(cliente);
            }
            
        } catch (Exception e) {
        }
        return listaClientes;
    }

    @Override
    public boolean add(Cliente cliente) {
        return false;
    }

    @Override
    public boolean update(Cliente cliente) {
        return false;
    }

    @Override
    public boolean delete(Cliente cliente) {
        return false;
    }

}
