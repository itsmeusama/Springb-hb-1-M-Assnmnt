package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService {
	
	Student save(Student student);
	List<Student> fetch();
	Student fetch(Integer id);

}
