package com.handlerinterceptor.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class ViewBookTicketController extends AbstractController {
    public ViewBookTicketController() {
    	System.out.println("inside book ticket controller");
	}
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("inside bookticket controller method");
		ModelAndView mav = null;
		mav = new ModelAndView("book-tickets");
		return mav;
	}

}
