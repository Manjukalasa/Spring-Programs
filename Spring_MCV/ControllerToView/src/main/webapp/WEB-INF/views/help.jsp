<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Using ModelAndView</title>
</head>
<body>
<%
	Integer id = (Integer) request.getAttribute("id");
	String name = (String) request.getAttribute("name");
	Integer age = (Integer) request.getAttribute("age");
	%>
	<h1>The id is:<%=id%></h1>
	<h1>The name is:<%=name%></h1>
	<h1>The Age is:<%=age%></h1>
</body>
</html>