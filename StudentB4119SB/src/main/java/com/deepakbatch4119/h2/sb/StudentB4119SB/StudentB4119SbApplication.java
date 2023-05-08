package com.deepakbatch4119.h2.sb.StudentB4119SB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.deepakbatch4119.h2.sb.StudentB4119SB.model.Student;
import com.deepakbatch4119.h2.sb.StudentB4119SB.repository.Studentrepository;

@SpringBootApplication

public class StudentB4119SbApplication implements CommandLineRunner {
	@Autowired
	Studentrepository sr;
	public static void main(String[] args) {
		SpringApplication.run(StudentB4119SbApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		sr.save(new Student("Arun Kumar","Anudeep","arun.kumar@gmail.com"));
		sr.save(new Student("Deepak Yadav","Anudeep","deepak.yadav@gmail.com"));
		
	}

}
