package com.codingdojo.controllerspractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ControllerspracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControllerspracticeApplication.class, args);
	}
	@RestController
	public class HomeController {
	        @RequestMapping("/")
	        public String hello() {
	                return "Hello World!";
	        }
	}

}
