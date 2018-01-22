package com.programeticdispatcher.javaconfig.mvcapproach.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/*This Class is Act as HandlerInterceptor
 * Either you can implement HandlerInterceptor 
 * interface or HandlerInterceptor Adopter class
 */
public class CustomHandlerInterceptor extends HandlerInterceptorAdapter {
    public CustomHandlerInterceptor() {
    	System.out.println("inside CutomHandlerInterceptor class constructor");
	}
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
    		ModelAndView modelAndView) throws Exception {
    	System.out.println("postHandle Method of CustomHandler");
    }
    
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
    		throws Exception {
    	System.out.println("preHandle Method of CustomHandler");
    	return true;
    }
}
