package com.kowalczyk.model.exception;

/**
 * Created by JK on 2018-01-28.
 */
public class ObjectNotFoundException extends GenericException {

    public ObjectNotFoundException(Long id) {
        super(String.format("Object [%s] not found", id), "OBJECT_NOT_FOUND");
    }
}
