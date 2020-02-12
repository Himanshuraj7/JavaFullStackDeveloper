package com.cg.eis.service;

import java.util.Set;

import com.cg.eis.bean.Employee;

public interface EmployeeService {
	
	void addEmployee(Employee e);
	Set<Employee> AllEmployee();
	String scheme(float salary,String designation);
	

}
