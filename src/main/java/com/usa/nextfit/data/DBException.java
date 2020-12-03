package com.usa.nextfit.data;

public class DBException extends Exception{

    public DBException(String message){
        super(message);
    }

    public DBException(String message, Throwable throwable){
        super(message, throwable);
    }
}
