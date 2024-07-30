package com.curso.branas.core.domain.valueObject;

import com.curso.branas.core.domain.exception.CpfInvalid;
import io.quarkus.runtime.util.StringUtil;
import lombok.Getter;

@Getter
public class Cpf {

	private final String value;

	private static final int FACTOR_FIRST_DIGIT = 10;

	private static final int FACTOR_SECOND_DIGIT = 11;

	public Cpf(String cpf) {
		if (!this.validate(cpf))
			throw new CpfInvalid("Cpf inválido", 400);
		this.value = cpf;
	}

	public boolean validate(String rawCpf) {
		if (StringUtil.isNullOrEmpty(rawCpf))
			return false;
		String cpf = removeNonDigits(rawCpf);
		if (!isValidLength(cpf))
			return false;
		if (allDigitsEqual(cpf))
			return false;
		int firstDigit = calculateDigit(cpf, FACTOR_FIRST_DIGIT);
		int secondDigit = calculateDigit(cpf, FACTOR_SECOND_DIGIT);
		return extractDigit(cpf).equals(firstDigit + String.valueOf(secondDigit));
	}

	private String removeNonDigits(String cpf) {
		return cpf.replaceAll("\\D/g", "");
	}

	private boolean isValidLength(String cpf) {
		return cpf.length() == 11;
	}

	private boolean allDigitsEqual(String cpf) {
		char firstDigit = cpf.charAt(0);
		for (char digit : cpf.toCharArray()) {
			if (digit != firstDigit) {
				return false;
			}
		}
		return true;
	}

	private int calculateDigit(String cpf, int factor) {
		int total = 0;
		for (int i = 0; i < cpf.length(); i++) {
			char digit = cpf.charAt(i);
			if (factor > 1) {
				total += Character.getNumericValue(digit) * factor--;
			}
		}
		int remainder = total % 11;
		return (remainder < 2) ? 0 : 11 - remainder;
	}

	private String extractDigit(String cpf) {
		return cpf.substring(9);
	}

}
