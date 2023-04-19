<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>SSAFY 사용자 관리</title>
    <style>
        .user_input {
            display: flex;
            flex-direction: row;
        }
        .info_input{
            margin-left: 10px;
        }
    </style>
</head>
<body>
<h1>SSAFY 사용자 관리</h1>
<!-- 코드작성 -->
<form action="user" method="post">
    <div class="user_input">
        <div class="info_label">
            <div>아이디</div>
            <div>비밀번호</div>
            <div>이름</div>
            <div>이메일</div>
            <div>나이</div>
        </div>
        <div class="info_input">
            <div><input type="text" name="id"></div>
            <div><input type="password" name="pw"></div>
            <div><input type="text" name="name"></div>
            <div><input type="text" name="email"></div>
            <div><input type="text" name="age"></div>
        </div>
    </div>
    <input type="submit" value="등록"/>
    <input type="button" value="초기화"/>
</form>
</body>
</html>