<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <%@ include file="./include/head.jsp" %>
</head>
<body>
<%@ include file="./include/nav.jsp" %>

<%-- 페이지만의 내용 --%>
<div class="container p-4">
    <table>
        <tr>
            <th>상품코드</th>
            <th>상품명</th>
            <th>재고수량</th>
        </tr>
        <c:forEach var="product" items="${list}">
            <tr>
                <td>${product.code}</td>
                <td><a href="detail?code=${product.code}">${product.model}</a></td>
                <td>${product.price}</td>
            </tr>
        </c:forEach>
    </table>
</div>
<%-- --%>
<%@ include file="./include/footer.jsp" %>