package com.ssafy.springtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Locale;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home(Locale locale, Model model) {
		return "index";
	}
	
}
