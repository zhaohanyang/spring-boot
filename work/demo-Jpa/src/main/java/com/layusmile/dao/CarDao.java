package com.layusmile.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.layusmile.entity.Car;

public interface CarDao extends JpaRepository<Car,Long>{
}
