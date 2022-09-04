package com.athos.models.idao;

/**
 * @author Jefferson Gadiel Yuman Pérez
 * @date 3/09/2022
 */

import java.util.List;
import com.athos.models.domain.Proveedor;

public interface IProveedorDao {
    
    public List<Proveedor> getAll();
    
    public boolean add(Proveedor proveedor);
    
    public boolean update(Proveedor proveedor);
        
    public boolean delete(Proveedor proveedor);
}
