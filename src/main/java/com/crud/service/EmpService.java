package com.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.entity.Emp;
import com.crud.repository.EmpRepository;

@Service
public class EmpService {

	@Autowired
	private EmpRepository repository;

	//post api logic
	public Emp addEmp(Emp e) {
		return repository.save(e);
	}

	public List<Emp> getAllEmps() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
}
