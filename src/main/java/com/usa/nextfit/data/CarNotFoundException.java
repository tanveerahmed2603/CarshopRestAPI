package com.usa.nextfit.data;

public class CarNotFoundException extends DBException{

    public CarNotFoundException(String message){
        super(message);
    }

    public CarNotFoundException(String message, Throwable throwable){
        super(message, throwable);
    }
}
