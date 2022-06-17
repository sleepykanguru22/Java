package com.codingdojo.oomikuji.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/omikuji")
public class OmikujiController {
	@RequestMapping("/home")
public String index() {
		
	return "index.jsp";
	}
	@PostMapping("/show")
	public String form(@RequestParam(value="num") String num,
			@RequestParam(value="city") String city,
			@RequestParam(value="realPerson") String realPerson,
			@RequestParam(value="activity") String activity,
			@RequestParam(value="organism") String organism,
			@RequestParam(value="comment") String comment,
			HttpSession session) {
		System.out.println(num);
		System.out.println(city);
		System.out.println(realPerson);
		System.out.println(activity);
		System.out.println(organism);
		System.out.println(comment);
		session.setAttribute("num", num);
		session.setAttribute("city", city);
		session.setAttribute("realPerson", realPerson);
		session.setAttribute("activity", activity);
		session.setAttribute("organism", organism);
		session.setAttribute("comment", comment);
		
		return "redirect:/omikuji/show";
		
	}
	@RequestMapping("/show")
	public String show(HttpSession session, Model model ) {
//		model.addAttribute("num", session.getAttribute("num"));
//		model.addAttribute("city", session.getAttribute("city"));
//		model.addAttribute("realPerson", session.getAttribute("realPerson"));
//		model.addAttribute("activity", session.getAttribute("activity"));
//		model.addAttribute("organism", session.getAttribute("organism"));
//		model.addAttribute("comment", session.getAttribute("comment"));
		return "results.jsp";
		}
}
