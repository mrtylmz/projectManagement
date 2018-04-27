package com.yekapps.projecttool.projectManagementApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yekapps.projecttool.projectManagementApi.model.Assignment;
import com.yekapps.projecttool.projectManagementApi.model.Job;
import com.yekapps.projecttool.projectManagementApi.repo.AssignmentReposity;

@Service
public class AssignmentService {

	@Autowired
	private AssignmentReposity assignReposity;
//	@Autowired
//	private AssignmentImp assignReposity;
	
	public List<Assignment> getAllAssignments(){
		List<Assignment> response=assignReposity.findAll();
		return response;
	}
	
	/**
	 * First assign job, then update Job Status to ASSIGNED.
	 * **/
	public void addAssignment(Assignment assign){
		assignReposity.save(assign);
	}

	public Assignment findAssignmentById(String id){
		return assignReposity.getOne(id);
	}
	public Assignment updateAssignment(String updatedAssignmentId,Assignment uAssignment){
		uAssignment.setAssignmentId(updatedAssignmentId);
		return assignReposity.save(uAssignment);
	}
	
//	public List<Assignment> getAllRecords(){
//		return assignReposity.getAllRecords();
//	}
	
	private void updateJobStatus(Job job) {
		JobService jobService=new JobService();
		jobService.updateJob(job.getId(), job);
	}
	
}
