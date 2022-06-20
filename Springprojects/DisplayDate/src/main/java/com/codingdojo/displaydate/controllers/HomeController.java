package com.codingdojo.displaydate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
@RequestMapping("/dashboard")
public String index() {
	 return "dashboard.jsp";
}
@RequestMapping("/date")
public String currentDate() {
	 return "currentdate.jsp";
}
@RequestMapping("/time")
public String currentTime() {
	 return "currenttime.jsp";
}
}
