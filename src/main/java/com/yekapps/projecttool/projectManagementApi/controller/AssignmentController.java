package com.yekapps.projecttool.projectManagementApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yekapps.projecttool.projectManagementApi.model.Assignment;
import com.yekapps.projecttool.projectManagementApi.model.Employee;
import com.yekapps.projecttool.projectManagementApi.model.Job;
import com.yekapps.projecttool.projectManagementApi.service.AssignmentService;

@RestController
@RequestMapping("/assignments")
public class AssignmentController {

	@Autowired
	private AssignmentService assignService;
	
	@GetMapping("")
	public List<Assignment> getAllAssignment(){
		return assignService.getAllAssignments();
		//return assignService.getAllRecords();
	}
	
	@PostMapping("/add/{employeeId}/{jobId}")
	public void addAssignment(@PathVariable("employeeId") String employeeId,@PathVariable("jobId") String jobId){
		Assignment assignment=new Assignment();
		Employee employee=new Employee();
		employee.setId(employeeId);
		Job job=new Job();
		job.setId(jobId);
		assignment.setEmployee(employee);
		assignment.setJob(job);
		assignService.addAssignment(assignment);
	}
	
	@GetMapping("/{id}")
	public Assignment getAssignmentById(@PathVariable("id") String id)
	{
		return assignService.findAssignmentById(id);
	}
	
	@PutMapping("/update/{id}")
	public Assignment updateAssignment(@PathVariable("id") String id,@RequestBody Assignment assignment)
	{
		return assignService.updateAssignment(id, assignment);
	}
}
