<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<h1>Update</h1>
		
	<h3>memAft</h3>
	ID : ${memAft.id}<br />
	PW : ${memAft.pw}<br />
	Mail : ${memAft.mail} <br />
	Phone : ${memAft.memPhone.hp1} - ${memAft.memPhone.hp2} - ${memAft.memPhone.hp3}<br />
	
	<P>  The time on the server is ${serverTime}. </P>
	
	<a href="${cp}/"> MAIN </a>
</body>
</html>