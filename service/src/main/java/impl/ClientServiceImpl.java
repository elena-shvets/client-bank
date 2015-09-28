package impl;

import com.clientbank.repository.model.Client;
import com.clientbank.repository.persistence.dao.ClientDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.ClientService;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;

/**
 * Created by elena on 12.08.15.
 */
@Service("clientService")
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientDAO clientDAO;

    @Override
    public Client save(@NotNull Client client) {

        return clientDAO.save(client);
    }

    @Override
    public Client update(@NotNull Client client) {

        return clientDAO.update(client);
    }

    @Override
    public void remove(@NotNull Client client) {

        clientDAO.remove(client);
    }

    @Override
    public List<Client> findAll() {
        return null;
    }

    @Override
    public Client findOneById(@NotNull Integer id) {

            return clientDAO.findOneById(id);

    }

    @Override
    public List<Client> findByLastName(String lastName) {
        List<Client> clients = (List<Client>) clientDAO.findByLastName(lastName);
        return clients;
    }

    @Override

    @Pattern(regexp = "^(?:[a-zA-Z0-9_'^&/+-])+(?:\\.(?:[a-zA-Z0-9_'^&/+-])+)" +
            "*@(?:(?:\\[?(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?))\\.)" +
            "{3}(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\]?)|(?:[a-zA-Z0-9-]+\\.)" +
            "+(?:[a-zA-Z]){2,}\\.?)$",
            message = "Email specified does not exist")
    public Client findOneByEmail(@NotNull String email) {

        return  clientDAO.findByEmail(email);
    }

    @Override
    public Client findOneByItn(@NotNull String itn) {

        return  clientDAO.findByItn(itn);
    }

    @Override
    public boolean alreadyExists(String nickName) {
        return false;
    }
}
