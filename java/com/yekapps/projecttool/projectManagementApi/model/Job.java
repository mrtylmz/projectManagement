package com.yekapps.projecttool.projectManagementApi.model;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.yekapps.projecttool.projectManagementApi.library.KodluBilgiler;

@Entity
@Table(name = "jobs")
public class Job {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="job_id")
	private String Id;
	private String 	jobExplanation;
	@Column(name="job_status") 
	private String jobStatus=KodluBilgiler.JobStatus.ASSIGNED;
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_date")
	private Date createDate;

	/*
	@ManyToMany(mappedBy="jobs")
	private Set<Employee> employees;
	*/
	@JsonIgnore
	@OneToMany(mappedBy = "job")
    private Set<Assignment> assignment;
	
	public Set<Assignment> getAssignment() {
		return assignment;
	}

	public void setAssignment(Set<Assignment> assignment) {
		this.assignment = assignment;
	}

	public Job()
	{
		
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getJobExplanation() {
		return jobExplanation;
	}

	public void setJobExplanation(String jobExplanation) {
		this.jobExplanation = jobExplanation;
	}

	public String getJobStatus() {
		return jobStatus;
	}

	public void setJobStatus(String jobStatus) {
		this.jobStatus = jobStatus;
	}


	
}