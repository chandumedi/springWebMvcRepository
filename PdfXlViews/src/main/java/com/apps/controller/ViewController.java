package com.apps.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.apps.BO.Employee;

public class ViewController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String type=request.getParameter("type");
		ModelAndView mav=new ModelAndView();
		List<Employee> employeeData=null;
		employeeData=new ArrayList<>();
		Employee emp1=new Employee("CHANDU", 1028, "Software Enginerr", "1");
		Employee emp2=new Employee("MAHESH", 1029, "Software Enginerr", "1");
		Employee emp3=new Employee("PAPPU", 1030, "Software Enginerr", "1");
		Employee emp4=new Employee("CHANDU", 1028, "Software Enginerr", "1");
		employeeData.add(emp1);
		employeeData.add(emp2);
		employeeData.add(emp3);
		employeeData.add(emp4);
		mav.addObject("empData",employeeData);
		if("pdf".equals(type)) {
			mav.setViewName("pdfview");
		}else {
			mav.setViewName("xlsview");
		}
		return mav;
	}

}
