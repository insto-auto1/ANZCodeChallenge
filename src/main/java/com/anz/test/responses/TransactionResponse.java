package com.anz.test.responses;

import java.io.Serializable;
import java.util.Set;

import com.anz.test.models.Transaction;

public class TransactionResponse extends ServiceResponse implements Serializable
{

    /**
     * 
     */
    private static final long serialVersionUID = -1272292003736629948L;

    private Set<Transaction> transactionList;


    public TransactionResponse(String responseMessage, int responseStatus)
    {
        super(responseMessage, responseStatus);

    }


    public TransactionResponse(String responseMessage, int responseStatus, Set<Transaction> transaction)
    {
        super(responseMessage, responseStatus);
        this.transactionList = transaction;

    }


    public Set<Transaction> getTransactionList()
    {
        return transactionList;
    }
    

}
