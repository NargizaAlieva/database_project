package org.example.database_project.utils.exception;

public class ObjectNotFoundException extends RuntimeException{
    public ObjectNotFoundException(String objectName) {
        super(objectName + " is not found");
    }
}
