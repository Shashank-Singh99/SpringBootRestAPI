package com.demo.Demo.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.demo.Demo.entity.Employee;
import com.demo.Demo.repo.EmployeeRepository;

@Configuration
@EnableMongoRepositories(basePackageClasses = EmployeeRepository.class)
public class MongoConfig {
	
	
	@Bean
	public CommandLineRunner commandLineRunner(EmployeeRepository repo) {
		
		//return string -> repo.insert(new Employee(101,"SHASHANK",100000));
		return null;
	}

}
