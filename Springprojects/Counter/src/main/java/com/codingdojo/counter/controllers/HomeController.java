package com.codingdojo.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
@RequestMapping("/your_server")
public String index(HttpSession session) {
	if (session.getAttribute("count") == null) {
	session.setAttribute("count", 0);
	}
	return "index.jsp";
	}
@RequestMapping("/counter")
public String showCounter(HttpSession session, Model model) {
	Integer currentCount = (Integer) session.getAttribute("count");
	model.addAttribute("countToShow", currentCount);
	
	session.setAttribute("count",currentCount+1 );
	return "showcounter.jsp";
	}
}
	
