<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>사용자 등록 결과</title>
</head>
<body>
<h1>사용자 등록 결과</h1>
<h2>등록 사용자 정보</h2>
<!-- 코드작성 -->
<c:if test="${not empty user}">
    <table>
        <tr>
            <th>아이디</th>
            <td>${user.id}</td>
        </tr>
        <tr>
            <th>이름</th>
            <td>${user.name}</td>
        </tr>
        <tr>
            <th>비밀번호</th>
            <td>${user.password}</td>
        </tr>
        <tr>
            <th>이메일</th>
            <td>${user.email}</td>
        </tr>
    </table>
</c:if>
</body>
</html>