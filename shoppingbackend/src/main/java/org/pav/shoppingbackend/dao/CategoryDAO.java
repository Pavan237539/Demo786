package org.pav.shoppingbackend.dao;

import java.util.List;

import org.pav.shoppingbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
   public Category get(int id);	
	
}
