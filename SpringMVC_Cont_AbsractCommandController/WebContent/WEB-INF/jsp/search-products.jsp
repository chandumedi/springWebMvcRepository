<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SearchProducts</title>
</head>
<body>
<h2>Search Products Here</h2>
<form action="${pageContext.request.contextPath}/do-search-products.mvc" >
 Product   :<input type="text"  name="product" /><br/>
 Category  :<input type="text" name="category" /><br/>
 Brand     :<input type="text" name="brand" /><br/>
 PriceRange   :<input type="text" name="minBudget" >  -  <input type="text" name="maxBudget">
 <input type="submit" value="search">
</form>
</body>
</html>