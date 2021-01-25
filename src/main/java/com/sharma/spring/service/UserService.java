package com.sharma.spring.service;

import java.util.List;

import com.sharma.spring.model.User;

public interface UserService {
	void save(User user);
	List<User> list();
}
