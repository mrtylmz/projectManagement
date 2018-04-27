package com.yekapps.projecttool.projectManagementApi.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="assignments")
public class Assignment {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="assignment_id")
	private String assignmentId;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "assign_date")
	private Date assignDate;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "employee_id")
	private Employee employee;
	
	@JsonIgnore
	@ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;
	public Assignment() {
	}
	
	public Employee getEmployee() {
		return employee;
	}

	public Job getJob() {
		return job;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	
	public Date getAssignDate() {
		return assignDate;
	}
	public void setAssignDate(Date assignDate) {
		this.assignDate = assignDate;
	}
	public String getAssignmentId() {
		return assignmentId;
	}
	public void setAssignmentId(String assignmentId) {
		this.assignmentId = assignmentId;
	}
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(getAssignmentId());
		sb.append(getAssignDate());
		sb.append(getEmployee().getId());
		sb.append(getJob().getId());
		return sb.toString();
	}
}