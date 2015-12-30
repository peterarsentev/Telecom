package ru.aryukov.services;

import ru.aryukov.model.ContractEntity;
import ru.aryukov.model.OptionsEntity;
import ru.aryukov.model.TarifEntity;

import java.util.List;

/**
 * Created by oleg on 21.12.2015.
 */
public interface ContractService {

    List<OptionsEntity> getConnectionOptions(int contractId);

    void addOption(int optionId, int contractId);

    void delitOption(int optionId, int contractId);

    ContractEntity findByPhone(String phone);

//    void changeTarif(ContractEntity contract, int contractId, TarifEntity tarif);
}
