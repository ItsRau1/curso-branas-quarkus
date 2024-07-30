package com.curso.branas.core.domain.repository;

import com.curso.branas.core.domain.entity.Account;

public interface AccountRepository {

    Boolean existsByEmail(String email);

    Account save(Account account);

}
