package ru.aryukov.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.aryukov.model.ClientEntity;

import java.util.List;

/**
 * Created by oleg on 25.11.2015.
 */
@Repository
public class ClientDAOImpl extends CommonDAOImpl<ClientEntity, Integer> implements ClientDAO{


    @Autowired
    public ClientDAOImpl(HibernateTemplate template) {
        super(template);
    }

    @Override
    public ClientEntity findByLoginPassword(String email) {

        return  (ClientEntity) template.find("from ru.aryukov.model.ClientEntity client where client.email=?", email).iterator().next();
        //return this.getById(1);
    }
}
