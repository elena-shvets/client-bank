package com.clientbank.repository.persistence.dao;

/**
 * Created by elena on 11.08.15.
 */
public interface AbstractDAO<T> {

    T findOne(final long id);

    void create(final T entity);

    T update(final T entity);

    void delete(final T entity);

    void deleteById(final int entityId);

}
