package com.web.boot.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.apps.util.ErrorExceptionHandlingUtil;
import com.web.boot.bo.TodoBO;
import com.web.boot.service.LoginService;
import com.web.boot.service.TODOService;

@Controller
@SessionAttributes("name")
public class LoginController {

	@Autowired
	LoginService service;

	@Autowired
	TODOService todoService;

	@RequestMapping(value = "/login.htm", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model) {
		return "Login";
	}

	@RequestMapping(value = "/login.htm", method = RequestMethod.POST)
	public String showWelcomePage(ModelMap model, @RequestParam String name,
			@RequestParam String password) {
		boolean isValidUser = service.validateUser(name, password);

		if (!isValidUser) {
			model.put("errorMessage", "Invalid Credentials");
			return "Login";
		}

		model.put("name", name);
		model.put("password", password);

		return "Welcome";
	}

	@RequestMapping(value = "/list-todos.htm", method = RequestMethod.GET)
	public ModelAndView getToDOList(@RequestParam("listCode") String listCode,
			ModelAndView mav) {
		List<TodoBO> todoData = todoService.fetchTodoList(listCode);
		mav.addObject("todoData", todoData);
		mav.setViewName("viewTodo");
		return mav;
	}

	
}
