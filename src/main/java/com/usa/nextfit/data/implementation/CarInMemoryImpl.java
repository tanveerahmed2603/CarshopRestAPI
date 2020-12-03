package com.usa.nextfit.data.implementation;

import com.usa.nextfit.data.CarDB;
import com.usa.nextfit.data.CarNotFoundException;
import com.usa.nextfit.data.DBException;
import com.usa.nextfit.data.DuplicateCarException;
import com.usa.nextfit.model.Car;
import com.usa.nextfit.model.CarType;

import java.util.ArrayList;
import java.util.List;

public class CarInMemoryImpl implements CarDB {

    // THIS is an "mock" of your database
    private List<Car> cars = new ArrayList<>();

    public CarInMemoryImpl(){
        loadCars();
    }

    @Override
    public List<Car> getCars() throws DBException {
        return cars;
    }

    @Override
    public Car getCar(String vin) throws CarNotFoundException {
        if (vin == null || vin.length() == 0) {
            throw new CarNotFoundException("Vin can't be null or empty!");
        }
        for (Car car : cars) {
            if (car.getVin().equals(vin)) {
                return car;
            }
        }
        throw new CarNotFoundException("No car exists with this number " + vin + "!");
    }

    @Override
    public void deleteCar(String vin) throws CarNotFoundException {
        if (vin == null || vin.length() == 0) {
            throw new CarNotFoundException("Vin can't be null or empty!");
        }
        for (Car car : cars) {
            if (car.getVin().equals(vin)) {
                cars.remove(car);
                System.out.println(car);
                return;
            }
        }
        throw new CarNotFoundException("No car exists with this number " + vin + "!");

    }

    @Override
    public void updateCar(Car car) throws DBException {
        if (car == null) {
            throw new CarNotFoundException("Vin can't be null or empty!");
        }
        deleteCar(car.getVin());
        addCar(car);
    }

    @Override
    public void addCar(Car car) throws DuplicateCarException {
        if (car == null) {
            throw new DuplicateCarException("Vin can't be null or empty!");
        }

        for (Car carItem : cars) {
            if (carItem.getVin().equals(car.getVin())) {
                throw new DuplicateCarException("Duplicate car entry!");
            }
        }
        cars.add(car);
    }


    public void loadCars() {
        String[] carsStarter = {
                "123A,Honda,Civic,2014,9500,12500,Y",
                "234B,Honda,Accord,2015,12500,16800,N",
                "345C,Cadillac,CTS,2012,22000,2700,Y"
        };

        cars = new ArrayList<>();
        for (String stringCar : carsStarter) {
            String[] fields = stringCar.split(",");
            String vin = fields[0];
            CarType carType = CarType.valueOf(fields[1].toUpperCase());
            String model = fields[2];
            int year = Integer.valueOf(fields[3]);
            double dealerCost = Double.valueOf(fields[4]);
            double salesPrice = Double.valueOf(fields[5]);
            boolean consignment = false;

            if (fields[6].equals("Y")) {
                consignment = true;
            } else {
                consignment = false;
            }
            addTheCar(vin, carType, model, year, dealerCost, salesPrice, consignment);
        }
    }

    private void addTheCar(String vin, CarType carType, String model, int year, double dealerCost, double salesPrice, boolean consignment) {
        Car car = new Car(vin, carType, model, year, dealerCost, salesPrice, consignment);
        cars.add(car);
    }
}
