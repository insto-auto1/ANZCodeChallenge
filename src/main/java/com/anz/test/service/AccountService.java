package com.anz.test.service;


import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anz.test.models.Account;
import com.anz.test.models.dto.AccountDto;
import com.anz.test.repository.AccountRepository;
import com.anz.test.responses.AccountResponse;



@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public AccountResponse getAllAccounts() {
        Iterable<Account> accounts = accountRepository.findAll();
        Set<AccountDto> accountResponseSet = new HashSet<>(0);
        
        accounts.forEach(e ->  {
            AccountDto accountDto = new AccountDto(e.getAccountNumber(),
                e.getAccountName(), e.getAccountType(), e.getBalanceDate(), 
                e.getCurrencyCode(), e.getOpeningAvailableBalance());
            accountResponseSet.add(accountDto);
        });
        
        return new AccountResponse(accountResponseSet, 200, "Success");
        
    }
    
    public AccountResponse find(String accountId){
        AccountResponse response  = null;
        Set<AccountDto> accounts = new HashSet<>(0);
        Optional<Account> accountsForId =  accountRepository.findById(accountId);
        if (accountsForId.isPresent() ) {
          
            
            AccountDto accountDto = new AccountDto(accountsForId.get().getAccountNumber(),
                accountsForId.get().getAccountName(), accountsForId.get().getAccountType(), 
                accountsForId.get().getBalanceDate(), accountsForId.get().getCurrencyCode(),
                accountsForId.get().getOpeningAvailableBalance());
            accounts.add(accountDto);
            response = new AccountResponse(accounts, 200, "Success");
        }
        else response = new AccountResponse(accounts, 404 , "No record Found");
        
        return response;
        
    }
}
