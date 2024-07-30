package com.curso.branas.core.domain.exception;

public class ExistByEmail extends DomainException {

	public ExistByEmail(String message, int statusCode) {
		super(message, statusCode);
	}

}
