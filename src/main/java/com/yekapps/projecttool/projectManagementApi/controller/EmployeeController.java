package com.yekapps.projecttool.projectManagementApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yekapps.projecttool.projectManagementApi.model.Employee;
import com.yekapps.projecttool.projectManagementApi.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping()
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable("id") String id){
		return employeeService.getEmployee(id);
	}
	
	@PostMapping()
	public void addEmployee(@RequestBody Employee emp){
		employeeService.addEmployee(emp);
	}
	
	@PutMapping("/update/{id}")
	public Employee updateEmployee(@PathVariable("id") String id,@RequestBody Employee emp){
		return employeeService.updateEmployee(id, emp);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteEmployee(@PathVariable("id") String id){
		employeeService.deleteEmployee(id);
	}
}
