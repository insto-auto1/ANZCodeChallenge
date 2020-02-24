package com.anz.test.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Optional;
import java.util.stream.StreamSupport;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.anz.test.models.dto.TransactionDto;
import com.anz.test.responses.TransactionResponse;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Transactional
public class TransactionServiceTest
{

    @Autowired
    private TransactionService transactionService;
    
    
    @Test
    public void When_Valid_AccountID_findTransactionByID_ThenReturn_success() {
        TransactionResponse allTransactions =  transactionService.getTransactionsByAccountId("585309209");
        assertEquals(4, StreamSupport.stream(allTransactions.getTransactionList().spliterator(), false).count());
        Optional<String> optional = StreamSupport.stream(allTransactions.getTransactionList().spliterator(), false)
            .findFirst().map(TransactionDto::getTransactionNarrative);
        assertTrue(optional.isPresent());
        optional.ifPresent(narrativeCurrent -> assertNotNull(narrativeCurrent));
    }
    
    
    
    @Test
    public void When_InValid_AccountID_findTransactionByID_ThenReturn_success() {
        TransactionResponse allTransactions =  transactionService.getTransactionsByAccountId("4332323232");
        
        assertEquals(allTransactions.getResponseStatus(),400);
    }

}
