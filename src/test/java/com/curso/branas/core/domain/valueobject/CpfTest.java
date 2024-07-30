package com.curso.branas.core.domain.valueobject;

import com.curso.branas.core.domain.exception.CpfInvalid;
import com.curso.branas.core.domain.valueObject.Cpf;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CpfTest {

	@Test
	@DisplayName("Deve instanciar um CPF com um valor válido")
	public void deveInstanciarUmCpf() {
		Cpf cpf = new Cpf("37553905828");
		Assertions.assertNotNull(cpf);
		Assertions.assertEquals("37553905828", cpf.getValue());
	}

	@Test
	@DisplayName("Não deve instanciar um CPF com um valor inválido")
	public void naoDeveInstanciarUmCpf() {
		Assertions.assertThrows(CpfInvalid.class, () -> new Cpf("invalid"));
	}

}
