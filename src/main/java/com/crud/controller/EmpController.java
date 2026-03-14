package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entity.Emp;
import com.crud.repository.EmpRepository;
import com.crud.service.EmpService;

@RestController
@RequestMapping("/api/emp")
//@CrossOrigin(origins="http://localhost:5173")
@CrossOrigin(origins="https://emp-crud-frontend.onrender.com")
public class EmpController {

	@Autowired
	private EmpService service;

	//post api
	@PostMapping
	public Emp add(@RequestBody Emp e) {
		return service.addEmp(e);
	}
	
	@GetMapping
	public List<Emp> getAll(){
		return service.getAllEmps();
	}
}
