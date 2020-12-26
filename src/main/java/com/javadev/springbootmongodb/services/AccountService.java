package com.javadev.springbootmongodb.services;

import com.javadev.springbootmongodb.model.Account;
import com.javadev.springbootmongodb.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    public Account findAccountByName(String name) {
        return accountRepository.findByName(name);
    }

    public List<Account> findAll() {
        return accountRepository.findAll();
    }

}
