package com.ojas.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.Student;
@Repository

public interface StudentDao extends JpaRepository<Student, Integer> {

	

}
