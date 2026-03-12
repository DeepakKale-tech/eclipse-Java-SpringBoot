package com.example.start.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.start.bean.Student;

@RestController
public class StudentController {
	
	@GetMapping("/welcome")
	public String welcome()
	{
		return "My First Spring Boot Application";
	}
	
	@GetMapping("/get")
	public Student get()
	{
		Student s = new Student(101,"Deepak",99.89);
		return s;
	}
	
	@GetMapping("/findAll")
	public List<Student> findAll()
	{
		List<Student> l1 = new ArrayList<Student>();
		l1.add(new Student(101, "Batman", 85.50));
		l1.add(new Student(102, "Wonder Woman", 91.75));
		l1.add(new Student(103, "Superman", 79.23));
		l1.add(new Student(104, "Flash", 88.10));
		l1.add(new Student(105, "Aquaman", 72.40));
		return l1;
	}
}
