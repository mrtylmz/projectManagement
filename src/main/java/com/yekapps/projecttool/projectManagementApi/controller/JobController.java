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

import com.yekapps.projecttool.projectManagementApi.model.Job;
import com.yekapps.projecttool.projectManagementApi.service.JobService;

@RestController
@RequestMapping("/jobs")
public class JobController {

	@Autowired
	private JobService jobService;
	
	@GetMapping()
	public List<Job> getAllJobs(){
		return jobService.getAllJobs();
	}
	
	@PostMapping("/add")
	public Job addJob(@RequestBody Job job){
		return jobService.addJob(job);
	}
	
	@PutMapping("/update/{id}")
	public Job updateJob(@PathVariable("id") String id,@RequestBody Job job){
		return jobService.updateJob(id, job);
	}
	
	@DeleteMapping
	public void deleteJob(String jobId){
		jobService.deleteJob(jobId);
	}
}
