package com.usa.nextfit.model;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@EqualsAndHashCode
@Getter
@ToString
public class Car {

    // TODO: fix lombok

    private String vin;
    private CarType carType;
    private String model;
    private int year;
    private double dealerCost;
    private double salesPrice;
    private boolean consignment;

    public Car(String vin, CarType carType, String model, int year, double dealerCost, double salesPrice, boolean consignment) {
        this.vin = vin;
        this.carType = carType;
        this.model = model;
        this.year = year;
        this.dealerCost = dealerCost;
        this.salesPrice = salesPrice;
        this.consignment = consignment;
    }

    // ------- TODO: remove this

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getDealerCost() {
        return dealerCost;
    }

    public void setDealerCost(double dealerCost) {
        this.dealerCost = dealerCost;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public boolean isConsignment() {
        return consignment;
    }

    public void setConsignment(boolean consignment) {
        this.consignment = consignment;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vin='" + vin + '\'' +
                ", carType=" + carType +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", dealerCost=" + dealerCost +
                ", salesPrice=" + salesPrice +
                ", consignment=" + consignment +
                '}';
    }
}
