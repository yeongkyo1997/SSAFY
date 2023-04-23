<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>list</title>
<%@ include file="./include/head.jsp"%>
</head>
<body>
	<%@ include file="./include/nav.jsp"%>
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
					<td>${product.code}</td>
					<td>${product.model}</td>
					<td>${product.price}</td>
					<td><input type="checkbox" name="code" value="${product.code}" /></td>
				</tr>
			</c:forEach>
		</table>
		<button>삭제</button>
	</form>
	<c:if test="${not empty userInfo}">
		<a href="write">글쓰기</a>
	</c:if>
	<%@ include file="./include/footer.jsp"%>