package com.barahona.backend.services;

import java.util.List;

import com.barahona.backend.models.entities.Category;

public interface ICategoryService {

	public Category findById(Long id); //
	public List<Category> findAll();
	
}
