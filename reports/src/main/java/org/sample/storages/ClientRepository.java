package org.sample.storages;

import ru.aryukov.model.ClientEntity;

import javax.ejb.Local;
import java.util.List;

/**
 * TODO: comment
 * @author parsentev
 * @since 30.12.2015
 */
@Local
public interface ClientRepository {
	ClientEntity add(ClientEntity entity);

	List<ClientEntity> findAll();
}
