package com.ssafy.sample.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssafy.sample.dto.ProductDto;
import com.ssafy.sample.model.service.ProductService;
import com.ssafy.sample.model.service.ProductServiceImpl;

@WebServlet("/product")
public class MemberController extends HttpServlet {
	private ProductService productService;

	@Override
	public void init() throws ServletException {
		productService = ProductServiceImpl.getInstance();
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String action = request.getParameter("action");

		if (action == null)
			action = "list";

		switch (action) {
		case "regist":
			response.sendRedirect(request.getContextPath()+);
			break;
		}
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	private String regist(HttpServletRequest request, HttpServletResponse response) {
		ProductDto productDto = new ProductDto();
		productDto.setCode(request.getParameter("code"));
		productDto.setModel(request.getParameter("model"));
		productDto.setPrice(Integer.parseInt(request.getParameter("price")));
		try {
			productService.regist(productDto);
		} catch (Exception e) {
			e.printStackTrace();
			return "/error/error.jsp";
		}
		return "/product?action=list";
	}
}
