package com.co.demoInyection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.co.demoInyection.service.IPersonService;

@SpringBootApplication
public class DemoInyectionApplication implements CommandLineRunner{

	
	private static Logger LOG =LoggerFactory.getLogger(DemoInyectionApplication.class);
	
	@Autowired
	private IPersonService service;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoInyectionApplication.class, args);
	}
	
	@Override
	public void run (String... args) {
		LOG.info("test spring boot fron console");
		service.save("jack");
	}

}
