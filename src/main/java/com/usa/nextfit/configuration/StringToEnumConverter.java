package com.usa.nextfit.configuration;

import org.springframework.core.convert.converter.Converter;

import com.usa.nextfit.model.CarType;

// TODO: I have to write String to Enum converter in order to bind with JSON
public class StringToEnumConverter implements Converter<String, CarType> {

	@Override
	public CarType convert(String source) {
		try {
			return CarType.valueOf(source.toUpperCase());
		} catch (IllegalArgumentException e) {
			return null;
		}
	}

}