package com.programeticdispatcher.javaconfiguration.annotatedcontroller.initializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.programeticdispatcher.javaconfiguration.annotatedcontroller.config.MvcConfig;
import com.programeticdispatcher.javaconfiguration.annotatedcontroller.config.RootConfig;

/*This class is used to register the DispatcherServlet and
 * contextLoaderListener through programetic approach
*/
public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
     
	public ApplicationInitializer() {
		System.out.println("inside Application initializer class constructor");
	}
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("inside getRootConfig classes method");
		return new Class<?>[] {RootConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("inside getServletConfig classes method");
		return new Class<?>[] {MvcConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("inside getServletMappings method");
		return new String[] {"*.htm"};
	}

}
