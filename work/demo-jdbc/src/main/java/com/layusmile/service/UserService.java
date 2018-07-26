package com.layusmile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.layusmile.dao.UserDao;
import com.layusmile.entity.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public User findUserByUserId(int id) {
		return userDao.findUserByUserId(id);
	}
}
