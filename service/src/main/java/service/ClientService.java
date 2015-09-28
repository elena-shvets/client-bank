package service;

import com.clientbank.repository.model.Client;

import java.util.List;

/**
 * Created by elena on 12.08.15.
 */
public interface ClientService {
    Client save(Client client);
    Client update(Client client);
    void remove(Client client);
    List<Client> findAll();
    Client findOneById(Integer id);
    List<Client> findByLastName(String lastName);
    Client findOneByEmail(String email);
    Client findOneByItn(String itn);
    boolean alreadyExists(String nickName);
}
