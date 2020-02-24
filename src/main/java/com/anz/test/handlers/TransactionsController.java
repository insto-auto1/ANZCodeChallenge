package com.anz.test.handlers;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anz.test.responses.TransactionResponse;
import com.anz.test.service.TransactionService;


@RestController
@RequestMapping("v1/transactions")
public class TransactionsController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping("/{accountId}")
    public TransactionResponse getTransactions(@Valid @PathVariable String accountId) {
        return transactionService.getTransactionsByAccountId(accountId);
    }
}