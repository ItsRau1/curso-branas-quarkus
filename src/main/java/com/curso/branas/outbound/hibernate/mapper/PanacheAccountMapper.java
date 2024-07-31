package com.curso.branas.outbound.hibernate.mapper;

import com.curso.branas.core.domain.entity.Account;
import com.curso.branas.core.domain.valueObject.Cpf;
import com.curso.branas.outbound.hibernate.table.PanacheAccount;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.JAKARTA, imports = { Cpf.class })
public interface PanacheAccountMapper {

	PanacheAccount to(Account account);

	@Mapping(target = "password", ignore = true)
	Account from(PanacheAccount panacheAccount);

	default String fromCpf(Cpf cpf) {
		return cpf == null ? null : cpf.toString();
	}

	default Cpf toCpf(String cpf) {
		return cpf == null ? null : new Cpf(cpf);
	}

}
