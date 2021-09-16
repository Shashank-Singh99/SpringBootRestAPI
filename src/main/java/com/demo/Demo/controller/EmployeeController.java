package com.demo.Demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Demo.entity.Employee;
import com.demo.Demo.service.EmployeeService;

@RestController
public class EmployeeController {
	
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/")
	public String home() {
		return "It is working";
	
	}
	
	@GetMapping("/getemployees")
	public List<Employee> allEmployees() {
		 return service.getAllEmployees();	
	}
	
	@GetMapping("/getemployees/{empId}")
	public Employee getEmployeeId( @PathVariable("empId") int empId) {
		return service.getEmployeeById(empId);
		
	}
	
	@PostMapping("/getemployees")
	public Employee saveEmployee( @RequestBody Employee employee) {
		return service.insertEmployee(employee);
		
	}
	
	@DeleteMapping("/deleteemployees/{empId}")
	public String deleteEmployeeId( @PathVariable("empId") int empId) {
		return service.deleteEmployeeById(empId);	
	}
	
	@PutMapping("/getemployees/update")
	public Employee updateEmployee( @RequestBody Employee employee) {
		return service.updateEmployee(employee);
		
	}

}
