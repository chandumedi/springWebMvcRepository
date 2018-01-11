package com.abstractcommand.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.abstractcommand.command.ProductCommand;
import com.abstractcommand.dto.Products;

public class ProductCommandController extends AbstractCommandController{

	public ProductCommandController() {
		System.out.println("inside ProductCommandControler class constructro");
	}
	@Override
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command, BindException be)
			throws Exception {
		ModelAndView mav = null;
		List<Products> listProducts = null;
		ProductCommand productCommand = null;
		listProducts = new ArrayList<Products>();
		mav = new ModelAndView();
		productCommand = (ProductCommand)command;
		Products products = null;
		System.out.println("Products Command Object "+productCommand);
		for(int i=0;i<=5;i++) {
			products = new Products();
			products.setBrand("samsung  "+i);
			products.setCategory("Electronics  "+i);
			products.setProduct("Television  "+i);
			listProducts.add(products);
		}
		mav.addObject("products", listProducts);
		mav.setViewName("products-results");
		return mav;
	}

}
