<%@page import="kr.multi.erp.emp.EmpDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>컬렉션에 저장된 데이터에 접근하기(가장 많이 사용된다,)</h1>
	<h2>jsp가 하는일은 컨트롤러에서 공유한 attribute를 꺼내서 출력</h2>
	<h2>1. 배열데이터(jsp에서 만들어진 값)</h2>
	<%String[] arr =  {"jsp" , "java" , "spring" , "servlet"};%>
	<c:forEach var="data" items="<%=arr%>">
		<h3>${data}</h3>
	</c:forEach>
	
	<h2>2. ArrayList(컨트롤러에서 공유된 데이터)</h2>
	<%
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		request.setAttribute("list", list);
	%>
	<%String test = ""; %>
	<c:forEach var="data" items="${list}">
		<h3>${data }</h3>
	</c:forEach>
	
	<h2>3. ArrayList에 저장된 DTO제어</h2>
	<%
		ArrayList<EmpDTO> userList = new ArrayList<EmpDTO>();
		userList.add(new EmpDTO("001","장동건","","","",""));
		userList.add(new EmpDTO("001","김경환","","","",""));
		userList.add(new EmpDTO("001","이기범","","","",""));
		userList.add(new EmpDTO("001","윤녕민","","","",""));
		userList.add(new EmpDTO("001","황찬하","","","",""));
	%>
	<!-- 공유된 어트리뷰트 userList에 저장된 dto에서 name꺼내서 출력하기 -->
	<c:forEach  var="user" items="${userList}"><!-- getter메소드의 get을 없애고 첫 글자를 소문자로 변경한 이름을 정의 -->
		<h3>${user.name}</h3>
	</c:forEach>
</body>
</html>