<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Plans</title>
</head>
<body>
   <h2 style="align-content: center;">Plans Details</h2>
   <table>
      <thead>
         <tr>
            <td>PLAN NAME</td>
            <td>AMOUNT TO RECHARGE</td>
            <td>VALIDITY</td>
            <td>AMOUNT YOU WILL GET</td>
         </tr>
      </thead>
      <tbody>
         <c:forEach items="${plansList}" var="plansDTO">
            <tr>
              <td>${plansDTO.planName}</td>
              <td>${plansDTO.amountToBalance}</td>
              <td>${plansDTO.validity}</td>
              <td>${plansDTO.amountWillGet}</td>
            </tr>
         </c:forEach>
      </tbody>
   </table>
   <% 
      Enumeration<String> enumer =  request.getAttributeNames();
       while(enumer.hasMoreElements()){
    	   String name = enumer.nextElement();
    	   System.out.println(name);
       }
   %>
</body>
</html>