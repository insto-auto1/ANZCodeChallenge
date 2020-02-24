package com.anz.test.repository;

import org.springframework.data.repository.CrudRepository;

import com.anz.test.models.Transaction;

import java.util.List;

public interface TransactionRepository extends CrudRepository<Transaction, Long> {
    //JPA Query method
    List<Transaction> findByAccountNumber(String accountNumber);
}
