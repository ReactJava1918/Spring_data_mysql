package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.Setter;


@Entity
@Setter
@Getter

public class Student {
	@Id
	@GenericGenerator(name="stud-id",strategy ="com.example.demo.generators.Student_Id_Custom_generator")
	@GeneratedValue(generator="stud-id")
	private String stu_id;

	private String name;

	 
 

	private String dept;

	@Override
	public String toString() {
		return "Employee [id=" + stu_id + ", name=" + name + ", dept=" + dept + "]";
	}
	
}