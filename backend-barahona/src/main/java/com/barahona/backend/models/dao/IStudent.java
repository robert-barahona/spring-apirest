package com.barahona.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.barahona.backend.models.entities.Student;

public interface IStudent extends CrudRepository<Student, Long>{

}
