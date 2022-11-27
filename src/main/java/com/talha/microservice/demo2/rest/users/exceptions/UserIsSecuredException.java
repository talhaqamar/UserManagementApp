package com.talha.microservice.demo2.rest.users.exceptions;

public class UserIsSecuredException extends RuntimeException {

    public UserIsSecuredException(String message) {
        super(message);
    }

}
