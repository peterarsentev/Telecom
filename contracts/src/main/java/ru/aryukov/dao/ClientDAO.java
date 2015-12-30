package ru.aryukov.dao;


import ru.aryukov.model.ClientEntity;

import java.util.List;

/**
 * Created by oleg on 25.11.2015.
 */
public interface ClientDAO extends CommonDAO<ClientEntity, Integer> {

    ClientEntity findByLoginPassword(String email);


}
