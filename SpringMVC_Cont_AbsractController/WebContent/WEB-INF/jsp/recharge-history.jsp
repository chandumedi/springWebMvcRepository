<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Recharge History Details</h3>
<table style="border: thin;color: black; size: 2px">
    <tr>
         <th>ORDER-ID</th>
         <th>RECHARGE-DATE</th>
         <th>MOBILE-NUM</th>
         <th>AMOUNT</th>
         <th>STATUS</th>
    </tr>
    <c:forEach  items="${historydetails }"   var="rechargeHistoryObj">
          <tr>
                 <td>${rechargeHistoryObj.rechargeOrderNo }</td>
                 <td>${rechargeHistoryObj.rechargeDate }</td>
                 <td>${rechargeHistoryObj.mobileNo }</td>
                 <td>${rechargeHistoryObj.amount }</td>
                 <td>${rechargeHistoryObj.status }</td>
          </tr>
    </c:forEach>
</table>
</body>
</html>