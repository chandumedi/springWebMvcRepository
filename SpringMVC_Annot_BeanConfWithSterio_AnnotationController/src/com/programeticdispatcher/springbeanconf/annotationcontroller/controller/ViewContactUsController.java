package com.programeticdispatcher.springbeanconf.annotationcontroller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*This class will acts as Controller but we need to write @Controller Annotation*/

@Controller
public class ViewContactUsController {

	public ViewContactUsController() {
		System.out.println("inside ViewContactUsController constructor");
  }
	
	@RequestMapping("/contact-us.htm")
	public String showContactUs() {
		/*The Advantage of this method is we no need to wrtite any method by implemeting or 
		 * extending something and we don't need to write forecfully pass the Request and Response as parameters
		 * why bcz we don't really required these here we just want to return string so we can that is the advantage of Annotation Driven Controller
		 * */
		System.out.println("inside showContactUs method");
		return "contact-us";
	}
}
