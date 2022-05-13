package com.springapps.phaseproject.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springapps.phaseproject.dao.UserDao;
import com.springapps.phaseproject.entity.User;
import com.springapps.phaseproject.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;

	@Override
	@Transactional
	public int save(User user) {
		return userDao.create(user);
	}

	@Override
	public List<User> getUsers() {
		List<User> users = userDao.findUsers();
		return users;
	}

	@Override
	public List<User> getSpecificUsers() {
		List<User> user = userDao.findSpecificUsers();
		return user;
	}

	@Override
	public List<User> getSpecificCategory() {
		List<User> user = userDao.findSpecificCategory();
		return user;
	}

	@Override
	public List<User> getSpecificDate() {
		List<User> user = userDao.findSpecificDate();
		return user;
	}
	
}