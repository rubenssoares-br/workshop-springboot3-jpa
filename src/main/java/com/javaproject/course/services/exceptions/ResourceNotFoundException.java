package com.javaproject.course.services.exceptions;

import jakarta.persistence.EntityNotFoundException;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(Object id) {
        super("Resource not found. Id " + id);
    }
}
