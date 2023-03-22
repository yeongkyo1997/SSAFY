package com.ssafy.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servlet/exam06")
public class Exam06 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse response) throws IOException {
		/*
		 * 응답하는 문서의 타입 설정 및 인코딩
		 * 
		 * 응답 출력 객체 얻기
		 * 
		 * 응답 내용 작성 후 전송
		 * 
		 * MINE main/sub
		 */

//		response.setContentType("text/plain"); // 서버에서 전송하는 내용이 어떤 건지 클라이언트 브라우저에게 알려준다.
//		response.setCharacterEncoding("utf-8");
//		response.setContentType("text/plain;charset=utf-8");
//		response.setContentType("text/html;charset=utf-8");
		response.setContentType("text/xml;charset=utf-8");

//		OutputStream out = response.getOutputStream(); // 바이트 단위를 출력할 때
		PrintWriter out = response.getWriter(); // 문자 단위를 출력할 때

//		out.print("success");
//		out.print("<h2>success</h2>");
		out.print("<family><me>짱구</me></family>");
		out.close();
	}
}
