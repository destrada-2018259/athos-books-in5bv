/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.athos.models.idao;

/**
 *
 * @author Daniel de Jesús Estrada Rojo
 * @date 4/09/2022
 * @time 17:47:29
 *
 * Codigo Tecnico: IN5BV
 */
import java.util.List;
import com.athos.models.domain.Interes;

public interface IInteresDao {
    
    public List<Interes> getAll();
    public boolean add(Interes interes);
    public boolean update(Interes interes);
    public boolean delete(Interes interes);
    
}
