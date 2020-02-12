package com.cs.jdbcDemoTest.service;

import java.util.List;

import com.cs.jdbcDemoTest.dao.EmployeeDao;
import com.cs.jdbcDemoTest.dto.UserProfile;

public class EmployeeService 
{

	EmployeeDao empobj = new EmployeeDao();
	public boolean employeeRegisterService(UserProfile empBean)
	{
		if(empBean.getAge()>18)
		{
			boolean result = empobj.employeeRegister(empBean);
			return result;
		}
		else
		{
			return false;
		}
	}
	public List<UserProfile> displayEmpDetailsDao(int age) 
	{
		return(empobj.displayEmpDetailsDao(age));
	}
}
