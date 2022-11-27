package com.talha.microservice.demo2.rest.users.exceptions;

public class RoleNotFoundException extends RuntimeException {

    public RoleNotFoundException(String message) {
        super(message);
    }

}
