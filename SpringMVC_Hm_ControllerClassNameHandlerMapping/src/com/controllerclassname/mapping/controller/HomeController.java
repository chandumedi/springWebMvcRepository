package com.controllerclassname.mapping.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HomeController extends AbstractController {

	public HomeController() {
		System.out.println("Constructor of the controller");
	}
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("hadleRequestInternal method");
		ModelAndView mav =null;
		mav = new ModelAndView("home");
		return mav;
	}

}
