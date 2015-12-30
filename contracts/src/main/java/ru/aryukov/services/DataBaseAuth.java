package ru.aryukov.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;
import ru.aryukov.dao.ClientDAO;
import ru.aryukov.model.ClientEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by oleg on 23.12.2015.
 */
@Service("provider")
public class DataBaseAuth implements AuthenticationProvider {

	@Autowired
	private ClientDAO clientDAO;

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {

		String email = authentication.getName();
		String password = authentication.getCredentials().toString();

//		ClientEntity clientEntity = clientDAO.findByLoginPassword(email);
//		if (clientEntity!=null){
			List<GrantedAuthority> grantedAuths = new ArrayList<>();
			grantedAuths.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
			return new UsernamePasswordAuthenticationToken(email, password, grantedAuths);
//		}else{
//			return null;
//		}
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}
}
