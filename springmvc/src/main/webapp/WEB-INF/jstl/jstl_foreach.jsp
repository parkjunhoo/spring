<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl_foreach</title>
</head>
<body>
	<h2>1부터 10까지 출력</h2>
	<hr/>
	
	<c:forEach var="i" step="1" varStatus="vs" begin="1" end="10">
		<h2>
			${i} , current=>${mystatus.current} , index=>${vs.index},
			first=>${vs.first } , last => ${vs.last} , 
			begin => ${vs.begin } , end => ${vs.end },
			step => ${vs.step }
		</h2>
	</c:forEach>
</body>
</html>