package com.springboot.examples.course.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CouseController {

	@RequestMapping("/display")
	public String display() {

		return "Welcome";

	}
}
