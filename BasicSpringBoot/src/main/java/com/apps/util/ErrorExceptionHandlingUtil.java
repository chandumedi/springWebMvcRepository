package com.apps.util;

import javax.servlet.http.HttpServletRequest;



public class ErrorExceptionHandlingUtil {
	public static Integer provideErrorType(HttpServletRequest request){
		Integer errorCode= (Integer)request.getAttribute("javax.servlet.error.status_code");
		return errorCode;
	}
}
