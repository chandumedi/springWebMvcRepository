package com.programeticdispatcher.javaconfig.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
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
   
   @Bean
   public HandlerMapping simpleUrlHandlerMapping() {
	   System.out.println("inside SimpleUrlHandlerMappings method");
	   SimpleUrlHandlerMapping simpleUrlHandlerMapping = new SimpleUrlHandlerMapping();
	   Properties prop = new Properties();
	   prop.setProperty("/about-us.htm", "vac");
	   simpleUrlHandlerMapping.setMappings(prop);
	   return simpleUrlHandlerMapping;
   }
   
   @Bean(name="vac")
   public Controller viewAboutUsController() {
	   System.out.println("inside viewAboutUsController");
	   ParameterizableViewController parameterizableViewController = new ParameterizableViewController();
	   parameterizableViewController.setViewName("about-us");
	   return parameterizableViewController;
   }
   
   @Bean
   public ViewResolver internalResourceViewResolver() {
	   System.out.println("inside internal resource view resolver method");
	   InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
	   internalResourceViewResolver.setPrefix("/WEB-INF/jsp/");
	   internalResourceViewResolver.setSuffix(".jsp");
	   return internalResourceViewResolver;
   }
}
