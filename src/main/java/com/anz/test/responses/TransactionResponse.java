package com.anz.test.responses;

import java.io.Serializable;
import java.util.Set;

import com.anz.test.models.dto.TransactionDto;

public class TransactionResponse extends ServiceResponse implements Serializable
{

    /**
     * 
     */
    private static final long serialVersionUID = -1272292003736629948L;

    private Set<TransactionDto> transactionList;


    public TransactionResponse(String responseMessage, int responseStatus)
    {
        super(responseMessage, responseStatus);

    }


    public TransactionResponse(String responseMessage, int responseStatus, Set<TransactionDto> transaction)
    {
        super(responseMessage, responseStatus);
        this.transactionList = transaction;

    }


    public Set<TransactionDto> getTransactionList()
    {
        return transactionList;
    }
    

}
