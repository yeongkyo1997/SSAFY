<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%--
	공유영역
	PageContext				pageContext
	HttpServletRequest		request
	HttpSession				seesion
	ServletContext			application

	
	ServletConfig			config
	JspWriter				out
	Object					page
	HttpServletResponse		response
	Trhowable				exception
	ServletConfig			config
										pageContext.setAttribute("id", "ssafy");
										pageContext.setAttribute("name", "싸피");
										request.setAttribute("id", "req_ssafy");
										appliction.setAttribute("msg", "모두공유");
										String msg = (String)application.getAttribute("msg");
	--%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>Insert title here</title>
</head>
<body>
	<h2>구구단</h2>
	<%
		int dan = Integer.parseInt(request.getParameter("dan"));
		for (int i = 1; i < 10; i++)
			out.println(dan + " * " + i + " = " + (dan * i) + "<br>");
	%>

	<%
		for (int i = 1; i < 10; i++) {
	%>
	<%=dan + " * " + i + " = " + (dan * i) + "<br>"%>
	<%
		}
	%>
	<div>
		<a href="exam05input.jsp">뒤로가기</a>
	</div>
</body>
</html>
