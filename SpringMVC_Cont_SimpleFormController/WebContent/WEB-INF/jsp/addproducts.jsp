<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h2>Add Products Here</h2>
  <form:errors path="*" cssStyle=""></form:errors>
  <form:form action="" >
  Product      :<form:input path="product" />
  Category     :<form:input path="category" />
  Brand        :<form:input path="brand"/>
  Price Range  :<form:input path="minBudget"/> - <form:input path="maxBudget"/>
  <input type="submit" value="add">
  </form:form>
</body>
</html>