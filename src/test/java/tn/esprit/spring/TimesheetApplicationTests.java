package tn.esprit.spring;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.spring.repository.EmployeRepository;

import tn.esprit.spring.services.IEmployeService;


@SpringBootTest
public class TimesheetApplicationTests {

	@Autowired 
	IEmployeService ems;
	
	@Autowired
	EmployeRepository employeRepository;
	
	

	
}
