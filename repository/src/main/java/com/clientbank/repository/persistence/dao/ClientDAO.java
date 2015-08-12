package com.clientbank.repository.persistence.dao;

import com.clientbank.repository.model.Client;

import java.util.List;

/**
 * Created by elena on 10.08.15.
 */
public interface ClientDAO {

    Client save(Client client);
    void remove(Client client);
    Client update(Client client);
    Client findOneById(int id);
    Client findOneByLastName(String lastName);
    Client findOneByEmail(String email);
    Client findOneByItn(String itn);
    List<Client> findAll(Client cients);
}
