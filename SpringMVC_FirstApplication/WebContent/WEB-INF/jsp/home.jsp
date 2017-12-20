<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="font-size: xx-large; color: blue;">
<h1>This is comming from JSP Page Itself</h1>
<h1>Value from controller ${requestScope.message}</h1>
<%
System.out.println(request.getAttribute("message"));
%>
</body>
</html>