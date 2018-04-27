package com.yekapps.projecttool.projectManagementApi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yekapps.projecttool.projectManagementApi.model.Assignment;

@Repository
public interface AssignmentReposity extends JpaRepository<Assignment, String> {

	//List<Assignment> getAllRecords();
}
