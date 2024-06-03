package carsapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import carsapi.entity.Cars;

public interface CarsRepository extends JpaRepository<Cars, Integer> {

}
