package com.empapp.service;
import java.util.*;

import com.empapp.entity.Employee;
public interface EmployeeService {
	
	public List<Employee>getAll();
	public Employee getEmployeeById(int id);
	public Employee save(Employee emp);
	public Employee delete (int empId);
	public Employee update(int empId,Employee emp);

}
