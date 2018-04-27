package com.yekapps.projecttool.projectManagementApi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yekapps.projecttool.projectManagementApi.model.Employee;

public interface EmployeeReposity extends JpaRepository<Employee, String> {

}
