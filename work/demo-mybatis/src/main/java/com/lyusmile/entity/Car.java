package com.lyusmile.entity;

import java.math.BigDecimal;

/**
 * 	汽车实体类
 *  @author zhaohanyang
 */
public class Car {
	private Long id;//主键ID
	
	private String brand; //品牌
	
	private BigDecimal price;//价格

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
}
