package com.athos.models.idao;

import java.util.List;
import com.athos.models.domain.Empleado;

/**
 *
 * @author juan jose
 */
public interface IEmpleadoDao {
        public List<Empleado> getAll();
        
        public boolean add(Empleado empleado);
        
        public boolean update(Empleado empleado);
        
        public boolean delete(Empleado empleado);
}
