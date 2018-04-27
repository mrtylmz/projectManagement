package com.yekapps.projecttool.projectManagementApi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yekapps.projecttool.projectManagementApi.model.Employee;
import com.yekapps.projecttool.projectManagementApi.repo.EmployeeReposity;

@Service
public class EmployeeService {

	@Autowired
	EmployeeReposity employeeReposity;
	
	public List<Employee> getAllEmployees(){
		List<Employee> employeeList=new ArrayList();
		employeeList= (List<Employee>) employeeReposity.findAll();
		return employeeList;
	}
	
	public Employee getEmployee(String id){
		return employeeReposity.getOne(id);
	}
	
	public void addEmployee(Employee employee){
		employeeReposity.save(employee);
	}
	
	public Employee updateEmployee(String id,Employee uEmployee){
		uEmployee.setEmployeeId(id);
		return employeeReposity.save(uEmployee);
	}
	public void deleteEmployee(String id){
		employeeReposity.deleteById(id);
	}
}
