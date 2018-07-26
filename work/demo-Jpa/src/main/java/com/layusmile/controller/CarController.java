package com.layusmile.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.layusmile.entity.Car;
import com.layusmile.service.CarService;

@RestController
@RequestMapping("/car")
public class CarController {

	@Autowired
	private CarService carService;
	
	@GetMapping("/init")
	public String initData() {
		carService.initCarData();
		return "init data success";
	}
	
	@GetMapping("/list")
	public List<Car> listAllCar() {
		return carService.listAllCar();
	}
	
	@GetMapping("/{id}")
	public Car findCarById(@PathVariable("id")Long id) {
		Optional<Car> findCarById = carService.findCarById(id);
		Car car = findCarById.get();
		return car;
	}
}
