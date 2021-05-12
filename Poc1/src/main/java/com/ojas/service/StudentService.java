package com.ojas.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ojas.Student;
import com.ojas.Dao.StudentDao;



@Service
public class StudentService {
	
	@Autowired
	public StudentDao studentRepo;
	
	public Student addStudent(Student student) {
		return studentRepo.save(student);
		
	}
	
	public List<Student> getAllStudents(Integer pageNo, Integer pageSize) {
		Pageable paging = PageRequest.of(pageNo,pageSize) ;
		Page<Student> pagedresult = studentRepo.findAll(paging);
		if(pagedresult.hasContent()) {
			return pagedresult.getContent();
		}
		else 
		{
			return new ArrayList<Student>();
		}
		
		
	}
}
