package com.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HomeViewController implements Controller{

	public HomeViewController() {
		System.out.println("This Controller has been called");
	}
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView modelAndView = null;
		modelAndView = new ModelAndView("home");
		modelAndView.addObject("message", "Welcome to Spring Web Mvc!");
		return modelAndView;
	}

}
