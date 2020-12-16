package com.barahona.backend.services;

import java.util.List;

import com.barahona.backend.models.entities.Club;

public interface IClubService {
	
	public Club findById(Long id);
	public List<Club> findAll();

}
