package com.curso.branas.inbound.exception;

import com.curso.branas.core.domain.exception.DomainException;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class DomainExceptionHandler implements ExceptionMapper<DomainException> {

    @Override
    public Response toResponse(DomainException e) {
        return Response.status(e.getStatusCode()).entity(ExceptionMessage.of(e.getMessage())).build();
    }

}