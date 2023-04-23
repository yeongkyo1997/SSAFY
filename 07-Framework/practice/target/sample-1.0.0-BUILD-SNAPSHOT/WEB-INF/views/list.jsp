<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
    <title>list</title>
</head>
<body>
<%@ include file="/WEB-INF/views/header.jsp" %>
<hr>
<table>
    <tr>
        <th>번호</th>
        <th>제목</th>
        <th>글쓴이</th>
    </tr>
    <c:forEach var="board" items="${list}">
        <tr>
            <td>${board.no}</td>
            <td>${board.title}</td>
            <td>${board.name}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
