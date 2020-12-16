package com.barahona.backend.models.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.barahona.backend.models.dao.ICategory;
import com.barahona.backend.models.entities.Category;
import com.barahona.backend.services.ICategoryService;

@Service
public class CategoryService implements ICategoryService {

	@Autowired
	private ICategory dao;

	@Override
	@Transactional(readOnly=true)
	public Category findById(Long id) {
		return dao.findById(id).get();
	}

	@Override
	@Transactional(readOnly=true)
	public List<Category> findAll() {
		return (List<Category>) dao.findAll();
	}

}
