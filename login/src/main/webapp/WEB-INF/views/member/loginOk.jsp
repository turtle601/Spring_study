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

	<P>  The time on the server is ${serverTime}. </P>
	
	<a href="${cp}/"> MAIN </a>
	
</body>
</html>