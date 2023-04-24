<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

    <title>SSAFY</title>
</head>

<body>
<%@ include file="/WEB-INF/views/header.jsp" %>
<h1 id="head">출결 이슈 - 출결 이슈 등록</h1>
<form id="registForm" action="${root}/board/write" method="post">
    <label for="ano" class="inputtitle">이슈 번호</label>
    <input type="text" name="ano" id="ano">
    <br>
    <label for="userid" class="inputtitle">아이디</label>
    <input type="text" name="userid" id="userid" value="${userInfo.userid}">
    <br>
    <label for="issuedate" class="inputtitle">날짜</label>
    <input type="date" name="issuedate" id="issuedate">
    <br>
    <label for="issue" class="inputtitle">사유</label>
    <input type="text" name="issue" id="issue">
    <br>
    <button id="regist">출결 이슈 등록</button>
</form>

<fieldset id="result">
    <legend>등록 오류</legend>
    <div>
        <c:if test="${not empty error}">
            <p>${error}</p>
        </c:if>
    </div>
</fieldset>
<%@ include file="/WEB-INF/views/footer.jsp" %>
</body>

</html>