package com.clientbank.repository.persistence.dao.impl;

import com.clientbank.repository.model.Account;
import com.clientbank.repository.persistence.dao.AccountDAO;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by elena on 10.08.15.
 */
@Repository
@Transactional
public class AccountDAOImpl implements AccountDAO {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Account createAccount() {
        Account account = new Account();

        return account;
    }


    @Override
    public Account save(Account account) {
        entityManager.persist(account);
        return account;
    }

    @Override
    public Account update(Account account) {
        return entityManager.merge(account);

    }

    @Override
    public void remove(Account account) {
        Account removingAccount = entityManager.find(Account.class, account.getId());
        entityManager.remove(removingAccount);

    }

    @Override
    public Account findOneById(int id) {
        return entityManager.find(Account.class, id);
    }

    @Override
    public List<Account> findAll() {
//        Query query = entityManager.createQuery("FROM Account a WHERE :profile not in elements(u.profiles)")
//                .setParameter("profile", profile);
        LinkedList<Account> result = new LinkedList<>();
//        result.addAll(query.getResultList());
        return result;

    }

    @Override
    public Account getAccountsByUserId(int clientId) {
        List<Account> accounts = entityManager.createQuery("from Account a where a.clientId=:clientId")
                .setParameter("clientId", clientId)
                .getResultList();
        return accounts.size() == 0 ? null : accounts.get(0);

    }
}
