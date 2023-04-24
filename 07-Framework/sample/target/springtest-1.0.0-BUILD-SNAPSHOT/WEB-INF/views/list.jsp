<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>SSAFY</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }

        th {
            background: gray;
        }

        th, td {
            border: 1px dotted black;
            text-align: center;
        }

        #selectedDel {
            text-align: right;
        }
    </style>
</head>
<body>
<%@ include file="/WEB-INF/views/header.jsp" %>
<h1 id="head">출결 관리 - 리스트</h1>
<form method="get" action="${root}/board/multi-delete">
    <table>
        <tr>
            <th>이슈번호</th>
            <th>아이디</th>
            <th>날짜</th>
            <th>사유</th>
            <th>삭제</th>
        </tr>
        <c:if test="${userInfo.userid == 'ssafy'}">
            <c:forEach var="issue" items="${list}">
                <tr>
                    <td><a href="${root}/board/detail">${issue.ano}</a></td>
                    <td>${issue.userid}</td>
                    <td>${issue.issuedate}</td>
                    <td>${issue.issue}</td>
                    <td><input type="checkbox" name="ano"
                               value="${issue.ano}"></td>
                </tr>
            </c:forEach>
        </c:if>
        <c:if test="${userInfo.userid != 'ssafy'}">
            <c:forEach var="issue" items="${list}">
                <c:if test="${issue.userid == userInfo.userid}">
                    <tr>
                        <td><a href="${root}/board/detail">${issue.ano}</a></td>
                        <td>${issue.userid}</td>
                        <td>${issue.issuedate}</td>
                        <td>${issue.issue}</td>
                        <td><input type="checkbox" name="ano"
                                   value="${issue.ano}"></td>
                    </tr>
                </c:if>
            </c:forEach>
        </c:if>
    </table>

    <input type="submit" value="선택항목삭제">
</form>
<%@ include file="/WEB-INF/views/footer.jsp" %>
</body>
</html>