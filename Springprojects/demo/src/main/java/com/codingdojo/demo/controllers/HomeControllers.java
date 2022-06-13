package com.codingdojo.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControllers {
	@RequestMapping("/home")
	public String home() {
		return "home.jsp";
	}
	@RequestMapping("/jstl")
	public String jstl(Model model) {
		String petName = "Stitch";
		model.addAttribute("jspPetName",petName);
		return "jstl.jsp";
	}
}
