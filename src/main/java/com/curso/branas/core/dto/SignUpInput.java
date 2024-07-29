package com.curso.branas.core.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SignUpInput {

    private String name;

    private String email;

    private String cpf;

    private String carPlate;

    private Boolean isPassanger;

    private Boolean isDriver;

}
