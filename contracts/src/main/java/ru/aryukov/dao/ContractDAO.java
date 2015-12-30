package ru.aryukov.dao;

import ru.aryukov.model.ContractEntity;
import ru.aryukov.model.OptionsEntity;
import ru.aryukov.model.TarifEntity;

import java.util.List;

/**
 * Created by oleg on 02.12.2015.
 */
public interface ContractDAO extends CommonDAO<ContractEntity, Integer> {
    ContractEntity findByPhone(String phone);
    List<ContractEntity> findAllContractsByTarifId(TarifEntity tarif);
   // List<OptionsEntity> getConnectedOptions(ContractEntity contractEntity);
}
