package com.barahona.backend.models.dao;

import org.springframework.data.repository.*;

import com.barahona.backend.models.entities.Category;

public interface ICategory extends CrudRepository<Category, Long> {
	
	

}
