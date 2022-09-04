
package com.athos.models.idao;

import java.util.List;
import com.athos.models.domain.Asociacion;

/**
 *
 * @author Dorbal Emilio Aldana Ramos
 * @date 4/09/2022
 * Carné 2021604
 * Código técnico: IN5BV
 * Grupo: 1
 */
public interface IAsociacionDao {
    //Listar los registros
    public List<Asociacion> getAll();
    
    //Insertar un registro
    public boolean add(Asociacion asociacion);
    
    //Modificar un registro
    public boolean update(Asociacion asociacion);
    
    //Eliminar un registro
    public boolean delete(Asociacion asociacion);
}
