package impl;

import com.clientbank.repository.model.Account;
import com.clientbank.repository.persistence.dao.AccountDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.AccountService;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by elena on 12.08.15.
 */
@Service("clientService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountDAO accountDAO;

    @Override
    public Account save(@NotNull Account account) {
        return accountDAO.createAccount(account);
    }

    @Override
    public Account update(@NotNull Account account) {

        return accountDAO.update(account);
    }

    @Override
    public void remove(@NotNull Account account) {

         accountDAO.remove(account);

    }

    @Override
    public Account findOneById(@NotNull Integer id) {

        return accountDAO.findOneById(id);

    }

    @Override
    public List<Account> findAll() {
        List<Account> accounts = accountDAO.findAll();
        return accounts;
    }
}
