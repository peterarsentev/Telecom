package ru.aryukov.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.*;

/**
 * Created by oleg on 21.12.2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-config.xml"})
@WebAppConfiguration
public class ContractServiceImplTest {

    @Test
    public void testGetConnectionOptions() throws Exception {

    }

    @Test
    public void testAddOption() throws Exception {

    }

    @Test
    public void testDelitOption() throws Exception {

    }
}