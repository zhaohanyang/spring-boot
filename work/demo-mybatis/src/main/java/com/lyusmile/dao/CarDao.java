package com.lyusmile.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.lyusmile.entity.Car;

@Mapper
public interface CarDao {
	
   int add(Car car);

   int deleteCar(Long id);
   
   int updateCar(Car car);

   List<Car> findAllCar();

   Car findCarById(Long id);
}
