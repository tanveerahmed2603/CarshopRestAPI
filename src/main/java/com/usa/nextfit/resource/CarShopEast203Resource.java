package com.usa.nextfit.resource;

import com.usa.nextfit.data.CarDB;
import com.usa.nextfit.data.DBException;
import com.usa.nextfit.data.implementation.CarInMemoryImpl;
import com.usa.nextfit.model.Car;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarShopEast203Resource {

	private CarDB db;

	public CarShopEast203Resource() {
		if (db == null) {
			db = new CarInMemoryImpl();
		}
	}

	@GetMapping("/cars")
	public List<Car> getCars() throws DBException {
		return db.getCars();
	}

	@GetMapping("/cars/{vin}")
	public Car getCarWithVin(@PathVariable String vin) throws DBException {
		return db.getCar(vin);
	}

	@PostMapping("/cars/addCar")
	void addCar(@RequestBody Car car) throws DBException {
		db.addCar(car);
	}

	// TODO: Changed @PathVariable to @RequestBody
	@PutMapping("/cars")
	void updateCar(@RequestBody Car car) throws DBException {
		db.updateCar(car);
	}

	@DeleteMapping("/cars/{vin}")
	void deleteCar(@PathVariable String vin) throws DBException {
		db.deleteCar(vin);
	}

}
