package com.demo.Demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.demo.Demo.entity.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

}
