package com.talha.microservice.demo2.rest.users.exceptions;

public class InvalidConfigurationException extends RuntimeException {

    public InvalidConfigurationException(String message) {
        super(message);
    }

}
