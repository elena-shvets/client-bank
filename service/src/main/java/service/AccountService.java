package service;

import com.clientbank.repository.model.Account;

import java.util.List;

/**
 * Created by elena on 12.08.15.
 */
public interface AccountService {

    Account save(Account account);
    Account update(Account account);
    void remove(Account account);
    Account findOneById(Integer id);
    List<Account> findAll();

}
