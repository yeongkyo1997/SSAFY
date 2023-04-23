<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>list</title>
</head>
<body>
	<%@ include file="/WEB-INF/views/header.jsp"%>
	<hr>
	<table>
		<tr>
			<th>번호</th>
			<td>${product.no}</td>
		</tr>
		<tr>
			<th>제목</th>
			<td>${product.title}</td>
		</tr>
		<tr>
			<th>글쓴이</th>
			<td>${product.name}</td>
		</tr>
		</tr>
		<tr>
			<td colspan="2"><a href="delete?no=${product.no}">삭제</a></td>
		</tr>
	</table>
</body>
</html>
