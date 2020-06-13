package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;


@Entity
@Setter
@Getter

public class Employee {
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Id
	private long id;

	private String name;

	 
 

	private String dept;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	
}