package ru.aryukov.dao;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import ru.aryukov.model.ContractEntity;
import ru.aryukov.model.OptionsEntity;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by oleg on 21.12.2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-config.xml"})
@WebAppConfiguration
public class ContractDAOImplTest {

    @Autowired
    private ContractDAO contractDAO;

    @Ignore
    @Test
    public void testFindByPhone() throws Exception {
        ContractEntity res = contractDAO.findByPhone("9413298");
        System.out.println(res.getPhoneNum());


    }

    @Ignore
    @Test
    public void testFindAllContractsByTarifId() throws Exception {
       // List<ContractEntity> res = contractDAO.findAllContractsByTarifId();

    }

}