package com.mapping.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapping.models.Course;
import com.mapping.models.Laptop;
import com.mapping.models.Student;
import com.mapping.repo.LaptopRepo;
import com.mapping.repo.StudentRepo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service
public class MappingImpl {

	@Autowired
	StudentRepo studentRepo;

	@Autowired
	LaptopRepo laptopRepo;
	
	@PostConstruct
	public void storeData() {
		
		List<Course> courses  = new ArrayList<Course>();
		courses.add(new Course("Python"));
		courses.add(new Course("MERN"));
		
		Laptop laptop1 = new Laptop();
		laptop1.setBrand("DELL");
		
		Laptop laptop2 = new Laptop();
		laptop2.setBrand("HP");
	
		List<Laptop> laptops = new ArrayList<Laptop>();
		laptops.add(laptop1);
		laptops.add(laptop2);
		
		Student student = new Student();
		student.setCourse(courses);
		student.setName("Divyesh");
		student.setLaptop(laptops);
		
		List<Student> students = new ArrayList<Student>();
		students.add(student);
		
		laptop1.setStudent(students);
		laptop2.setStudent(students);
		
		laptopRepo.save(laptop1);
		studentRepo.save(student);
				
		

		
	}

}
