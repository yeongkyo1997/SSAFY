<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
    <ul class="navbar-nav me-auto">
        <li class="nav-item"><a class="nav-link" href="${root}/product/list">상품 목록</a></li>
        <li class="nav-item"><a class="nav-link" href="${root}/product/regist">상품 정보 등록</a></li>
    </ul>
    <c:if test="${empty userInfo}">
        <form method="post" action="${root}/user/login">
            <input type="text" name="user_id" placeholder="아이디"/>
            <input type="password" name="user_password" placeholder="비밀번호"/>
            <button>로그인</button>
        </form>
    </c:if>
    <c:if test="${not empty userInfo}">
        <span style="color: white">${userInfo.user_name}님 환영합니다.</span>
        <form action="${root}/user/logout">
            <button>로그아웃</button>
        </form>
    </c:if>
</nav>