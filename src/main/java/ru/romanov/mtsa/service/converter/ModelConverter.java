package ru.romanov.mtsa.service.converter;

import ru.romanov.mtsa.persistence.entity.Account;
import ru.romanov.mtsa.servlet.model.AccountModel;

/**
 * Converts models to entities and vice versa
 *
 * @author Egor Romanov
 */
public class ModelConverter {

    public static AccountModel toModel(Account account) {
        AccountModel accountModel = new AccountModel();
        accountModel.setId(account.getId());
        accountModel.setHolderName(account.getHolderName());
        accountModel.setBalance(account.getBalance());
        return accountModel;
    }

    public static Account toEntity(AccountModel accountModel) {
        Account account = new Account();
        account.setId(accountModel.getId());
        account.setHolderName(accountModel.getHolderName());
        account.setBalance(accountModel.getBalance());
        return account;
    }
}
