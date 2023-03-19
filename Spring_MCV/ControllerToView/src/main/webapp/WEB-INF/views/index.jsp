<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Using Model</title>
</head>
<body>
	<%
	Integer id = (Integer) request.getAttribute("id");
	String name = (String) request.getAttribute("name");
	Integer age = (Integer) request.getAttribute("age");
	List<String> friends = (List<String>) request.getAttribute("f");
	%>
	<h1>The id is:<%=id%></h1>
	<h1>The name is:<%=name%></h1>
	<h1>The Age is:<%=age%></h1>

	<%
	for (String S : friends) {
	%>
	<h1>The friends are:<%=S%></h1>
	<%
     }
     %>
</body>
</html>