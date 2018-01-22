package com.programeticdispatcher.javaconfig.quick.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.ParameterizableViewController;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/*This class is used to make all spring mvc components as beans 
 * inside IOC Container with out spring bean configuration*/

@Configuration
public class MvcConfig {
  public MvcConfig() {
	  System.out.println("inside MvcConfig class constructor");
 }
  
  /* This is the Default one i.e BeanNameHandlerMappings so that we 
   * can avoid HandlerMappings. incomeing url directly map with the
   * BeanName directly 
   *  */
  @Bean(name = "/contact-us.htm")
  public Controller viewContactUsController() {
	  System.out.println("inside viewContactUsController method");
	  ParameterizableViewController parameterizableViewController = new ParameterizableViewController();
	  parameterizableViewController.setViewName("contact-us");
	  return parameterizableViewController;
  }
  
  @Bean
  public ViewResolver internalResourceViewResolver() {
	  System.out.println("inside internalResourceViewResolver method");
	  InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
	  internalResourceViewResolver.setPrefix("/WEB-INF/jsp/");
	  internalResourceViewResolver.setSuffix(".jsp");
	  return internalResourceViewResolver;
  }
  
}
