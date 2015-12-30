package ru.aryukov.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.aryukov.dao.ClientDAO;
import ru.aryukov.model.ClientEntity;

/**
 * Created by oleg on 27.12.2015.
 */
@Service("userDetailsService")
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private ClientDAO clientDAO;
    @Autowired
    private Assembler assembler;

    @Override
    public UserDetails loadUserByUsername(String s)
            throws UsernameNotFoundException {
        UserDetails userDetails = null;
        ClientEntity clientEntity = clientDAO.findByLoginPassword(s);
        System.out.println(clientEntity.getEmail());
        return assembler.buildUserFromUserEntity(clientEntity);
        }
    }

