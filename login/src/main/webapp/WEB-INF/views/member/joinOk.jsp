<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<h1> Join OK </h1>
	ID : ${member.id}<br />
	PW : ${member.pw}<br />
	Mail : ${member.mail} <br />	

	<P> The time on the Server is ${serverTime}. </P>
	
	<a href = "${cp}/"> Main </a>
	
</body>
</html> 