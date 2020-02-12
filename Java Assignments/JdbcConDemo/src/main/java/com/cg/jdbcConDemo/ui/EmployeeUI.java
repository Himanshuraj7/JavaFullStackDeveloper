package com.cg.jdbcConDemo.ui;

import com.cs.jdbcConDemo.dao.BDConnection;
import java.sql.Connection;

//import java.sql.Connection;

//import com.cs.jdbcDemoTest.dao.*;
import com.cs.jdbcDemoTest.dto.UserProfile;
import com.cs.jdbcDemoTest.service.EmployeeService;

public class EmployeeUI 
{
      
      public static void main(String[] args)
      {
              UserProfile userBean = new UserProfile();
              userBean.setAge(22);
              userBean.setFname("Reedam");
              userBean.setLname("Jain");
              userBean.setUserid("RJ123");
              
              EmployeeService empobj = new EmployeeService();
              boolean result = empobj.employeeRegisterService(userBean);
              if(result)
              {
                      System.out.println("Data Inserted");
              }
              else
              {
                      System.out.println("Error while inserting data.");
              }
      }
      
}


