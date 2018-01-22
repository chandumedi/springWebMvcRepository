package com.programeticdispatcher.javaconfiguration.annotatedcontroller.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/*This class is used to configure the SpringMvc Components as beans inside IOC Container
 * which is the quickest way of configuring it 
 * */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages= {"com.programeticdispatcher.javaconfiguration.annotatedcontroller.controller"})
public class MvcConfig extends WebMvcConfigurerAdapter {
  public MvcConfig() {
	  System.out.println("inside MvcConfig class constructor");
  }
  
   //Configuring ViewResolvers  
  @Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
	  System.out.println("inside configuringViewResolvers");
	  registry.jsp().prefix("/WEB-INF/jsp/").suffix(".jsp");
	}
}
