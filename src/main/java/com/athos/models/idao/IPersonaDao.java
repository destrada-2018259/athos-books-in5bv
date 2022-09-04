package com.athos.models.idao;

/**
 * @author Jefferson Gadiel Yuman Pérez
 * @date 3/09/2022
 */

import java.util.List;
import com.athos.models.domain.Persona;

public interface IPersonaDao {
    
    public List<Persona> getAll();
    
    public boolean add(Persona persona);
    
    public boolean update(Persona persona);
    
    public boolean delete(Persona persona);
}
