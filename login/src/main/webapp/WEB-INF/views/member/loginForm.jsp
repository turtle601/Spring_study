<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content = "text/html; charset=UTF-8">
	<title>Home</title>
<link rel = "stylesheet" type = "text/css" href = "${cp}/resources/css/normal.css">
</head>
<body>

	<h1>DO LOGIN</h1>
	
	<form:form action="${cp}/member/login" method="post" commandName="member">
		<table>
			<tr>
				<td>ID</td>
				<td><form:input path="id" /></td>
			</tr>
			<tr>
				<td>PW</td>
				<td><form:password path="pw" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Login" ></td>
			</tr>
		</table>
	</form:form>
	
	<a href = "${cp}/"> Main </a>
	
</body>
</html> 