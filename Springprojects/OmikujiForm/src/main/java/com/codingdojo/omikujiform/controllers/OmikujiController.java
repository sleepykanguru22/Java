package com.codingdojo.omikujiform.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/omikuji")
public class OmikujiController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		return "index.jsp";
	}
	