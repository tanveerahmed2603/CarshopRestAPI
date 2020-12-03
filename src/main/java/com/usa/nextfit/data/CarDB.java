package com.usa.nextfit.data;

import com.usa.nextfit.model.Car;

import java.util.List;

public interface CarDB {

    //CRUD operations
    public List<Car> getCars() throws DBException;
    public Car getCar(String vin) throws CarNotFoundException;
    public void deleteCar(String vin) throws CarNotFoundException;
    public void updateCar(Car car) throws DBException, CarNotFoundException, DuplicateCarException;
    public void addCar(Car car) throws DuplicateCarException, CarNotFoundException;
}
