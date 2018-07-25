package com.layusmile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.layusmile.entity.User;

@SpringBootApplication
@RestController
public class Demo02Application {
	@Value("${com.lyusmile.name}")
	private String name;
	@Value("${com.lyusmile.age}")
	private int age;
	
	@GetMapping("/index")
	public String index() {
		return "name : "+ name + "-----age :" + age;
	}
	
	@Autowired
	private User user;
	
	@GetMapping("/user")
	public String user() {
		return "name : "+ user.getName() + "-----age :" + user.getAge();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Demo02Application.class, args);
	}
}
