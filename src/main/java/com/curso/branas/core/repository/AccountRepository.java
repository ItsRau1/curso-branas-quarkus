package com.curso.branas.core.repository;

import com.curso.branas.core.domain.entity.Account;

import java.util.List;
import java.util.Optional;

public interface AccountRepository {
    Optional<Account> findAccountByEmail(String email);
    Optional<Account> findAccountById(String accountId);
    void saveAccount(Account account);
    Optional<List<Account>> list();
}
