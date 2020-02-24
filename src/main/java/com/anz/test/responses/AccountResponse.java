package com.anz.test.responses;

import java.io.Serializable;
import java.util.Set;

import org.springframework.web.bind.annotation.ResponseStatus;

import com.anz.test.models.Account;

public class AccountResponse extends ServiceResponse implements Serializable
{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private Set<Account>  accounts;
    
    

    public AccountResponse(Set<Account> accounts, int responseStatus, String responseMessage)
    {
        super(responseMessage, responseStatus);
        this.accounts = accounts;
    }



    public Set<Account> getAccounts()
    {
        return accounts;
    }



    
    

}
