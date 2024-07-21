package com.curso.branas.core.useCase;

import com.curso.branas.core.dto.SignUpInput;
import com.curso.branas.core.dto.SignUpOutput;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SignUp {

    public SignUpOutput execute(SignUpInput input) {
        return SignUpOutput.builder().accountId("AccountId").build();
    }
}
