
package com.athos.models.idao;

/**
 *
 * @author danye
 */

import java.util.List;
import com.athos.models.domain.Editorial;

public interface IEditorialDao {
    
    public List<Editorial> getAll();
    public boolean add(Editorial editorial);
    public boolean update(Editorial editorial);
    public boolean delete(Editorial editorial);
}
