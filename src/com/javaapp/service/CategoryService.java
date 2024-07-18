package com.javaapp.service;

import java.util.List;

import com.javaapp.exceptions.ResourceNotFoundException;
import com.javaapp.model.Category;
import com.javaapp.persistence.CategoryRepository;

public class CategoryService {

	public void addCategory(Category category) {
		CategoryRepository.save(category);
		
	}
	
	public List<Category> findAll(){
		return CategoryRepository.findAll();
	}

	public Category findById(int id) throws ResourceNotFoundException{

		Category category = CategoryRepository.findById(id); //id = valid or invalid
		if(category == null) {
			throw new ResourceNotFoundException("invalid id given");
		}
		return category;
	}

}
