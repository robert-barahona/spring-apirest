package com.barahona.backend.models.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.barahona.backend.models.dao.IStudent;
import com.barahona.backend.models.entities.Student;
import com.barahona.backend.services.IStudentService;

@Service
public class StudentService implements IStudentService {
	
	@Autowired
	private IStudent dao;

	@Override
	@Transactional
	public void save(Student student) {
		try {
			dao.save(student);
		}catch(Exception ex) {
			throw ex;
		}
	}

	@Override
	@Transactional
	public Student findById(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		try {
			dao.deleteById(id);
		}catch(Exception ex) {
			throw ex;
		}
	}

	@Override
	public List<Student> findAll() {
		return (List<Student>) dao.findAll();
	}

}
