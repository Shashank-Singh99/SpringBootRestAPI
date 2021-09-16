package com.demo.Demo.contract;

import java.util.List;

import com.demo.Demo.entity.Employee;

public interface IEmployeeService {
	
	public Employee insertEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public Employee getEmployeeById(int empId);
	public String deleteEmployeeById(int empId);
	public Employee updateEmployee(Employee employee);

}
