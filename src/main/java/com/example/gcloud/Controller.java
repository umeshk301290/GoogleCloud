package com.example.gcloud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	
	@Autowired
	EmployeeRepository repo;
	
	@GetMapping(value="get/cloud")
	public List<Employee> getEmployee() {
		
		return repo.findAll();
		
		
		
	}
	

}
