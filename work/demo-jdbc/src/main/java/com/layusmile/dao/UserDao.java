package com.layusmile.dao;

import com.layusmile.entity.User;

public interface UserDao {
	User findUserByUserId(int id);
}
