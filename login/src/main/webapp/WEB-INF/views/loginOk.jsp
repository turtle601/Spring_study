<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<h1> memLoginOk </h1>
	ID : ${member.id}<br />
	PW : ${member.pw}<br />
	
	<a href="/login/resources/html/index.html"> Go Main </a>
</body>
</html>