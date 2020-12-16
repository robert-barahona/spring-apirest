package com.barahona.backend.services;

import java.util.List;

import com.barahona.backend.models.entities.Student;

public interface IStudentService {
	
	public void save(Student student);
	public Student findById(Long id); //
	public void delete(Long id);
	public List<Student> findAll();

}
