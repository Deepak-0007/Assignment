package com.deepakbatch4119.h2.sb.StudentB4119SB.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deepakbatch4119.h2.sb.StudentB4119SB.model.Student;

@Repository
public interface Studentrepository extends JpaRepository<Student,Long> {

}
