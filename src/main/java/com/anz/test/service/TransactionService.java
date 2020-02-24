package com.anz.test.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anz.test.models.Transaction;
import com.anz.test.repository.TransactionRepository;
import com.anz.test.responses.TransactionResponse;


@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;


    public TransactionResponse getTransactionsByAccountId(String accountNumber) {
        Iterable<Transaction> transactionsForAccount =  transactionRepository.findByAccountNumber(accountNumber);
        Set<Transaction> transactionResponseSet = new HashSet<>(0);
        transactionsForAccount.forEach(e -> transactionResponseSet.add(e));
        return new TransactionResponse("Success", 200, transactionResponseSet);
    }

   
}
