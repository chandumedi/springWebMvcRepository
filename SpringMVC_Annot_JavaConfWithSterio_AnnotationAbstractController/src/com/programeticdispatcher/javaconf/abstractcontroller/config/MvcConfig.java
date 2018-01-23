package com.programeticdispatcher.javaconf.abstractcontroller.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages= {"com.programeticdispatcher.javaconf.abstractcontroller.controller"})
public class MvcConfig extends WebMvcConfigurerAdapter {
	
    public MvcConfig() {
    	System.out.println("inside MvcConfig class constructor");
	}
    
   @Override
	public void addViewControllers(ViewControllerRegistry registry) {
	   System.out.println("inside addViewControllers method");
		registry.addViewController("/dashboard.htm").setViewName("dashboard");
	}
 
   @Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
	   System.out.println("inside configureViewResolvers method");
	   registry.jsp().prefix("/WEB-INF/jsp/").suffix(".jsp");
	}
}
