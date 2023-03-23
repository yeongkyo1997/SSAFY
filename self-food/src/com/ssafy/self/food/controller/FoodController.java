package com.ssafy.self.food.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssafy.self.food.model.dao.FoodDao;
import com.ssafy.self.food.model.dao.FoodDaoImpl;

@WebServlet("/food")
public class FoodController extends HttpServlet {
	private FoodDao foodDao;

	@Override
	public void init() throws ServletException {
		foodDao = FoodDaoImpl.getInstance();
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action == null || action.equals(""))
			action = "list";

		String path = "";
		switch (path) {
		case "list":
			break;
		case "push":
			break;
		case "kill":
			break;
		case "clear":
			break;
		}
	}
}
