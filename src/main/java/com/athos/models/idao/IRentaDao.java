
package com.athos.models.idao;

import java.util.List;
import com.athos.models.domain.Renta;

/**
 *
 * @author Dorbal Emilio Aldana Ramos
 */
public interface IRentaDao {
    //Listar todos los registros 
    public List<Renta> getALL();

    //Agregar un nuevo registro
    public boolean add(Renta renta);

    //Modificar un registro
    public boolean update(Renta renta);

    //Eliminar un registro
    public boolean delete(Renta renta);
}
