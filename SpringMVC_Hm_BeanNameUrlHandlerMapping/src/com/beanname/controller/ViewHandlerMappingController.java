package com.beanname.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.beanname.services.HandlerService;

public class ViewHandlerMappingController extends AbstractController {

	private HandlerService handlerService;
	public HandlerService getHandlerService() {
		return handlerService;
	}
	public void setHandlerService(HandlerService handlerService) {
		System.out.println("inside the setter of HandlerService class");
		this.handlerService = handlerService;
	}
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("inside HandlerMapping Controller");
		ModelAndView mav = null;
		mav = new ModelAndView("handler-mapping");
		return mav;
	}

}
