package com.anz.test.service;


import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anz.test.models.Account;
import com.anz.test.repository.AccountRepository;
import com.anz.test.responses.AccountResponse;



@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public AccountResponse getAllAccounts() {
        Iterable<Account> accounts = accountRepository.findAll();
        Set<Account> accountResponseSet = new HashSet<>(0);
        accounts.forEach(e ->  accountResponseSet.add(e));        
        return new AccountResponse(accountResponseSet, 200, "Success");
        
    }
    
    public AccountResponse find(String accountId){
        AccountResponse response  = null;
        Set<Account> accounts = new HashSet<>(0);
        Optional<Account> accountsForId =  accountRepository.findById(accountId);
        if (accountsForId.isPresent() ) {
            accounts.add(accountsForId.get());
            response = new AccountResponse(accounts, 200, "Success");
        }
        else response = new AccountResponse(accounts, 404 , "No record Found");
        
        return response;
        
    }
}
