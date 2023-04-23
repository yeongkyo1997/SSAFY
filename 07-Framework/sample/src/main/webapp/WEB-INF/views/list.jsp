<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>list</title>
</head>
<body>
	<%@ include file="/WEB-INF/views/header.jsp"%>
	<hr>
	<form action="multi-delete">
		<table>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>글쓴이</th>
			</tr>
			<c:forEach var="product" items="${list}">
				<tr>
					<td>${product.no}</td>
					<td><a href="detail?no=${product.no}">${product.title}</a></td>
					<td>${product.title}</td>
					<td>${product.name}</td>
					<td><input type="checkbox" name="no" value="${product.no}" /></td>
				</tr>
			</c:forEach>
		</table>
		<button>삭제</button>
	</form>
	<c:if test="${not empty userInfo}">
		<a href="write">글쓰기</a>
	</c:if>
</body>
</html>
