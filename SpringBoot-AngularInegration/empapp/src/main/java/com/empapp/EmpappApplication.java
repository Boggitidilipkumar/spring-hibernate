package com.empapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.empapp.entity.Employee;
import com.empapp.service.EmployeeService;

@SpringBootApplication
public class EmpappApplication implements CommandLineRunner{
	@Autowired
	private EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(EmpappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		/*employeeService.save(new Employee("dilip", 22));
		employeeService.save(new Employee("balu", 21));
		employeeService.save(new Employee("hari", 24));
		employeeService.save(new Employee("sadhik", 26));*/
		
	}

}
