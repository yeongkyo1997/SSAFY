<%@page import="com.ssafy.servlet.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String root = request.getContextPath();
	User user = (User) session.getAttribute("user");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<header>
		<nav>
			<ul>
				<%
					if (user == null) {
				%>
				<li><a href="<%=root%>/login">로그인</a></li>
				<li><a href="<%=root%>/register">회원가입</a></li>
				<%
					} else {
				%>
				<li><a href="<%=root%>/mypage">마이페이지</a></li>
				<li><a href="<%=root%>/logout">로그아웃</a></li>
				<%
					}
				%>
			</ul>
		</nav>
		<%
			if (user != null) {
		%>
		<div>~~님 접속 중</div>
		<%
			}
		%>
	</header>
	<div>
		<h2>메인 페이지 내용 부분</h2>
	</div>
</body>
</html>