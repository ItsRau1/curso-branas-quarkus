package com.curso.branas.core.mapper;

import com.curso.branas.core.domain.entity.Account;
import com.curso.branas.core.dto.SignUpInput;
import com.curso.branas.core.dto.SignUpOutput;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.JAKARTA)
public interface AccountMapper {

    Account to(SignUpInput signUpInput);

    SignUpOutput from (Account account);

}
