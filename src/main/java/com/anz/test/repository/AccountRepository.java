package com.anz.test.repository;

import org.springframework.data.repository.CrudRepository;

import com.anz.test.models.Account;

public interface AccountRepository extends CrudRepository<Account, String> {
}
