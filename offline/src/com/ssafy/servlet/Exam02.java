package com.ssafy.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/servlet/exam02")
public class Exam02 extends GenericServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) {
		System.out.println("Hello");
	}
}
