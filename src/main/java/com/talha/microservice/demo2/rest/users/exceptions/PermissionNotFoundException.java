package com.talha.microservice.demo2.rest.users.exceptions;

public class PermissionNotFoundException extends RuntimeException {

    public PermissionNotFoundException(String message) {
        super(message);
    }

}
