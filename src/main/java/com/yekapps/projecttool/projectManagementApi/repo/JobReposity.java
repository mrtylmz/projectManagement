package com.yekapps.projecttool.projectManagementApi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yekapps.projecttool.projectManagementApi.model.Job;

public interface JobReposity extends JpaRepository<Job, String>{

}
