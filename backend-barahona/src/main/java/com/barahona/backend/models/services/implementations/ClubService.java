package com.barahona.backend.models.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barahona.backend.models.dao.IClub;
import com.barahona.backend.models.entities.Club;
import com.barahona.backend.services.IClubService;

@Service
public class ClubService implements IClubService{
	
	@Autowired
	private IClub dao; //Data Access Object

	@Override
	public Club findById(Long id) {
		return dao.findById(id).get();
	}

	@Override
	public List<Club> findAll() {
		return (List<Club>) dao.findAll();
	}

}
