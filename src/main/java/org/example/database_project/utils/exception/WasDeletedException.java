package org.example.database_project.utils.exception;

public class WasDeletedException extends RuntimeException{
    public WasDeletedException(String objectName) {
        super("This " + objectName + " was deleted");
    }

}
