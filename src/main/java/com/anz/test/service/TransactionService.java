package com.anz.test.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anz.test.models.Transaction;
import com.anz.test.models.dto.TransactionDto;
import com.anz.test.repository.TransactionRepository;
import com.anz.test.responses.TransactionResponse;


@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;



    public TransactionResponse getTransactionsByAccountId(String accountNumber) {
        TransactionResponse  response = null;
        Iterable<Transaction> transactionsForAccount =  transactionRepository.findByAccountNumber(accountNumber);
        Set<TransactionDto> transactionResponseSet = new HashSet<>(0);
        
        transactionsForAccount.forEach(e -> {
            TransactionDto dto = new TransactionDto(e.getAccountNumber(), 
                e.getAccountName(), e.getValueDate(), e.getCurrencyCode(), e.getDebitAmount(), 
                e.getCreditAmount(), e.getDebitCredit(), e.getTransactionNarrative());
            transactionResponseSet.add(dto) ;
        });
        
        if (transactionResponseSet.isEmpty()) {
            response =  new TransactionResponse("No Transaction Found", 400);
        }else {
            
            response = new TransactionResponse("Success", 200, transactionResponseSet);
        }
        
        return response;
    }


   
}
