package com.yekapps.projecttool.projectManagementApi.repo;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.yekapps.projecttool.projectManagementApi.model.Assignment;


public class AssignmentImp implements AssignmentReposity {

	@PersistenceContext
    private EntityManager em;
	

//	@Override
//	public List<Assignment> getAllRecords() {
//		List<Assignment> recordList=new ArrayList<>();
////		String stringSql="select as.assignment_id,as.assign_date,as.job_id,as.employee_id from assignments as,employees emp,jobs j"
////				+ " where as.job_id=j.job_id and as.employee_id=emp.employee_id";
////		TypedQuery<Assignment> typedQ=em.createNamedQuery(stringSql, Assignment.class);
////		recordList=typedQ.getResultList();
//		return recordList;
//	}


	@Override
	public List<Assignment> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Assignment> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Assignment> findAllById(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends Assignment> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public <S extends Assignment> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void deleteInBatch(Iterable<Assignment> entities) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Assignment getOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends Assignment> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends Assignment> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Page<Assignment> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends Assignment> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Optional<Assignment> findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean existsById(String id) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void delete(Assignment entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteAll(Iterable<? extends Assignment> entities) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public <S extends Assignment> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends Assignment> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends Assignment> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public <S extends Assignment> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

}
