package com.co.demoInyection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.co.demoInyection.repository.IPersonRepo;

@Service
public class PersonServiceImpl implements IPersonService{

	@Autowired
	@Qualifier("person2")
	private IPersonRepo repo;
	
	@Override
	public void save(String name) {
		repo.save(name);
	}

	
}
