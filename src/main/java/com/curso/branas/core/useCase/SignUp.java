package com.curso.branas.core.useCase;

import com.curso.branas.core.domain.entity.Account;
import com.curso.branas.core.domain.exception.ExistByEmail;
import com.curso.branas.core.domain.repository.AccountRepository;
import com.curso.branas.core.dto.SignUpInput;
import com.curso.branas.core.dto.SignUpOutput;
import com.curso.branas.core.mapper.AccountMapper;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class SignUp {

    @Inject
    AccountRepository accountRepository;

    @Inject
    AccountMapper accountMapper;

    public SignUpOutput execute(SignUpInput input) {
        Boolean existByEmail = accountRepository.existsByEmail(input.getEmail());
        if (existByEmail)
            throw new ExistByEmail( "Account with e-mail already exists.",400);
        Account account = accountMapper.to(input);
        account = accountRepository.save(account);
        return accountMapper.from(account);
    }

}
