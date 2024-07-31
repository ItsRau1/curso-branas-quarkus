package com.curso.branas.core.domain.entity;

import com.curso.branas.core.domain.valueObject.Cpf;
import jakarta.persistence.Column;
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

	private Boolean isPassanger;

	private Boolean isDriver;

	private String password;

	public void cadastrar() {
		this.id = UUID.randomUUID().toString();
	}

}
