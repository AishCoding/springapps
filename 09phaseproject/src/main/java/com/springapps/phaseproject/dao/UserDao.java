package com.springapps.phaseproject.dao;

import java.util.List;

import com.springapps.phaseproject.entity.User;

public interface UserDao {

	int create (User user);

	List<User> findUsers();

	List<User> findSpecificUsers();

	List<User> findSpecificCategory();

	List<User> findSpecificDate();
	
}