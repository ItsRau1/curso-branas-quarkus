package com.curso.branas.inbound.controller;

import com.curso.branas.core.dto.SignUpInput;
import com.curso.branas.core.dto.SignUpOutput;
import com.curso.branas.core.useCase.SignUp;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/account")
public class AccountController {

    @Inject
    private SignUp signUp;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String hello() {
        return "Hello from Quarkus REST";
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/signup")
    public Response signUp(SignUpInput signUpInput) {
        SignUpOutput signUpOutput = signUp.execute(signUpInput);
        return Response.status(Response.Status.CREATED).entity(signUpOutput).build();
    }
}
