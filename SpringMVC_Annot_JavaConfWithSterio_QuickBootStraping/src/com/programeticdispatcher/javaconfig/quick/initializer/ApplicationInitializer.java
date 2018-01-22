package com.programeticdispatcher.javaconfig.quick.initializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.programeticdispatcher.javaconfig.quick.config.MvcConfig;
import com.programeticdispatcher.javaconfig.quick.config.RootConfig;

/* This class is used to register the dispatcher and context loader 
 * -listener in programetically
 * AbstractDispatcherServletInitializer is the shortcut or quick way 
 * of bootstraping but inside of it we nned to create those containers 
 * and we nedd to retutn them placing spring bean configuration or 
 * JavaConfig classes inside of it.
 * Here we are writing some more amount of logic insted of that if we go
 * for AbstractAnnotationConfigDispatcherServletIntilaizer
 * class just we need to return the java config classes then every thing 
 * it will taken care.
 *  --> Programetic Registration with SpringBeanConfigurationFile will have two way of Bootstraping
 *   |- WebApplicationIntializer
 *   |- AbstractDispatcherServletIntializer
 *   
 *  --> Programetic Registration with JavaconfigurationFile will have two way of Bootstraping
 *   |- WebApplicationIntializer
 *   |- AbstractDispatcherServletIntializer
 *   |- AbstractAnnotationConfigDispatcherServletInitializer(This is more Quickest way of BootStraping)
*/

public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
  public ApplicationInitializer() {
	  System.out.println("inside ApplicationInitializer class constructor");
 }

		@Override
		protected Class<?>[] getRootConfigClasses() {
			System.out.println("inside gerRootConfigclasses");
			return new Class<?>[] {RootConfig.class};
		}
		
		@Override
		protected Class<?>[] getServletConfigClasses() {
			System.out.println("inside getservletConfigClasses");
			return new Class<?>[] {MvcConfig.class};
		}
		
		@Override
		protected String[] getServletMappings() {
			System.out.println("inside getServletMappings");
			return new String[] {"*.htm"};
		}
}
