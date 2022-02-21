package com.groupe2.freelancing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsersController {
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
}