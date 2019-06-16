package model.interf;

import java.util.List;

public interface DAOInterf<E> {
    
    public void add(E e);
    public void update(E e);
    public E search(int id);
    public void remove(int id);
 
}
