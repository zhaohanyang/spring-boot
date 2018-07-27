package com.lyusmile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.lyusmile.entity.Car;
import com.lyusmile.service.CarService;

@RestController
@RequestMapping("car")
public class CarController {

	@Autowired
	private CarService carService;

	@PostMapping
	public int add(@RequestBody Car car) {
		return carService.addCar(car);
	}

	@DeleteMapping("")
	public ResponseEntity<String> deleteCar(@RequestParam(value = "id", required = true) Long id) {
		carService.deleteCar(id);
		return ResponseEntity.ok("删除成功");
	}
	
	@PutMapping
	public ResponseEntity<String> updateCar(@RequestBody Car car){
		carService.updateCar(car);
		return ResponseEntity.ok("更新成功");
	}
	
	@GetMapping
	public ResponseEntity<List<Car>> findAllCar(){
		return ResponseEntity.ok(carService.findAllCar());
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Car> findCarById(@PathVariable("id")Long id){
		return ResponseEntity.ok(carService.findCarById(id));
	}
}
