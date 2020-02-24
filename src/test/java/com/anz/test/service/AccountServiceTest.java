package com.anz.test.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Optional;
import java.util.stream.StreamSupport;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.anz.test.models.dto.AccountDto;
import com.anz.test.responses.AccountResponse;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Transactional
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void createTestData() {
        AccountResponse allAccounts = accountService.getAllAccounts();
        assertEquals(11, StreamSupport.stream(allAccounts.getAccounts().spliterator(), false).count());
    }

    @Test
    public void getAllAccounts() {
        AccountResponse allAccounts =  accountService.getAllAccounts();
        assertEquals(11, StreamSupport.stream(allAccounts.getAccounts().spliterator(), false).count());
        Optional<String> optional = StreamSupport.stream(allAccounts.getAccounts().spliterator(), false).findFirst().map(AccountDto::getAccountName);
        assertTrue(optional.isPresent());
        optional.ifPresent(nameCurrent -> assertEquals("SGCURRENT166", nameCurrent));
    }
}