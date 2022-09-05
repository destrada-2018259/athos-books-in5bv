

package com.athos.models.idao;

/**
 *
 * @author Daniel de Jesús Estrada Rojo
 * @date 2/09/2022
 * @time 21:53:41
 *
 * Codigo Tecnico: IN5BV
 */
import java.util.List;
import com.athos.models.domain.Cliente;

public interface IClienteDao {
        public List<Cliente> getAll();
        public boolean add(Cliente cliente);
        public boolean update(Cliente cliente);
        public boolean delete(Cliente cliente);

}
