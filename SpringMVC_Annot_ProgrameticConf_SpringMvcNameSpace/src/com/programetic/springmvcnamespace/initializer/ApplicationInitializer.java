package com.programetic.springmvcnamespace.initializer;

import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/*This class is used for Bootstraping the Dispatcher and context initializer classes
 * This will remove th boiler plate code that every one has to write in every application devlopment
 * What ever the code that changes for project to project that we need to write by our own 
 * rest of the things will be taken care by AbstractDispatcherInitilizer only
 * This will follow the Template Design Pattern
 * How the work flow will hapen incase of AbstractDispatcherInitializer is
 *  --> First After creating of the ServletContext before placing metadata inside it it will call the implimentation 
 * of ServletContainerInitializer will be called
 *  --> Then Spring People provided one class that is internal class they are implimenting ServletContainer initializer
 *  so this calll will be called these classes are also called SPI(Service Provider classes)
 *  --> As part of implimentation they will over ride one method called onStartUp method inside this
 *  they are calling WebApplicatinInitializer. if you see this this class is not implimenting from 
 *  ServletContainerInitializer class.internal class is calling this class.
 *  --> This class also containg the same onstartup method calling from internal class onstartup method
 *  if  our class implements from WebapplicationIntializer we need to over ride this method inside this method we need to 
 *  provide our logic
 *  --> What spring people provided one more implimentation class to WebApplicationIntializer so if you extend this class indirectly you are implementing WebApplicationIntializer 
 *  But this class comes up with logic inorder to avoid boiler plate logic in every project
 *  Actually if you implement WebApplicationIntializer you have to write the instantation of dispatcher servlet ,
 *  and context loader listener by our own and this shoud write by every programmer
 *  so it is boler plate logic. so spring people though to make our classes instanstiated by spring
 *  we need to write more code. so they implemented this class as sub class to webapplicationintializer and 
 *  provided the boler plate logic as part of this class and wht ever the fields that changing for every application
 *  that we need to over ride those methods this is nothing but template design pattern
 *  and this class will be called by Internal class bcz as it will identifies the implimentation class of webApplicationIntilizer 
 *  out super class is implementing that class as it is abstrat it will comes to one more level down
 *  that is our own class
 * */
public class ApplicationInitializer extends AbstractDispatcherServletInitializer{
   public ApplicationInitializer() {
	   System.out.println("inside ApplicationInitializer class constructor");
	   System.out.println("super class is  "+this.getClass().getSuperclass());
}

   @Override
   protected WebApplicationContext createRootApplicationContext() {
	   System.out.println("inside createRootApplicationContext method");
	   XmlWebApplicationContext  rootApplicationContext = new  XmlWebApplicationContext();
	   rootApplicationContext.setConfigLocation("/WEB-INF/dispatcher-servlet.xml");
   	return rootApplicationContext;
   }
   
	@Override
	protected WebApplicationContext createServletApplicationContext() {
		 System.out.println("inside createServletApplicationContext method");
		 XmlWebApplicationContext webApplicationContext = new XmlWebApplicationContext();
		 webApplicationContext.setConfigLocation("/WEB-INF/application-context.xml");
		return webApplicationContext;
	}
	
	@Override
	protected String[] getServletMappings() {
		System.out.println("inside getServletMappings method");
		String [] mappings = null;
		mappings = new String[]{"*.htm"}; 
		return mappings;
	}
   
}
