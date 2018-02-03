<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>Task Name
			</tr>
			<tr>Candidate Name
			</tr>
			<tr>Days to Complete
			</tr>
		</thead>
		<tbody>
			<tr>
				<c:forEach items="${todoData}" var="todo">
					<td>${todo.taskName}</td>
					<td>${todo.doerName}</td>
					<td>${todo.targatedDays}</td>
				</c:forEach>
				</tr><br>
	</table>
</body>
</html>