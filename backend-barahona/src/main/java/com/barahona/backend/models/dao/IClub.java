package com.barahona.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.barahona.backend.models.entities.Club;

public interface IClub extends CrudRepository<Club, Long>{

}
