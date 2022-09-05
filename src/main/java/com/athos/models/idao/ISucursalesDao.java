package com.athos.models.idao;

/**
 *
 * @author Bryan Daniel Cabrera Mendoza
 */

import java.util.List;
import com.athos.models.domain.Sucursales;

public interface ISucursalesDao {
    public List<Sucursales> getAll();
        public boolean add(Sucursales sucursales);
        public boolean update(Sucursales sucursales);
        public boolean delete(Sucursales sucursales);
}
