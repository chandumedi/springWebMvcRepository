package com.handlerinterceptor.handlerinterceptor;

import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class TimeZoneInterceptor extends HandlerInterceptorAdapter {
	public TimeZoneInterceptor() {
		System.out.println("inside the constructor of TimeZoneInterceptor");
	}
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		boolean flag = true;
		System.out.println("inside preHandle methods of interceptor");
		Calendar calender = Calendar.getInstance();
		int hours = calender.HOUR;
		if(hours <=18) {
			flag = false;
			System.out.println("inside if condition");
			response.sendRedirect("maintence-window.jsp");
		}
		return flag;
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("inside afterCompletion method of interceptor");
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("inside postHandle method of interceptor");
	}
}
