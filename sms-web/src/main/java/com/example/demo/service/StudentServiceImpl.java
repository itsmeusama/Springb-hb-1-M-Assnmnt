package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.model.Telephone;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student save(Student student) {
	
	   for(Telephone telephones:student.getTelephones()) 
	   {
		telephones.setStudent(student);
	   }
		return studentRepository.save(student);
	}

	@Override
	public List<Student> fetch() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student fetch(Integer id) {
		// TODO Auto-generated method stub
		Optional<Student> student = studentRepository.findById(id);
		if(student.isPresent())
		{
			return student.get();
		}
		else
		{
			return null;
		}

	}

}
