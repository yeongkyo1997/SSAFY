<%--
  Created by IntelliJ IDEA.
  User: SSAFY
  Date: 2023-03-23
  Time: 오후 1:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Insert title here</title>
</head>
<body>
<c:set var="msg" value="안녕하세요"/>
<c:set var="msg" value="안녕하세요" scope="request"/>
<div>${msg}</div>
<div><c:out value="${msg}"/></div>
</body>
</html>
