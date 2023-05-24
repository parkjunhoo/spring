<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <title>serverweb main</title>
  <meta charset="UTF-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a style="color:red;" >dd</a>
      <a class="navbar-brand" href="#">자바나라</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="/serverweb/index.jsp">Home</a></li>
      <!--   <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">서블릿basic <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Page 1-1</a></li>
            <li><a href="#">Page 1-2</a></li>
            <li><a href="#">Page 1-3</a></li>
          </ul>
        </li> -->
        <li><a href="/springmvc/index.jsp">서블릿 basic</a></li>
        <li><a href="#">JSP basic</a></li>
        <li><a href="/springmvc/dept/list.do">부서관리</a></li>
        <li><a href="/springmvc/user/_mvc/list.jsp">인사관리</a></li>
        <li><a href="/springmvc/board/list.do">게시판</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <c:choose>
        	<c:when test="${user == null}">
        		<li><a href="/springmvc/emp/insert"><span class="glyphicon glyphicon-plus"></span> Sign Up</a></li>
        		<li><a href="/springmvc/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
        	</c:when>
        	<c:otherwise>
        		<li><a href="/serverweb/logout.do"><span class="glyphicon glyphicon-log-in"></span> LOGOUT</a></li>
        	</c:otherwise>
        </c:choose>
        
        
      </ul>
    </div>
  </div>
</nav>
  


</body>
</html>