package com.deepakbatch4119.h2.sb.StudentB4119SB.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deepakbatch4119.h2.sb.StudentB4119SB.model.Student;
import com.deepakbatch4119.h2.sb.StudentB4119SB.repository.Studentrepository;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	Studentrepository sr;
	@RequestMapping("/details")
	public List<Student> getStudent(){
		return sr.findAll();
	}

}
