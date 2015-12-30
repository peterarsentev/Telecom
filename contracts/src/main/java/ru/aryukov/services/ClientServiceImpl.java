package ru.aryukov.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.aryukov.dao.ClientDAO;
import ru.aryukov.model.ClientEntity;
import ru.aryukov.model.ContractEntity;

import java.util.List;

/**
 * Created by oleg on 18.12.2015.
 */
@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientDAO clientDAO;

    @Transactional
    public void addClient(ClientEntity client) {
        clientDAO.save(client);
    }

    @Transactional
    public List<ClientEntity> listClient() {
        return clientDAO.getAll();
    }

    @Transactional
    public void removeClient(Integer id) {
        clientDAO.delete(id);
    }

    @Transactional
    public List<ContractEntity> getContracts(Integer id) {
        ClientEntity clientEntity = clientDAO.getById(id);
        return clientEntity.getContractsByClientId();
    }


}
