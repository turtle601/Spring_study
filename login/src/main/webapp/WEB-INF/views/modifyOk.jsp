<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<h1>Modify</h1>
	
	<h3>memBef</h3>
	ID : ${memBef.id}<br />
	PW : ${memBef.pw}<br />
	Mail : ${memBef.mail} <br />
	Phone : ${memBef.memPhone.hp1} - ${memBef.memPhone.hp2} - ${memBef.memPhone.hp3}<br />

	<P> The time on the Server is ${serverTime}. </P>
	
	<h3>memAft</h3>
	ID : ${memAft.id}<br />
	PW : ${memAft.pw}<br />
	Mail : ${memAft.mail} <br />
	Phone : ${memAft.memPhone.hp1} - ${memAft.memPhone.hp2} - ${memAft.memPhone.hp3}<br />
	
	
	<a href="/login/resources/html/index.html"> first page </a>

</body>
</html>