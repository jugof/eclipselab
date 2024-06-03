package carsapi.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import carsapi.entity.Cars;
import carsapi.service.CarsService;

@RestController
public class CarsController {
	
	@Autowired
	private CarsService carsServiceRef;
	
	@GetMapping("/cars-api")
	public Collection<Cars> getAllCars() {
		Collection<Cars> allCars = carsServiceRef.getAllCars();
		return allCars;
	}
	
	@GetMapping("/cars-api/{reqId:\\d+}")
	public Cars getOneCar( @PathVariable("reqId") int id) {
		Cars ocar = carsServiceRef.getOneCar(id);
		return ocar;
	}
	
	@GetMapping("/cars-api/{reqMin:\\d+}/{reqMax:\\d+}")
	public Collection<Cars> getAllCarsInPricerange(@PathVariable("reqMin") Integer min, @PathVariable("reqMax") Integer max){
		return carsServiceRef.getAllCarsInPricerange(min, max);
	}
	
	@GetMapping("/cars-api/{reqMaker:[a-zA-Z]+}/{reqYear:\\d+}")
	public Collection<Cars> getCarsFromMakerAndModel( @PathVariable("reqMaker") String maker, @PathVariable("reqYear") Integer year){
		return carsServiceRef.getCarsFromMakerAndYear(maker, year);
	}
	
	@GetMapping("/cars-api/{reqMaker:[a-zA-Z]+}")
	public Collection<Cars> getCarsFromMaker( @PathVariable("reqMaker") String maker){
		return carsServiceRef.getCarsFromMaker(maker);
	}
	
	@PostMapping("/cars-api")
	public void postCar( @RequestBody Cars car) {
		carsServiceRef.postCar(car);
	}
}
