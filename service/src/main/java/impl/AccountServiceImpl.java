package impl;

import com.clientbank.repository.model.Account;
import com.clientbank.repository.persistence.dao.AccountDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.AccountService;

import java.util.List;

/**
 * Created by elena on 12.08.15.
 */
@Service("clientService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountDAO accountDAO;

    @Override
    public Account save(Account account) {
        if(account == null){
            throw new IllegalArgumentException("Account must not be null");
        }
        return accountDAO.save(account);
    }

    @Override
    public Account update(Account account) {
        if(account == null){
            throw new IllegalArgumentException("Account must not be null");
        }
        return accountDAO.update(account);
    }

    @Override
    public void remove(Account account) {
        if(account == null){
            throw new IllegalArgumentException("Account must not be null");
        }
         accountDAO.remove(account);

    }

    @Override
    public Account findOneById(Integer id) {
        if(id == null){
            throw new IllegalArgumentException("Account must not be null");
        }
        return accountDAO.findOneById(id);

    }

    @Override
    public List<Account> findAll() {
        List<Account> accounts = accountDAO.findAll();
        return accounts;
    }
}
