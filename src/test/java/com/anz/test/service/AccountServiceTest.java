package com.anz.test.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.anz.test.models.Account;
import com.anz.test.responses.AccountResponse;

import java.util.Optional;
import java.util.stream.StreamSupport;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Transactional
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void createTestData() {
        accountService.createTestData();
        AccountResponse allAccounts = accountService.getAllAccounts();
        assertEquals(11, StreamSupport.stream(allAccounts.getAccounts().spliterator(), false).count());
    }

    @Test
    public void getAllAccounts() {
        AccountResponse allAccounts =  accountService.getAllAccounts();
        assertEquals(11, StreamSupport.stream(allAccounts.getAccounts().spliterator(), false).count());
        Optional<String> optional = StreamSupport.stream(allAccounts.getAccounts().spliterator(), false).findFirst().map(Account::getAccountName);
        assertTrue(optional.isPresent());
        optional.ifPresent(nameCurrent -> assertEquals("SGSAVINGS726", nameCurrent));
    }
}