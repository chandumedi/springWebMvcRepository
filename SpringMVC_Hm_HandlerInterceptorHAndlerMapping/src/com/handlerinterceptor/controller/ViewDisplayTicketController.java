package com.handlerinterceptor.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class ViewDisplayTicketController extends AbstractController{
   public ViewDisplayTicketController() {
	   System.out.println("inside dispay ticket constructor");
}
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("inside dispalyticket controller method");
		ModelAndView mav =null;
		mav = new ModelAndView("dispaly-tickets");
		return mav;
	}

}
