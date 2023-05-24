<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>c:choose가 if~else if ~ else를 표현할 수 있다.</h2>
	<h3>age변수 20세 미만:xxxx님 청소년입니다. 20세이상 xxx님 성인입니다.</h2>
	if문 else if문 -> c:when
	else -> c:otherwise
	
	<c:choose>
		<c:when test="${param.age<20}">
			<h3>${param.name }님은 청소년입니다.</h3>
		</c:when>
		<c:otherwise>
			<h3>${param.name}님은 성인입니다.</h3>
		</c:otherwise>
	</c:choose>
	
	<c:choose>
		<c:when test="${param.grade=='A'}">
			<h3>${param.name }님은 A등급 입니다.</h3>
		</c:when>
		<c:when test="${param.grade=='B'}">
			<h3>${param.name }님은 B등급 입니다.</h3>
		</c:when>
		<c:when test="${param.grade=='C'}">
			<h3>${param.name }님은 C등급 입니다.</h3>
		</c:when>
		<c:otherwise>
			<h3>정의되지않은등급</h3>
		</c:otherwise>
	</c:choose>
	
	<hr/>
	
	<h2>널체크(컨트롤러에서 공유된 user어트리뷰트가 널인지체크해보기)</h2>
	<c:choose>
		<c:when	test="${user==null}">
			<h3>null</h3>
		</c:when>
		<c:otherwise>
			<h3>not null</h3>
		</c:otherwise>
	</c:choose>	
	
	
</body>
</html>