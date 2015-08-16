package com.clientbank.repository.persistence.dao.impl;

import com.clientbank.repository.model.Client;
import com.clientbank.repository.persistence.dao.ClientDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by elena on 10.08.15.
 */
//@Repository
//@Transactional
@Component
public class ClientDAOImpl implements ClientDAO {
    //    @PersistenceContext
//    EntityManager entityManager;
    @Autowired
    @Qualifier("jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Override
    public Client save(Client client) {
        String query = "insert into Account (clientId, typeId, currency, accountType) values (?,?,?,?)";
        jdbcTemplate.update(query, new Object[]{client.getEmail(), client.getPassword(), client.getLastName(), client.getItn()});
        return client;
    }

    @Override
    public void remove(Client client) {
        String query = "DELETE FROM Client WHERE ID = ?";
        int affectedRows = jdbcTemplate.update(query, client.getId());
    }

    @Override
    public Client update(Client client) {
        String query = "UPDATE client SET email = ?, password = ?, lastName = ? WHERE clientId= ?";

        jdbcTemplate.update(
                query,
                new Object[]{client.getEmail(), client.getPassword(), client.getLastName()});
        return client;
    }

    @Override
    public Client findOneById(int id) {
        List<Client> clients = new ArrayList<Client>();
        String query = "SELECT * FROM client WHERE id= " + id;
        clients = jdbcTemplate.query(query, new ClientRowMapper());
        return clients.get(0);
    }

    @Override
    public Client findByLastName(String lastName) {
        List<Client> clients = entityManager.createQuery("from Clients c where c.lastName=:lastName")
                .setParameter("lastName", lastName)
                .getResultList();
        return clients.size() == 0 ? null : clients.get(0);
    }

    @Override
    public Client findByEmail(String email) {
        List<Client> clients = entityManager.createQuery("from Clients c where c.email=:email")
                .setParameter("email", email)
                .getResultList();
        return clients.size() == 0 ? null : clients.get(0);
    }

    @Override
    public Client findByItn(String itn) {
        return null;
    }

    @Override
    public List<Client> findAll(Client client) {
        return null;
    }

    public class ClientRowMapper implements RowMapper<Client> {

        public Client mapRow(ResultSet rs, int rowNum) throws SQLException {
            Client client = new Client();
            client.setId(rs.getInt("id"));
            client.setEmail(rs.getString("email"));
            client.setPassword(rs.getString("password"));
            client.setLastName(rs.getString("lastName"));
            return client;
        }
    }
}
