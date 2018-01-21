package com.programetic.springmvcnamespace.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/*if you implement it directly you have to provide the implementation for all the methods weather 
 * all are required or not but in case of this waht ever the methods you want those only you can because as it is a 
 * adopter class*/
public class HomeHandlerInterceptor extends HandlerInterceptorAdapter{
  
	public HomeHandlerInterceptor() {
	  System.out.println("inside HomeHandlerIntercptor class constructor");
}
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("inside postHandle method of handler interceptor");
	}
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("inside prehandle method of handler interceptor");
		return true;
	}
	
}
