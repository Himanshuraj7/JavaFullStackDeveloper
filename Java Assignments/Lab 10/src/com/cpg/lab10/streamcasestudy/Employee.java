package com.cpg.lab10.streamcasestudy;

import java.time.LocalDate;

public class Employee extends Department {
        int employeeId;
        String firstName,lastName,email,phoneNumber,designation;
        LocalDate hireDate;
        double salary;
        
        Department deptobj;
        
        public Employee(int employeeId, String firstName, String lastName, String email, String phoneNumber,
                        String designation, LocalDate hireDate, double salary, Department deptobj) {
                super(deptobj.deptId,deptobj.managerId,deptobj.departName);
                this.employeeId = employeeId;
                this.firstName = firstName;
                this.lastName = lastName;
                this.email = email;
                this.phoneNumber = phoneNumber;
                this.designation = designation;
                this.hireDate = hireDate;
                this.salary = salary;
                this.deptobj = deptobj;
        }
        
        
        
}
