package ru.aryukov.services;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import ru.aryukov.model.ClientEntity;
import ru.aryukov.model.Role;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by oleg on 27.12.2015.
 */
@Service("assembler")
public class Assembler {

    @Transactional
    UserDetails buildUserFromUserEntity(ClientEntity userEntity) {

        String username = userEntity.getEmail();
        String password = userEntity.getPassword();
//        boolean enabled = userEntity.isActive();
//        boolean accountNonExpired = userEntity.isActive();
//        boolean credentialsNonExpired = userEntity.isActive();
//        boolean accountNonLocked = userEntity.isActive();

        Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
            authorities.add(new SimpleGrantedAuthority(userEntity.getRole().getName()));

        User user = new User(username, password, authorities);
        System.out.println(user.getAuthorities());
        return user;
    }
}
