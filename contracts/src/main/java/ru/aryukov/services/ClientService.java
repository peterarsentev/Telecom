package ru.aryukov.services;

import ru.aryukov.model.ClientEntity;
import ru.aryukov.model.ContractEntity;

import java.util.List;

/**
 * Created by oleg on 18.12.2015.
 */
public interface ClientService {

    void addClient(ClientEntity client);

    List<ClientEntity> listClient();

    void removeClient(Integer id);

    List<ContractEntity> getContracts(Integer id);

}
