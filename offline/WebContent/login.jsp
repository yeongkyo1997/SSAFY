<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form>
		<div method="post" action="<%=request.getContextPath()%>/login">
			아이디 : <input type="text" name="id" />
		</div>
		<div>
			패스워드 : <input type="password" name="password" />
		</div>

		<div>
			<button>로그인</button>
		</div>
	</form>
</body>
</html>