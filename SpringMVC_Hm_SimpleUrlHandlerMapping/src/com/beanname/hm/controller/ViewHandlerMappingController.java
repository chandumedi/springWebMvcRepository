package com.beanname.hm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.beanname.hm.service.HomeService;

public class ViewHandlerMappingController extends AbstractController   {
    private HomeService homeService;
	public HomeService getHomeService() {
		
		return homeService;
	}
	public void setHomeService(HomeService homeService) {
		System.out.println("inside seeter method");
		this.homeService = homeService;
	}
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("inside abstract controller");
		ModelAndView mav = null;
		mav = new ModelAndView("handler-view");
		return mav;
	}
	

}
