<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<h1> memJoinOk </h1>
	ID : ${member.id}<br />
	PW : ${member.pw}<br />
	Mail : ${member.mail} <br />
	Phone : ${member.memPhone.hp1} - ${member.memPhone.hp2} - ${member.memPhone.hp3} <br />

	<P> The time on the Server is ${serverTime}. </P>
	
	<a href="/login/resources/html/index.html"> first page </a>
</body>
</html> 