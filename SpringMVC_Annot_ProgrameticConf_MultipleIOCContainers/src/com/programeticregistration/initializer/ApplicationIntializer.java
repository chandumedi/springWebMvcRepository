package com.programeticregistration.initializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ApplicationIntializer implements WebApplicationInitializer {

	public ApplicationIntializer() {
		System.out.println("ApplicationIntializer constructor called");
		System.out.println(this.getClass().getSuperclass());
	}
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
    System.out.println("inside onstartup method");
    XmlWebApplicationContext  rootContext = null;
    ContextLoaderListener contextLoaderListener = null;
    XmlWebApplicationContext  webContext = null;
    DispatcherServlet dispatcherServlet = null;
    
    //Parent IOC Container Creation
    rootContext = new  XmlWebApplicationContext();
    rootContext.setConfigLocation("/WEB-INF/application-context.xml");
    
    //Creating ContextLoaderListener to register with ContextObject by Manually
    contextLoaderListener = new ContextLoaderListener(rootContext);
    
  //Registering ContextLoaderListerner
    servletContext.addListener(contextLoaderListener);
    
    //Child IOC Container
    webContext = new XmlWebApplicationContext();
    webContext.setConfigLocation("/WEB-INF/dispatcher-servlet.xml");
    
    //Creating Dispatcher Servlet to register in context object manually
    dispatcherServlet = new DispatcherServlet(webContext);
    
    //Registering with Conext Object
    Dynamic dynamic =  servletContext.addServlet("dispatcher", dispatcherServlet);
    
    //Add mappings and load-on-statrtup e.t.c to Dynamic object 
    //it is a interface comming from j2ee as part of servlet api 3.x onwords
    dynamic.addMapping("*.action");
    dynamic.setLoadOnStartup(2);
    System.out.println("end of this onstartup method");
	}

}
