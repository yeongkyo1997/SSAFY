j
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<c:set var="root" value="${pageContext.request.contextPath}"></c:set>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h3>Spring MVC</h3>
		<a href="${root}/">hello spring</a><br>
		<a href="${root}/single">single parameter</a><br>
		<a href="${root}/multi">multi paramter</a><br>
	</div>
</body>
</html>