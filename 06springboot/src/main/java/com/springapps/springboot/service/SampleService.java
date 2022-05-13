package com.springapps.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springapps.springboot.dao.SampleDAO;

@Component
public class SampleService {

	@Autowired
	SampleDAO sampledao;
	
	public SampleService(SampleDAO sampledao) {
		System.out.println("Sample service contructor..");
		this.sampledao = sampledao;
	}
	
	public void save()
	{
		System.out.println("Inside service save method..");
		sampledao.create();
	}
	
}
