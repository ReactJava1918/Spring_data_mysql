package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.repo.A;


@SpringBootApplication
public class DemoApplication {
	
	 @Autowired
	 private A a1;

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(DemoApplication.class, args);
		
		DemoApplication a1=ctx.getBean(DemoApplication.class);
		a1.testcheck();
		System.out.println("insetred sucessfully");
		 
		
	}
	
	public void testcheck()
	{
		a1.insert();
		
	}
	  
	
	 
	 
	

}
