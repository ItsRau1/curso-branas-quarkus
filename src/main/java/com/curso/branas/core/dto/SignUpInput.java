package com.curso.branas.core.dto;

import com.curso.branas.core.domain.valueObject.Cpf;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SignUpInput {

	@NotBlank(message = "Name is required.")
	private String name;

	@NotBlank(message = "E-mail is required.")
	private String email;

	@Valid
	private Cpf cpf;

	private String carPlate;

	private Boolean isPassanger;

	private Boolean isDriver;

}
