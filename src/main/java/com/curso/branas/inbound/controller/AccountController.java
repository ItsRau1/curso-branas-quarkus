package com.curso.branas.inbound.controller;

import com.curso.branas.core.dto.SignUpInput;
import com.curso.branas.core.dto.SignUpOutput;
import com.curso.branas.core.useCase.SignUp;
import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/account")
public class AccountController {

	@Inject
	SignUp signUp;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String hello() {
		return "Hello from Quarkus REST";
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/signup")
	public Response signUp(@Valid SignUpInput signUpInput) {
		SignUpOutput signUpOutput = signUp.execute(signUpInput);
		return Response.status(Response.Status.CREATED).entity(signUpOutput).build();
	}

}
