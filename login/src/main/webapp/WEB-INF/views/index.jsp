<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Home</title>
</head>
<body>
	<h1> Home </h1>
	
	<c:if test = "${empty member}">
		<a href = "${cp}/member/joinForm">회원가입</a>
		<a href = "${cp}/member/loginForm">로그인</a> 
		
	</c:if>
	
	<c:if test = "${!empty member}">
		<a href = "${cp}/member/modifyForm">수정</a>
		<a href = "${cp}/member/logout">로그아웃</a>
		<a href = "${cp}/member/removeForm">삭제</a>
	</c:if>
	
</body>
</html>