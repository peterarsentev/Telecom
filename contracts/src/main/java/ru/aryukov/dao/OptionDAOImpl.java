package ru.aryukov.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import ru.aryukov.model.OptionsEntity;

/**
 * Created by oleg on 23.12.2015.
 */
public class OptionDAOImpl extends CommonDAOImpl<OptionsEntity, Integer> implements OptionDAO {
    @Autowired
    public OptionDAOImpl(HibernateTemplate template) {
        super(template);
    }
}
