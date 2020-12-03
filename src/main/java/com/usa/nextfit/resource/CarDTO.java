package com.usa.nextfit.resource;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CarDTO {


    @JsonProperty(value = "vin", required = true)
    private String vin;

    @JsonProperty(value = "carType", required = true)
    private String carType;

    @JsonProperty(value = "model", required = true)
    private String model;

    @JsonProperty(value = "year", required = true)
    private int year;

    @JsonProperty(value = "dealear_cost", required = true)
    private double delaerCost;

    @JsonProperty(value = "sales_price", required = true)
    private double salesPrice;

    @JsonProperty(value = "consignment", required = true)
    private double consignment;

    public CarDTO(String vin, String carType, String model, int year,
                  double delaerCost, double salesPrice, double consignment) {
        this.vin = vin;
        this.carType = carType;
        this.model = model;
        this.year = year;
        this.delaerCost = delaerCost;
        this.salesPrice = salesPrice;
        this.consignment = consignment;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
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

    public double getDelaerCost() {
        return delaerCost;
    }

    public void setDelaerCost(double delaerCost) {
        this.delaerCost = delaerCost;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public double getConsignment() {
        return consignment;
    }

    public void setConsignment(double consignment) {
        this.consignment = consignment;
    }
}
