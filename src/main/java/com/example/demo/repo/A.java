package com.example.demo.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.Student;


@Component
public class A {

	 @Autowired
	 private B em;
	 
	 @Autowired
	 private EmployeeRepository em2 ;
	 
	 @Autowired
	 private Student_Repository em4 ;
	 
	public A()
	{
		  System.out.println("constructor a is called");
	}
	
public void insert()
{
	Student ae1=new  Student();
	ae1.setDept("hgsdb");
	ae1.setName("REDDY");
	em4.save(ae1);
	 
}
}
