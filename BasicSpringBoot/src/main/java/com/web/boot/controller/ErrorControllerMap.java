package com.web.boot.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.apps.util.ErrorExceptionHandlingUtil;

@Controller
public class ErrorControllerMap implements ErrorController{
	@RequestMapping(value = "/error", method = RequestMethod.GET)
	public String mapErrorPages(ModelMap model, HttpServletRequest request) {
		String errorMessage = "";
		Integer errorCode = ErrorExceptionHandlingUtil
				.provideErrorType(request);
		switch (errorCode) {
		case 404: {
			errorMessage = "Http error code.Requested Resource not found";
			break;
		}
		case 400: {
			errorMessage = "Hpttp error code 400.Bad Request";
			break;
		}
		case 500: {
			errorMessage = "Hpttp error code 500.Server side Error";
			break;
		}
		}
		model.put("errorMessage", errorMessage);
		return "errorPage";
	}

	@Override
	public String getErrorPath() {
		return "/error";
	}
}
