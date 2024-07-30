package com.curso.branas.core.domain.entity;

import com.curso.branas.core.domain.valueObject.Cpf;
import lombok.*;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Account {

	private String id;

	private Cpf cpf;

	private String name;

	private String email;

	private String carPlate;

	public static Account create(String name, String email, String cpf, String carPlate, Boolean isPassanger,
			Boolean isDriver) throws Exception {
		String accountId = UUID.randomUUID().toString();
		return Account.builder().name(name).email(email).cpf(new Cpf(cpf)).carPlate(carPlate).build();
	}

}
