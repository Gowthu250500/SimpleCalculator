<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result page</title>
</head>
<body>
	<h1>Result is:</h1>
	<h2><%= request.getAttribute("result") %></h2>
</body>
</html>