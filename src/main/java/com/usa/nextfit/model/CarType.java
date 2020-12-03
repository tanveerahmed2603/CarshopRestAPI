package com.usa.nextfit.model;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum CarType {

	CADILLAC("Cadillac"),
	TOYOTA("Toyota"),
	UNKNOWN("Unkown"),
	FORD("Ford"),
	HONDA("Honda");

	private String carType;

	CarType(String carType) {
		this.carType = carType;
	}

	public String getCarType() {
		return carType;
	}

	// TODO: Get enum from value
	@JsonCreator
	public static CarType fromString(String text) {
        for (CarType c : CarType.values()) {
            if (c.carType.equalsIgnoreCase(text)) {
                return c;
            }
        }
        return null;
    }

}
