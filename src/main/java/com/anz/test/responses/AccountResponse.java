package com.anz.test.responses;

import java.io.Serializable;
import java.util.Set;

import com.anz.test.models.dto.AccountDto;

public class AccountResponse extends ServiceResponse implements Serializable
{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private Set<AccountDto>  accounts;
    
    

    public AccountResponse(Set<AccountDto> accounts, int responseStatus, String responseMessage)
    {
        super(responseMessage, responseStatus);
        this.accounts = accounts;
    }



    public Set<AccountDto> getAccounts()
    {
        return accounts;
    }



    
    

}
