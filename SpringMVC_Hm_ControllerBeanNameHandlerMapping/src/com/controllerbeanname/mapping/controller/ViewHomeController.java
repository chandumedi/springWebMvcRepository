package com.controllerbeanname.mapping.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class ViewHomeController extends AbstractController{

	public ViewHomeController() {
		System.out.println("inside the constructor of controller");
	}
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("inside the ViewHome Controller");
		ModelAndView mav = null;
		mav = new ModelAndView("home");
		return mav;
	}

}
