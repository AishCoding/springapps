package com.springapps.phaseproject.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.springapps.phaseproject.dao.UserDao;
import com.springapps.phaseproject.entity.User;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	private SessionFactory sessionFactory;

	@Override
	public int create(User user) {
		return (int) hibernateTemplate.save(user);
	}

	@Override
	public List<User> findUsers() {
		return hibernateTemplate.loadAll(User.class);
	}

	@Override
	 public List<User> findSpecificUsers() {
		return hibernateTemplate.loadAll(User.class);
		
	 }

	@Override
	public List<User> findSpecificCategory() {
		return hibernateTemplate.loadAll(User.class);
	}

	@Override
	public List<User> findSpecificDate() {
		return hibernateTemplate.loadAll(User.class);
	}
	
}