package com.clientbank.repository.persistence.dao;

import org.hibernate.Session;
import org.hibernate.StatelessSession;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * Created by elena on 11.08.15.
 */
public interface AbstractHibernateDAO<T> {
    T findOne(final long id);

    List<T> findAll();

    @Transactional
    Serializable save(T entity);

    @Transactional
    void saveOrUpdate(final T entity);

    @Transactional
    T merge(final T entity);

    @Transactional
    void delete(final T entity);

    @Transactional
    void deleteById(final long entityId);

    @Transactional
    void saveAll(Collection<T> entities);

    @Transactional
    void deleteAll(Collection<Long> ids);

    StatelessSession getStatelessSession();

    Session getCurrentSession();
}
