package ru.aryukov.dao;


import org.hibernate.Query;
import ru.aryukov.model.Base;

import javax.persistence.Basic;
import java.io.Serializable;
import java.util.List;

/**
 * Created by oleg on 23.11.2015.
 */
public interface CommonDAO<T extends Base, ID extends Serializable> {

     T save(T entity);

     void merge(T entity);

     void delete(ID id);

     T getById(ID id);

    List<T> getAll();

}
