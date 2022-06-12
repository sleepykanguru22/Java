package com.codingdojo.hellohuman;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/search")
public class controllers {
	
@RequestMapping("/")
public String query(@RequestParam(value="q", required=false) String searchQuery) {
	return "Hello " + searchQuery;
	}
@RequestMapping("/fullname")
public String fullname(@RequestParam(value="q") String firstName, @RequestParam(value="q1") String lastName) {
	return "Hello " + firstName + " "+ lastName;
	}
@RequestMapping("/multi_name")
public String names(@RequestParam(value="q") String firstName, @RequestParam(value="times")Integer count  ) {
	String s = "";
	for (int i = 0; i<count; i ++) {
		s += ("Hello" +firstName);
	}
	
	return s;
	}
}
