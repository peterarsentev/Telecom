package ru.aryukov.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import ru.aryukov.model.ContractEntity;
import ru.aryukov.model.OptionsEntity;
import ru.aryukov.model.TarifEntity;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * Created by oleg on 02.12.2015.
 */
@Repository
public class ContractDAOImpl extends CommonDAOImpl<ContractEntity, Integer> implements ContractDAO {


    @Autowired
    public ContractDAOImpl(HibernateTemplate template){
        super(template);
    }

    public ContractEntity findByPhone(String phone) {
       return (ContractEntity) template.find("from ru.aryukov.model.ContractEntity contract where contract.phoneNum=?", phone).iterator().next();
    }

    public List<ContractEntity> findAllContractsByTarifId(TarifEntity tarif) {
        return (List<ContractEntity>)template.find("from ContractEntity where tarifsByContractId=?", tarif);
    }

   /* public List<OptionsEntity> getConnectedOptions(ContractEntity entity){
        return (List<OptionsEntity>) entity.getConnectionOptions();
    }*/


}
