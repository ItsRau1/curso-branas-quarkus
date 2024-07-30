package com.curso.branas.core.domain.exception;

public class CpfInvalid extends DomainException {

	public CpfInvalid(String message, int statusCode) {
		super(message, statusCode);
	}

}
