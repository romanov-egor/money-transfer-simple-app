package ru.romanov.mtsa.service;

import ru.romanov.mtsa.persistence.entity.Account;
import ru.romanov.mtsa.persistence.repository.AccountRepository;

import java.util.List;

public interface AccountService {

    public void createAccount(String holderName, double balance);

    public void transferMoney(long senderId, long recipientId, double transferAmount);

    public Account getAccount(long id);

    public List<Account> getAccounts();
}