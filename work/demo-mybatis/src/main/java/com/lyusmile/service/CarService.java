package com.lyusmile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lyusmile.dao.CarDao;
import com.lyusmile.entity.Car;

@Service
public class CarService {
	
	@Autowired
	private CarDao carDao;
	
	public int addCar(Car car) {
		return carDao.add(car);
	}

	public int deleteCar(Long id) {
		return carDao.deleteCar(id);
	}

	public int updateCar(Car car) {
		return carDao.updateCar(car);
	}

	public List<Car> findAllCar() {
		return carDao.findAllCar();
	}

	public Car findCarById(Long id) {
		return carDao.findCarById(id);
	}
}
