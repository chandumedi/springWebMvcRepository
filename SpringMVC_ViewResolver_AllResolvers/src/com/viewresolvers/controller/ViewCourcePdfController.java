package com.viewresolvers.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.viewresolvers.dto.Course;

public class ViewCourcePdfController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav= null;
		List<Course> courseList = null;
		Course course = null;
		mav = new ModelAndView();
		courseList = new ArrayList<Course>();
		for(int i=0;i<=3;i++) {
			course = new Course();
			course.setDate(new Date());
			course.setName("sairam");
			course.setId(i);
			courseList.add(course);
		}
		mav.setViewName("excelView");
		return mav.addObject("courselist", courseList);
		
	}

}
