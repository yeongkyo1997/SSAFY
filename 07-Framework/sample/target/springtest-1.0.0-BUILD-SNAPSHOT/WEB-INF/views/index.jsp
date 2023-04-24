<%@ page contentType="text/html;charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>SSAFY</title>
    <style type="text/css">
        h1, h4 {
            text-align: center;
        }

        a {
            margin: 10px;
        }

        .inputtitle {
            display: inline-block;
            width: 80px;
        }
    </style>

</head>
<body>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<h1>출결 관리</h1>
<fieldset>
    <h1>로그인 해주세요.</h1>
    <c:if test="${empty logininfo}">

        <form action="${root}/user/login" method="post">

            <label for="userid" class="inputtitle">아이디</label>
            <input type="text" id="userid" name="userid">
            <br>
            <label for="userpw" class="inputtitle">비밀번호</label>
            <input type="password" id="userpw" name="userpw">
            <br>
            <input type="submit" value="로그인">
        </form>
    </c:if>
</fieldset>
<hr>
<h4>
    <a href="${root}/board/write">출결 이슈 등록</a>
</h4>
<h4>
    <a href="${root}/board/list">출결 이슈 목록</a>
</h4>

</body>
</html>