package com.programeticdispatcher.javaconfiguration.annotatedcontroller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*This class act as Controller class even though we are not writing this class 
 * implementing or extending from any other class
 * Why Spring people provided completely Diffeent Set of controllers and why they dprecated 
 * alredy available Programetic way of controllres?
 * Total Controllers are 
 * 1)Controller
 * 2)Abstract Controller
 * 3)AbstractCommandController
 * 4)SimpleFormController
 * 5)AbstractWizard Controller
 * 6)MultiActionController
 * 7)ParameterizableViewController
 * 8)UrlFileNameViewController
 * out of which fiew are only available like Controller and Parameterizied ViewController 
 * and AbstractController and rest are completely removed from Spring4.0 some controllers
 * like ParameteriziedViewControllers and UrlFileName Controllers are the controllers 
 * we can directly configutre those as part of java config or SpringBeanConfiguration file
 * if you want to implement your own controllers you have to wrote by your own by providing 
 * @Controoler anntoation as part of the controller class.
 * we can write the programing model either by api driven or platform provided classes or interfaces
 * or metadata driven programing model. as part of complexity to the programmer spring people provided
 * Metadat driven devlopment as well and slowly they are deprecation the api driven devlopment
 * There are certain problems if we go for Api Driven Devlopment
 * 1)Complexity(By Writing interfaces and over riding methods)
 * 2)Maintenece(Maintence will be more if ther any change we need to modify the code)
 * 3)Loosing Pozofied nature
 * 4)becomes invasive
 * 5)we are forced to write the methods with parameters eventhough we are not required those
 * parameters really
 * 
 * So we have a solution to this that is we will write our classes and methods
 * with what names and parameters to methods and we will provide this configuration inside the xml file this is another way
 * so problem with this is we need to write more amoun of tags and configuration is required
 * and devlopres time will be killed
 * 
 * To avoid all these problems we will go for Annotation driven devlopment programing model
 * Weather you can use sterio type with configuration file(Spring -bean file) or Java Configuration either of it will work
 * inorder to work we need to write one annotation called @EnabledWebMvc or incase of configuration file we have to provide 
 * <mvc:annotation driven>
 * Why we needt to write this means?
 *   By default Spring will provide BeanNameHandlerMapping as default
 *   means if we wont configure any HandlerMapping This wibut the probelm with the existing HandlerMappings are
 *   Can not identify the Controller for a given incoming Request what is the controller
 *   bcz those are annotated with @Configuration Annotation  so spring people provided some special purpose 
 *   classes to read this clasess that is DefaultAnnotationHandlerMapping and RequestMapping HandlerMapping to read 
 *   These Annotation Based Controllers and to place them inside IOC Container The Problem with these are
 *   if you dont provide any HandlerMapping it will consider BeanNAme HAndlerMapping but Those Classes can not read these configuration informatio
 *   written with Annotations.so we have to enable Default AnnotationHandlerMapping these classes will read the classes which are annotated with 
 *   Controller and it will search for the methods which are annotated with RequestMapping and it will try to match with the data inside the RequestMapping Annotation
 *   then it will return method name and bean name. By default Spring will provide this also but we have to enable by providing this annotation
 *   in spring 4.0 this class also deprecated and they provided one more class clalled RequestMappingHandlerMapping class
 *   if you provide @EnableWebMvc both Bean Name andleMapping and DefaultAnnotationHandlerMApping will work if you dont provide it will consider
 *   only BeanNameHanlderMapping if you privide DefaultAnnotationHAndlerMapping as bean inside IOC Container it will consider this only
 *   bcz you are configuring some handlerMapping then this one only will works default one will not
 * */

@Controller
public class ViewAboutUsController {
   public ViewAboutUsController() {
	   System.out.println("inside ViewAboutUsController class constructor");
}
   @RequestMapping("/about-us.htm")
   public String showAboutUs() {
	   System.out.println("inside showAboutUs method inside custom controller");
	   return "about-us";
   }
}
