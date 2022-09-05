package com.athos.models.idao;

import java.util.List;
import com.athos.models.domain.Horario;

/**
 *
 * @author juan jose
 */
public interface IHorarioDao {
    
    public List<Horario> getALL();

    //Agregar un nuevo registro
    public boolean add(Horario horario);

    //Modificar un registro
    public boolean update(Horario horario);

    //Eliminar un registro
    public boolean delete(Horario horario);
}
