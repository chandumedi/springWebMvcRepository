package com.programeticdispatcher.javaconfig.mvcapproach.initializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.programeticdispatcher.javaconfig.mvcapproach.config.MvcConfig;
import com.programeticdispatcher.javaconfig.mvcapproach.config.RootConfig;

/* This class is used to register the dispatcher and context loader 
 * -listener in programetically
 */
public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	
   public ApplicationInitializer() {
	   System.out.println("inside ApplicationIntializer class constructor");
  }
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("inside getRootConfigClasses");
		return new Class<?>[] {RootConfig.class};
	}
	
	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("inside getServletConfigClasses");
		return new Class<?>[] {MvcConfig.class};
	}
	
	@Override
	protected String[] getServletMappings() {
		System.out.println("inside getServletMappings");
		return new String[] {"*.htm"};
	}
   
}
