package com.ssafy.paging.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssafy.paging.model.service.Board1ServiceImpl;
import com.ssafy.paging.model.service.BoardService;

@WebServlet("/board/list2")
public class List2Controller extends HttpServlet {
	private BoardService service;
	public List2Controller() {
		service = Board1ServiceImpl.getInstance();
	}
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}










