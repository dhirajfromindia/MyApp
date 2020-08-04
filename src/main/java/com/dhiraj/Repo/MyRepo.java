package com.dhiraj.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhiraj.MyApp.Student;

public interface MyRepo extends JpaRepository<Student, Long> {

}
