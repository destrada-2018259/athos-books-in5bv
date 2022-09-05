package com.athos.models.idao;



/**
 *
 * @author Bryan Daniel Cabrera Mendoza
 */

import java.util.List;
import com.athos.models.domain.Autores;

public interface IAutoresDao {
    public List<Autores> getAll();
        public boolean add(Autores autores);
        public boolean update(Autores autores);
        public boolean delete(Autores autores);

}
