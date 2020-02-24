package com.anz.test.handlers;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anz.test.responses.AccountResponse;
import com.anz.test.service.AccountService;



@RestController
@RequestMapping("v1/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

  
    @GetMapping("/{accountId}")
    public AccountResponse getAccounts(@Valid @PathVariable String accountId) {
        return accountService.find(accountId);
    }
    
   
    @GetMapping("/")
    public AccountResponse getAllAccounts() {
        return accountService.getAllAccounts();
    }
    
}