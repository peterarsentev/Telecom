package ru.aryukov.dao;

import org.hibernate.Query;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.aryukov.model.Base;

import javax.persistence.Entity;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by oleg on 23.11.2015.
 */

public abstract class CommonDAOImpl<T extends Base, ID extends Serializable> implements CommonDAO<T,ID> {

    private final Class<T> entity;

    protected final HibernateTemplate template;

    public CommonDAOImpl(HibernateTemplate template) {
        this.entity = ((Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
        this.template = template;
    }


    @Transactional
    public T save(T entity) {
       template.save(entity);
        return entity;
    }


    @Transactional
    public void merge(T entity) {
        template.merge(entity);
    }

//TODO rewrite
    @Transactional
    public void delete(ID id) {
        T t = null;
        try {
            t = entity.newInstance();
            t.setId((Integer)id);
            template.delete(t);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
//What do hear?
    public List<T> getAll() {
        List<T> t;
        t = (List<T>) template.find(String.format("from %s", this.entity.getName()));
        return t;
    }
//And hear
    public T getById(ID id) {

        return template.get(this.entity, id);
    }

}
