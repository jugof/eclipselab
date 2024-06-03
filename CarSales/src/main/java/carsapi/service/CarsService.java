package carsapi.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import carsapi.entity.Cars;
import carsapi.repository.CarsRepository;

@Service
public class CarsService {
	
	//Injecting Repository into service
	@Autowired(required = false)
	private CarsRepository carsRepoRef;
	
	// retrieving the all cars
	public Collection<Cars> getAllCars() {
		Collection<Cars> allCars = carsRepoRef.findAll();
		return allCars;
	}
	
	// retrieving the all cars based on its ID 
	public Cars getOneCar(int id) {
		Cars car = null;
		Optional<Cars> oneCar = carsRepoRef.findById(id);
		if(oneCar.isPresent()) {
			car = oneCar.get();
		}
		return car;
	}
	
	// retrieving the all cars based on  minimum and max of price 
	public Collection<Cars> getAllCarsInPricerange(Integer min, Integer max){
		List<Cars> allCars = null;
				 allCars = carsRepoRef.findAll().stream().filter(car -> (car.getPrice() >= min && car.getPrice() <= max) ).toList();
		
		return allCars;
	}
	
	// retrieving the all cars based on  Manufacturer and year
	public Collection<Cars> getCarsFromMakerAndYear(String maker, Integer year){
		Collection<Cars> allCars =
				carsRepoRef.findAll().stream().filter(car -> (car.getMaker() == maker && car.getYear() == year) ).toList();
		
		return allCars;
	}
	
	// retrieving the all cars based on  Manufacturer 
	public Collection<Cars> getCarsFromMaker(String maker){
		Collection<Cars> allCars =
				carsRepoRef.findAll().stream().filter(car -> (car.getMaker() == maker) ).toList();
		
		return allCars;
	}
	
	//adding a car in DataBase 
	public void postCar(Cars car) {
		carsRepoRef.save(car);
	}
	
}







