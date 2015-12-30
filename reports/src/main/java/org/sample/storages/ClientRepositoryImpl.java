package org.sample.storages;

import ru.aryukov.model.ClientEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * TODO: comment
 * @author parsentev
 * @since 30.12.2015
 */
@Stateless
public class ClientRepositoryImpl implements ClientRepository {

	@PersistenceContext
	private EntityManager em;

	@Override
	public ClientEntity add(ClientEntity entity) {
		this.em.persist(entity);
		return entity;
	}

	@Override
	public List<ClientEntity> findAll() {
		return this.em.createQuery("SELECT e FROM ClientEntity e").getResultList();
	}
}
