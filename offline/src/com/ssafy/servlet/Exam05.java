package com.ssafy.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// web.xml
//@WebServlet(name = "/servlet.Exam05", urlPatterns = "/servlet/exam05")
public class Exam05 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("exam05 호출됨...");
	}

}
