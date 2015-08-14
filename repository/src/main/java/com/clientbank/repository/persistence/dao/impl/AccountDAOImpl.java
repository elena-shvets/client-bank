package com.clientbank.repository.persistence.dao.impl;

import com.clientbank.repository.model.Account;
import com.clientbank.repository.model.AccountType;
import com.clientbank.repository.model.Currency;
import com.clientbank.repository.persistence.dao.AccountDAO;
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
public class AccountDAOImpl implements AccountDAO {
    //    @PersistenceContext
//    EntityManager entityManager;
    @Autowired
    @Qualifier("jdbcTemplate")
    private JdbcTemplate jdbcTemplate;


    @Override
    public Account createAccount(Account account) {
        String query = "insert into Account (clientId, typeId, currency, accountType) values (?,?,?,?)";
        jdbcTemplate.update(query, new Object[]{account.getClientId(), account.getTypeId(), account.getCurrency(), account.getAccountType()});
        return account;
    }

//
//    @Override
//    public Account save(Account account) {
//        return account;
//    }

    @Override
    public Account update(Account account) {
        String query = "UPDATE account SET currency= ?,balance= ? WHERE accountId = ?";

        jdbcTemplate.update(
                query,
                new Object[]{account.getCurrency(), account.getBalance(), account.getId()});
        return account;

    }

    @Override
    public void remove(Account account) {
        String query = "DELETE FROM Account WHERE ID = ?";
        int affectedRows = jdbcTemplate.update(query, account.getId());
    }

    @Override
    public Account findOneById(int id) {
        List<Account> accounts = new ArrayList<Account>();
        String query = "SELECT * FROM account WHERE accountId= " + id;
        accounts = jdbcTemplate.query(query, new AccountRowMapper());
        return accounts.get(0);

    }

    @Override
    public List<Account> findAll() {
        List<Account> accounts = new ArrayList<Account>();
        String query = "SELECT * FROM account";
        accounts = jdbcTemplate.query(query, new AccountRowMapper());
        return accounts;

    }

    @Override
    public List<Account> getAccountsByClientId(int clientId) {
        List<Account> accounts = new ArrayList<Account>();
        String query = "SELECT * FROM account WHERE clientId= " + clientId;
        return accounts;

    }


    public class AccountRowMapper implements RowMapper<Account> {

        public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
            Account account = new Account();
            account.setId(rs.getInt("id"));
            account.setCurrency(rs.getObject("currency", Currency.class));
            account.setBalance(rs.getDouble("balance"));
            account.setAccountType(rs.getObject("accountType", AccountType.class));
            return account;
        }
    }

}
