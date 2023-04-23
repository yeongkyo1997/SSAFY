<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <%@ include file="./include/head.jsp" %>
</head>

<body>
<%@ include file="./include/nav.jsp" %>
<div class="container p-4">
    <table>
        <tr>
            <th>상품번호</th>
            <td>${product.code}</td>
        </tr>
        <tr>
            <th>상품명</th>
            <td>${product.model}</td>
        </tr>
        <tr>
            <th>수량</th>
            <td>${product.price}</td>
        </tr>
        </tr>
        <tr>
            <td colspan="2"><a href="delete?code=${product.code}">삭제</a></td>
        </tr>
    </table>
</div>
<%@ include file="./include/footer.jsp" %>
