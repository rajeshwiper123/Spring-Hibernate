package com.sharma.spring.dao;

import java.util.List;

import com.sharma.spring.model.User;

public interface UserDao {
	void save(User user);
	List<User> list();
}
