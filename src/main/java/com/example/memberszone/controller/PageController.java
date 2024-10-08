package com.example.memberszone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PageController {

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("name", "Nikhil");
		return "home";
	}

	@GetMapping("/home")
	public String home(Model model) {

		return "home";
	}

	@GetMapping("/contact-us")
	public String contactUs(Model model) {

		return "contact-us";
	}

	@GetMapping("/features")
	public String features(Model model) {

		return "features";
	}

	@GetMapping("/admin")
	public String getAdminPage(Model model) {
		return "admin";
	}

	@GetMapping("/dashboard")
	public String getDashBoard(Model model) {
		return "dashboard";
	}

}
