package ru.aryukov.dao;

import org.springframework.orm.hibernate4.HibernateTemplate;
import ru.aryukov.model.OptionsEntity;
import ru.aryukov.model.TarifEntity;

/**
 * Created by oleg on 02.12.2015.
 */
public class TarifDAOImpl extends CommonDAOImpl<TarifEntity, Integer>  implements TarifDAO {

    public TarifDAOImpl(HibernateTemplate template) {
        super(template);
    }

   // public TarifEntity addAvaliableOptions(OptionsEntity option){};
}
