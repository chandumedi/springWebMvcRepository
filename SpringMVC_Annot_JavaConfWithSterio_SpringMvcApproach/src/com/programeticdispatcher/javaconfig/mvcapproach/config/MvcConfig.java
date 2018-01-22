package com.programeticdispatcher.javaconfig.mvcapproach.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.programeticdispatcher.javaconfig.mvcapproach.interceptor.CustomHandlerInterceptor;

/*This class is used to make all spring mvc components as beans 
 * inside IOC Container with out spring bean configuration
 * WebMvcConfigurerAdapter id the Adpter class or else you can use interfce 
 * WebMvcConfigurer. these are usefull in Configuring Spring Mvc Components very easily
 * like how we are configuring in Spring Bean File with mvc Name Space the same 
 * way we can achieve by using This Adopter class or interfce 
 * Adopter class is more flexible and we need to enable the EnableWebMvc bcz
 * Here we are saying spring to use beanNameHandlerMapping as it is default we need to
 * enable by using this annotation so that it will use internallu ParamterizableViewController
 * */

@Configuration
@EnableWebMvc
public class MvcConfig extends WebMvcConfigurerAdapter {
	public MvcConfig() {
		System.out.println("inside MvcConfig class constructor");
	}
	
	//This is for controllers
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		System.out.println("inside addViewControllers method");
		//It will follw BuilderDesignPattern
		registry.addViewController("/careers.htm").setViewName("careers");;		
	}
	
	//This is for ViewResolvers
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		System.out.println("inside configureViewResolvers method");
		//It follows Builder Design Pattern so you can call one on another
		registry.jsp().prefix("/WEB-INF/jsp/").suffix(".jsp");
	}
	
	//This is for Interceptors
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		System.out.println("inside addInterceptors method");
		//It follw Builder Design Pattern so you can call one on another
		registry.addInterceptor(new CustomHandlerInterceptor()).addPathPatterns("/careers.htm");
	}

}
