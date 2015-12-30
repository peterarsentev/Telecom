package ru.aryukov.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import ru.aryukov.dao.ClientDAO;
import ru.aryukov.model.ClientEntity;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by oleg on 22.12.2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-config.xml"})
@WebAppConfiguration
public class ClientServiceImplTest {

    @Autowired
    private ClientService clientService;
    @Test
    public void testAddClient() throws Exception {

    }

    @Test
    public void testListClient() throws Exception {
        List<ClientEntity> res = clientService.listClient();
        for (ClientEntity a:res){
            System.out.println(a.getName());
        }

    }

    @Test
    public void testRemoveClient() throws Exception {

    }
}