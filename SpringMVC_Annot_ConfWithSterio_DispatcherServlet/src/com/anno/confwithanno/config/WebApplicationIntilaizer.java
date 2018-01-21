package com.anno.confwithanno.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import javax.servlet.ServletRegistration.Dynamic;

public class WebApplicationIntilaizer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
			System.out.println("inside onStartup method");
			XmlWebApplicationContext applicationContext = new XmlWebApplicationContext();
			applicationContext.setConfigLocation("/WEB-INF/dispatcher-servlet.xml");
			DispatcherServlet dispatcherServlet = new DispatcherServlet(applicationContext);
			Dynamic dynamic = servletContext.addServlet("dispatcher", dispatcherServlet);
			dynamic.addMapping("*.htm");
			
	}

}
