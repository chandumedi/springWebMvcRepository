<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<h3>Context Path   :${pageContext.request.contextPath}</h3>
<h2>Welcome to Home Page</h2>
<a href="${pageContext.request.contextPath}/recharge-history.htm">VewHistroy</a>
</body>
</html>