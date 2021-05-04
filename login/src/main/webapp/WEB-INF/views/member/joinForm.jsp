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
	<h1> Join OK </h1>\
	
	<form:form action = "${cp}/member/join" method = "post" commandName = "member">
		<table>
			<tr>
				<td>ID</td>
				<td><form:input path = "id" /></td>
			</tr>
			
			<tr>
				<td>PW</td>
				<td><form:password path = "pw" /></td>
			</tr>
			
			<tr>
				<td>MAIL</td>
				<td><form:input path = "mail" /></td>
			</tr>
			
			<tr>
				<td>Phone</td>
				<td><form:input path = "memPhone.hp1" /> - 
					<form:input path = "memPhone.hp2" /> - 
					<form:input path = "memPhone.hp3" />
				</td>
			
			</tr>
			<tr>
				<td colspan = "2">
					<input type = "submit" value = "join">
					<input type = "reset" value = "Cancel">
			</tr>		
		</table>
	</form:form>
	
	<a href = "${cp}/"> Main </a>
	
</body>
</html> 