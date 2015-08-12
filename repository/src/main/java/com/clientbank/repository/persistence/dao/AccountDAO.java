package com.clientbank.repository.persistence.dao;

import com.clientbank.repository.model.Account;

import java.util.List;

/**
 * Created by elena on 10.08.15.
 */
public interface AccountDAO {

    Account createAccount();
    Account save(Account account);
    Account update(Account account);
    void remove(Account account);
    Account findOneById(int id);
    List<Account> findAll();
    Account getAccountsByUserId(int clientId);
}
