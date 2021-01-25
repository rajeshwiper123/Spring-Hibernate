package com.sharma.spring.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sharma.spring.dao.UserDao;
import com.sharma.spring.model.User;
import com.sharma.spring.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Transactional
	public void save(User user) {
		userDao.save(user);		
	}

	@Transactional(readOnly = true)
	public List<User> list() {
		return userDao.list();
	}
}
