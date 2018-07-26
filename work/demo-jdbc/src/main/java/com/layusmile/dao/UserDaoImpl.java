package com.layusmile.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.layusmile.entity.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public User findUserByUserId(int id) {
		@SuppressWarnings("unchecked")
		List<User> query = jdbcTemplate.query("select * from user where id = ?", new Object[]{id}, new BeanPropertyRowMapper(User.class));
		if(query != null && query.size()>0) {
			return query.get(0);
		}else {
			return null;
		}
	}
}
