package com.spring.root.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringWithRestController {

	@RequestMapping("/hello")
	public String get() {
		return "helloSpringRest";
	}
}
