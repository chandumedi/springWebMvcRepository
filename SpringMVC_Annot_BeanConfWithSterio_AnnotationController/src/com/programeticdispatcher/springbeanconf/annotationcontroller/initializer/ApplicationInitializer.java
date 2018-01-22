package com.programeticdispatcher.springbeanconf.annotationcontroller.initializer;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/*This class is used to Register the DispatcherServlet and Context LoaderListener in Programetic way*/
public class ApplicationInitializer extends AbstractDispatcherServletInitializer {
      public ApplicationInitializer() {
    	  System.out.println("inside ApplicationInitilaizer class constructor");
	}
	@Override
	protected WebApplicationContext createServletApplicationContext() {
		System.out.println("inside createServletApplicationContext method");
		XmlWebApplicationContext mvcContext = new XmlWebApplicationContext();
		mvcContext.setConfigLocation("/WEB-INF/dispatcher-servlet.xml");
		return mvcContext;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("inside getServletMappings method");
		return new String[] {"*.htm"};
	}

	@Override
	protected WebApplicationContext createRootApplicationContext() {
		System.out.println("inside createRootApplicationContext method");
		XmlWebApplicationContext rootContext = new XmlWebApplicationContext();
		rootContext.setConfigLocation("/WEB-INF/application-context.xml");
		return rootContext;
	}

}
