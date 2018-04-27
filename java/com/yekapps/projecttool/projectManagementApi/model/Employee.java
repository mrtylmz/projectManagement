package com.yekapps.projecttool.projectManagementApi.model;

import java.util.Set;


import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "employees")
public class Employee {

	@Id
	@Column(name="employee_id")
	private String id;
	private String nameAndSurname;
	private String contactPhone;
	private String roleCode;
	
	/*
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "employee_job",
    joinColumns = @JoinColumn(name = "employee_id"),
    inverseJoinColumns = @JoinColumn(name = "job_id"))
	private Set<Job> jobs; 
	//Bir personel birden fazla iş atanabilir.Bir işe birden fazla personel de ataabilir.
	*/
	@JsonIgnore
	@OneToMany(mappedBy = "employee")
    private Set<Assignment> assignment;
	
	public Set<Assignment> getAssignment() {
		return assignment;
	}


	public void setAssignment(Set<Assignment> assignment) {
		this.assignment = assignment;
	}


	public Employee(){
		
	}
	
	public Employee(String id, String nameAndSurname, String contactPhone, String roleCode) {
		super();
		this.id = id;
		this.nameAndSurname = nameAndSurname;
		this.contactPhone = contactPhone;
		this.roleCode = roleCode;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNameAndSurname() {
		return nameAndSurname;
	}
	public String getEmployeeId() {
		return id;
	}
	public void setEmployeeId(String id) {
		this.id = id;
	}
	public void setNameAndSurname(String nameAndSurname) {
		this.nameAndSurname = nameAndSurname;
	}
	public String getContactPhone() {
		return contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	public String getRoleCode() {
		return roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
}
