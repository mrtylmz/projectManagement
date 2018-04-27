package com.yekapps.projecttool.projectManagementApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yekapps.projecttool.projectManagementApi.model.Job;
import com.yekapps.projecttool.projectManagementApi.repo.JobReposity;

@Service
public class JobService {

	@Autowired
	private JobReposity jobRepo;
	
	public Job addJob(Job job){
		return jobRepo.save(job);
	}
	
	public List<Job> getAllJobs(){
		return jobRepo.findAll();
	}
	public void deleteJob(String jobId){
		jobRepo.deleteById(jobId);
	}
	
	public Job updateJob(String updatedJobId,Job job)
	{
		job.setId(updatedJobId);
		return jobRepo.save(job);
	}
}
