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
	hp1 : ${member.hp1} <br />

	<a href="/login/resources/html/index.html"> first page </a>
</body>
</html> 