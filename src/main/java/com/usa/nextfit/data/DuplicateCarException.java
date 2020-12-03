package com.usa.nextfit.data;

public class DuplicateCarException extends DBException{

    public DuplicateCarException(String message){
        super(message);
    }

    public DuplicateCarException(String message, Throwable throwable){
        super(message, throwable);
    }
}
