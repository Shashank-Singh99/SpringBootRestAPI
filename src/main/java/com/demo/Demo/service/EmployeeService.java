package com.demo.Demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Demo.contract.IEmployeeService;
import com.demo.Demo.entity.Employee;
import com.demo.Demo.repo.EmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService  {
	
	@Autowired
	private EmployeeRepository repo;

	@Override
	public Employee insertEmployee(Employee employee) {
		return repo.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}

	@Override
	public Employee getEmployeeById(int empId) {
		return repo.findById(empId).get();
	}

	@Override
	public String deleteEmployeeById(int empId) {
		Employee r = repo.findById(empId).get();
		repo.delete(r);
		return "Deleted Successfully";
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return repo.save(employee);
	}
	

}
