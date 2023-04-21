package org.uv.programa05cc;

import java.util.List;

/**
 *
 * @author ZS20006736
 */
public interface IDAOGeneral<T, ID>{
    public T create(T p);
    public boolean delete(ID id);
    public T update(ID id, T p);
    
    public List<T> findAll();
    public T findById(ID id);
}
