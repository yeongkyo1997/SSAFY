package com.ssafy.servlet;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/login.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		String password = request.getParameter("password");

		// 로그인 성공
		if ("ssafy".equals(id) && "1111".equals(password)) {
			// main.jsp
			// 하드코딩으로 유저 정보 저장
			User user = new User();
			user.setId(id);
			user.setPassword(password);
			user.setName("싸피");

			// 세션에 정보 등록
			HttpSession session = request.getSession();
			session.setAttribute("user", user);

			// 리다이렉트로 메인 페이지 이동
			response.sendRedirect(request.getContextPath() + "/main");
		} else {
			// login.jsp 이동
			response.sendRedirect(request.getContextPath() + "/login");
		}
	}
}
