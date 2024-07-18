package com.javaapp.persistence;

import java.util.ArrayList;
import java.util.List;

import com.javaapp.model.Category;

public interface CategoryRepository {
	
	List<Category> list = new ArrayList<>();
	public static void save(Category category) {
		list.add(category);
	}

	public static List<Category> findAll(){
		return list;
	}

	public static Category findById(int id) {
		for(Category c : list) {
			if(c.getId() == id)
				return c;
		}
		return null;
	}
}
