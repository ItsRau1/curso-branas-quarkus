package com.curso.branas.outbound.hibernate.mapper;

import com.curso.branas.core.domain.entity.Account;
import com.curso.branas.core.domain.valueObject.Cpf;
import com.curso.branas.outbound.hibernate.table.PanacheAccount;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.JAKARTA, uses = { Cpf.class })
public interface PanacheAccountMapper {

	PanacheAccount to(Account account); // TODO

	Account from(PanacheAccount panacheAccount); // TODO

}
