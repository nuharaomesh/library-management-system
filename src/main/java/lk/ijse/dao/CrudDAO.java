package lk.ijse.dao;

import org.hibernate.Session;

import java.util.List;

public interface CrudDAO<T> extends SuperDAO {
    boolean save(T entity);
    boolean update(T entity);
    boolean delete(String id);
    T search(T entity);
    List<T> getAll();
}
