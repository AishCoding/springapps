package com.springapps.phaseproject.service;

import java.util.List;

import com.springapps.phaseproject.entity.User;

public interface UserService {

	int save(User user);

	List<User> getUsers();
	
	List<User> getSpecificUsers();

	List<User> getSpecificCategory();

	List<User> getSpecificDate();
}