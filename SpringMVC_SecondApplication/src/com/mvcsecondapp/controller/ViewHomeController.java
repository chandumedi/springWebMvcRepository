package com.mvcsecondapp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.mvcsecondapp.service.HomeService;

public class ViewHomeController extends AbstractController {
private HomeService homeService;
	public HomeService getHomeService() {
	return homeService;
}
public void setHomeService(HomeService homeService) {
	System.out.println("inside the setter method");
	this.homeService = homeService;
}
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("inside the controller");
		ModelAndView mav = new ModelAndView("welcome");
		mav.addObject("message", "Hi Welcome to Welcome Page");
		return mav;
	}

}
