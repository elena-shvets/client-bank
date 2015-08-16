package impl;

import com.clientbank.repository.model.Client;
import com.clientbank.repository.persistence.dao.ClientDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.ClientService;

import java.util.List;

/**
 * Created by elena on 12.08.15.
 */
@Service("clientService")
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientDAO clientDAO;

    @Override
    public Client save(Client client) {
        if (client == null) {
            throw new IllegalArgumentException("Client must not be null");
        }
        return clientDAO.save(client);
    }

    @Override
    public Client update(Client client) {
        if (client == null) {
            throw new IllegalArgumentException("Client must not be null");
        }
        return clientDAO.update(client);
    }

    @Override
    public void remove(Client client) {
        if (client == null) {
            throw new IllegalArgumentException("Client must not be null");
        }
        clientDAO.remove(client);
    }

    @Override
    public List<Client> findAll() {
        return null;
    }

    @Override
    public Client findOneById(Integer id) {
        if (id != null) {
            return clientDAO.findOneById(id);
        }
        throw new IllegalArgumentException("Client must not be null");
    }

    @Override
    public List<Client> findByLastName(String lastName) {
        List<Client> clients = (List<Client>) clientDAO.findByLastName(lastName);
        return clients;
    }

    @Override
    public Client findOneByEmail(String email) {
        if (email == null) {
            throw new IllegalArgumentException("Client must not be null");
        }
        return  clientDAO.findByEmail(email);
    }

    @Override
    public Client findOneByItn(String itn) {
        if (itn == null) {
            throw new IllegalArgumentException("Client must not be null");
        }
        return  clientDAO.findByItn(itn);
    }
}
