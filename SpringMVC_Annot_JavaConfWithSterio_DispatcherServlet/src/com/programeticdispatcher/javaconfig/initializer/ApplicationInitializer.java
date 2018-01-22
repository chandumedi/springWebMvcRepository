package com.programeticdispatcher.javaconfig.initializer;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.programeticdispatcher.javaconfig.config.MvcConfig;
import com.programeticdispatcher.javaconfig.config.RootConfig;

/* This class is used to register the dispatcher and context loader 
 * -listener in programetically
*/
public class ApplicationInitializer implements WebApplicationInitializer {
   public ApplicationInitializer() {
	   System.out.println("inside ApplicationInitializer class constructor");
   }
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("inside onstartup method");
    AnnotationConfigWebApplicationContext rootContext = null;
    AnnotationConfigWebApplicationContext mvcContext = null;
    DispatcherServlet dispatcherServlet = null;
    ContextLoaderListener contextLoaderListener = null;
    
    /*here creating the AnnotationConfigWebApplication context and
     * registering the rott config class with rootContext ioc container
     * */ 
    rootContext = new AnnotationConfigWebApplicationContext();
    rootContext.register(RootConfig.class);
    
    //Creating ContextLoaderListener
    contextLoaderListener = new ContextLoaderListener(rootContext);
    
    //registering this listener with servletContext
    servletContext.addListener(contextLoaderListener);
    
    
    /*here creating the AnnotationConfigWebApplication context and
     * registering the Mvcconfig class with mvcContext ioc container
     * inorde to make mvc components as beans inside of ioc container
     * */ 
    mvcContext = new AnnotationConfigWebApplicationContext();
    mvcContext.register(MvcConfig.class);
    
    //creating dispatcher servlet with mvcContext object
    dispatcherServlet = new DispatcherServlet(mvcContext);
    
    //register this servlet with servletContext object
    Dynamic dynamic =  servletContext.addServlet("dispatcher", dispatcherServlet);
    dynamic.addMapping("*.htm");
    dynamic.setLoadOnStartup(2);
    System.out.println("end of the onStartUp method");
	}

}
