package com.barahona.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.barahona.backend.models.entities.Subject;

public interface ISubject extends CrudRepository<Subject, Long> {

}
