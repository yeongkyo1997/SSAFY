package com.ssafy.practice.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssafy.practice.model.Product;
import com.ssafy.practice.model.service.ProductService;

@Controller
@RequestMapping("product")
public class ProductController {
	private ProductService productService;

	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("regist")
	public String regist() {
		return "regist";
	}

	@PostMapping("regist")
	public String regist(Product product) throws SQLException {
		productService.regist(product);
		return "redirect:/product/list";
	}

	@GetMapping("list")
	public String list(Model model) throws SQLException {
		List<Product> list = productService.listProduct();
		model.addAttribute("list", list);
		return "list";
	}
	
	@GetMapping("multi-delete")
	public String multiDete(@RequestParam(name = "code") List<String> codeList) throws Exception {
		if (codeList.size() > 0)
			productService.multiDelete(codeList);
		return "redirect:list";
	}
}
