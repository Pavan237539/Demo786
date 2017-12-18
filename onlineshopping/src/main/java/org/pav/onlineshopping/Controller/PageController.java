package org.pav.onlineshopping.Controller;

import org.pav.shoppingbackend.dao.CategoryDAO;
import org.pav.shoppingbackend.dto.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@Autowired
	private CategoryDAO categorydao;

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		// passing the list of categories
		mv.addObject("categories", categorydao.list());
		mv.addObject("userclickHome", true);
		return mv;

	}

	@RequestMapping(value = "/about")
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Aboutus");
		mv.addObject("userclickabout", true);
		return mv;

	}

	@RequestMapping(value = "/contact")
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contactus");
		mv.addObject("userclickcontact", true);
		return mv;

	}

	/*
	 * Methods to load all the products based on category
	 */
	@RequestMapping(value = "/show/all/products")
	public ModelAndView showAllProducts() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "All Products");
		// passing the list of categories
		mv.addObject("categories", categorydao.list());
		mv.addObject("userclickAllProducts", true);
		return mv;

	}

	@RequestMapping(value = "/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("page");
		// Category DAO to fetch a single category
		Category category = null;
		category = categorydao.get(id);
		mv.addObject("title", category.getName());
		// passing the list of categories
		mv.addObject("categories", categorydao.list());
		mv.addObject("category", category);
		mv.addObject("userclickcategoryProducts", true);
		return mv;

	}

}
