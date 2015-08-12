package com.clientbank.repository.persistence.dao.impl;

import com.clientbank.repository.model.Client;
import com.clientbank.repository.persistence.dao.ClientDAO;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by elena on 10.08.15.
 */
@Repository
@Transactional
public class ClientDAOImpl implements ClientDAO {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Client save(Client client) {
        entityManager.persist(client);
        return client;
    }

    @Override
    public void remove(Client client) {
        entityManager.remove(client);
    }

    @Override
    public Client update(Client client) {
        return entityManager.merge(client);
    }

    @Override
    public Client findOneById(int id) {
        return entityManager.find(Client.class, id);
    }

    @Override
    public Client findOneByLastName(String lastName) {
        List<Client> clients = entityManager.createQuery("from Clients c where c.lastName=:lastName")
                .setParameter("lastName", lastName)
                .getResultList();
        return clients.size() == 0 ? null : clients.get(0);
    }

    @Override
    public Client findOneByEmail(String email) {
        List<Client> clients = entityManager.createQuery("from Clients c where c.email=:email")
                .setParameter("email", email)
                .getResultList();
        return clients.size() == 0 ? null : clients.get(0);
    }

    @Override
    public Client findOneByItn(String itn) {
        return null;
    }

    @Override
    public List<Client> findAll(Client cients) {
        return null;
    }
}
