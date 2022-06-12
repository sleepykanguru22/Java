package com.codingdojo.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "Hello World from controller file";
	}
	@RequestMapping("/new_route")
	public String newroute() {
		return "Hello from new route";
	}
}
