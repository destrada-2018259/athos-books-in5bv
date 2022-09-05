package com.athos.models.idao;

/**
 * @author Jefferson Gadiel Yuman Pérez
 * @date 4/09/2022
 */

import java.util.List;
import com.athos.models.domain.Libro;

public interface ILibroDao {
    
    public List<Libro> getAll();
    
    public boolean add(Libro libro);
    
    public boolean update(Libro libro);
    
    public boolean delete(Libro libro);
}
