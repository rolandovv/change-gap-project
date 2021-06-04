package com.example.changegapproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
public class ChangeGapProjectApplication {

	@Autowired
	private MongoTemplate mongoTemplate;

	public static void main(String[] args) {

		SpringApplication.run(ChangeGapProjectApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//
//		System.out.println("----------jaja"+ mongoTemplate.getCollectionNames());
//	}

}
