package org.pav.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.pav.shoppingbackend.dao.CategoryDAO;
import org.pav.shoppingbackend.dto.Category;
import org.springframework.stereotype.Repository;

@Repository("categorydao")
public class Categorydaoimpl implements CategoryDAO {

private static List<Category> categories =new ArrayList<Category>();

static {
	Category category =new Category();
	category.setId(101);
	category.setName("Television");
	category.setDescription("Desc for television");
	category.setImageurl("CAT_PNG");
	categories.add(category);
    //second category	
	category =new Category();
	category.setId(102);
	category.setName("Mobile");
	category.setDescription("Desc for Mobile");
	category.setImageurl("CAT_PNG1");
	categories.add(category);
	//third Category
	category =new Category();
	category.setId(103);
	category.setName("Laptop");
	category.setDescription("Desc for Laptop");
	category.setImageurl("CAT_PNG2");
	categories.add(category);
	
}
	
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}


	@Override
	public Category get(int id) {
	//enchanced for loop
	
	for(Category category:categories){
		
		if(category.getId() == id) return category;
	}
	      return null;
	}

}
