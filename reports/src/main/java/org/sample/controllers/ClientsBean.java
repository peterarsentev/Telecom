package org.sample.controllers;

import org.sample.storages.ClientRepository;
import ru.aryukov.model.ClientEntity;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 * TODO: comment
 * @author parsentev
 * @since 30.12.2015
 */
@ManagedBean
@SessionScoped
public class ClientsBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@EJB
	private ClientRepository repository;

	public List<ClientEntity> getClients() {
		return this.repository.findAll();
	}
}
