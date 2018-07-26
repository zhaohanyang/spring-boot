package com.layusmile.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.layusmile.dao.CarDao;
import com.layusmile.entity.Car;

@Service
public class CarService {

	@Autowired
	private CarDao cardao;
	
	public void initCarData() {
		Car car = new Car();
		car.setBrand("BMW");
		car.setPrice(new BigDecimal("200"));
		cardao.save(car);
	}

	public List<Car> listAllCar() {
		return cardao.findAll();
	}

	public Optional<Car> findCarById(Long id) {
		return cardao.findById(id);
	} 
}
