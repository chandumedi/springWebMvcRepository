<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.error {
color: #ff0000;
font-style: italic;
}
</style>
</head>
<body>
  <h2>Add Products Here</h2>
  <form:errors path="*" cssStyle="error"></form:errors>
  <form:form action="" >
  Product      :<form:input path="product" /><span><form:errors path="product" cssClass="error"></form:errors></span>
  Category     :<form:input path="category" /><span><form:errors path="category" cssClass="error"></form:errors></span>
  Brand        :<form:input path="brand"/><span><form:errors path="brand" cssClass="error"></form:errors></span>
  Price Range  :<form:input path="minBudget"/> - <form:input path="maxBudget"/>
  <input type="submit" value="add">
  </form:form>
  <%-- <%  Enumeration<String> enumer = request.getAttributeNames();
  System.out.println("request scope");
  while(enumer.hasMoreElements()){
	  String str = enumer.nextElement();
	  System.out.println(str);
  }
  System.out.println("-----------------------------------");
  Enumeration<String> enumer1 = session.getAttributeNames();
  System.out.println("session scope");
  while(enumer1.hasMoreElements()){
	  String str = enumer1.nextElement();
	  System.out.println(str);
  }
  
  System.out.println("-----------------------------------");
  Enumeration<String> enumer2 = session.getAttributeNames();
  System.out.println("context scope");
  while(enumer2.hasMoreElements()){
	  String str = enumer2.nextElement();
	  System.out.println(str);
  }
  %> --%>
</body>
</html>