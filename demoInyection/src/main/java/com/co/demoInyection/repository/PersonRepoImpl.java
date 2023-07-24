package com.co.demoInyection.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.co.demoInyection.DemoInyectionApplication;

@Repository
@Qualifier("person1")
public class PersonRepoImpl implements IPersonRepo{

	private static Logger LOG =LoggerFactory.getLogger(DemoInyectionApplication.class);
	
	@Override
	public void save(String name) {
		LOG.info(name+" was saved");
		
	}

}
