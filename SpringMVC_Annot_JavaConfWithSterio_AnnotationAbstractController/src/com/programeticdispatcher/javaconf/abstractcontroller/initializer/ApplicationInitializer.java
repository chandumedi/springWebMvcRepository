package com.programeticdispatcher.javaconf.abstractcontroller.initializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.programeticdispatcher.javaconf.abstractcontroller.config.MvcConfig;
import com.programeticdispatcher.javaconf.abstractcontroller.config.RootConfig;

//This class will register the DispatcherServlet and ContextLoaderListener with ServletContext Programetically
public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
   public ApplicationInitializer() {
	  System.out.println("inside ApplicationInitializer class constructor");   
  }

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("inside getRootConfig classes method");
		return new Class<?>[] {RootConfig.class};
	}
	
	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("inside getServletConfigClasses method");
		return new Class<?>[] {MvcConfig.class};
	}
	
	@Override
	protected String[] getServletMappings() {
		System.out.println("inside getServletMappings method");
		return new String[] {"*.htm"};
	}
}
