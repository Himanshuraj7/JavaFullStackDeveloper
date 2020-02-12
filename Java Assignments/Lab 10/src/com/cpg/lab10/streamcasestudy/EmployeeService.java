package com.cpg.lab10.streamcasestudy;

import java.util.List;
import java.util.Optional;

public class EmployeeService {

        public void sumOfSalaryOfAllEmp(List<Employee> list)
        {
//                List<Double> salList=new ArrayList<Double>();
//                
//                for(Employee e:list)                
//                {
//                        salList.add(e.salary);
//                }
                
                //Optional<Double> result=salList.stream().reduce((a,b)->a+b);
                
        	Optional<Double> result =list.stream().map(s->s.salary).reduce((a,b)->a+b);
        	
                if(result.isPresent())
                {
                        System.out.println(result.get());
                }
        }
        
        }
        
        
