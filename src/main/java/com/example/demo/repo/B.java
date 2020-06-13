package com.example.demo.repo;

import org.springframework.stereotype.Component;

@Component
public class B {
	
	public B()
	{
		System.out.println("constructor B is called");
	}
	
 public int m1()
 {
	 return 2;
 }
}
