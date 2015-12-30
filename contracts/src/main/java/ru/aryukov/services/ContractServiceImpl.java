package ru.aryukov.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.aryukov.dao.ContractDAO;
import ru.aryukov.model.ContractEntity;
import ru.aryukov.model.OptionsEntity;
import ru.aryukov.model.TarifEntity;

import java.util.List;

/**
 * Created by oleg on 21.12.2015.
 */
@Service
public class ContractServiceImpl implements ContractService {

    @Autowired
    private ContractDAO contractDAO;

    @Transactional
    public List<OptionsEntity> getConnectionOptions(int contractId) {

        return contractDAO.getById(contractId).getConnectionOptions();
    }

    @Transactional
    public void addOption(int optionId, int contractId) {
        ContractEntity contractEntity = contractDAO.getById(contractId);
        OptionsEntity optionsEntity = new OptionsEntity(optionId);
        List<OptionsEntity> list = contractEntity.getConnectionOptions();
        List<OptionsEntity> avList = contractEntity.getTarifsByContractId().getAvaliableOptions();
        if (!list.contains(optionsEntity) && avList.contains(optionsEntity)) {
            list.add(optionsEntity);
            contractDAO.merge(contractEntity);
        }

    }


    @Transactional
    public void delitOption(int optionId, int contractId) {
        ContractEntity contractEntity = contractDAO.getById(contractId);
        OptionsEntity optionsEntity = new OptionsEntity(optionId);
        List<OptionsEntity> list = contractEntity.getConnectionOptions();
        OptionsEntity s = null;
        for (OptionsEntity a:list)
        {
            if (optionsEntity.equals(a))
                s = a;
        }
        list.remove(s);
    }

    @Transactional
    public ContractEntity findByPhone(String phone) {
        return contractDAO.findByPhone(phone);
    }

//    @Transactional
//    public void changeTarif(int tarifId, int contractId){
//
//        ContractEntity contractEntity = contractDAO.getById(contractId);
//        TarifEntity tarif = new TarifEntity(tarifId);
//        List<OptionsEntity> list = contractEntity.getConnectionOptions();
//        list.clear();
//        contToUpdate.setId(contract.getId());
//        contToUpdate.setClientByClientId(contract.getClientByClientId());
//        contToUpdate.setPhoneNum(contract.getPhoneNum());
//        contToUpdate.setTarifsByContractId(tarif);
//        contToUpdate.setConnectionOptions(list);
//        contractDAO.merge(contToUpdate);
//    }


}
