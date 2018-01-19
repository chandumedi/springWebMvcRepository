package com.simpleform.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.simpleform.command.ProductCommand;

public class AddProductsSimpleFormController extends SimpleFormController {
   public AddProductsSimpleFormController() {
	   System.out.println("inside simpleform controller class constructor");
}
   @Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
	   System.out.println("inside onsubmit method of controller");
	   ModelAndView mav = null;
	   mav = new ModelAndView();
	   ProductCommand productCommand = (ProductCommand)command;
	   System.out.println("ProductCommand Object   "+productCommand);
	   mav.setViewName("sucess");
	   List<ObjectError> listErrors =  errors.getAllErrors(); 
	   for(ObjectError objectError  : listErrors) {
		   System.out.println("inside for each loop");
		   System.out.println(objectError.getDefaultMessage());
	   }
	   System.out.println("with errors");
		return mav;
	}
}
