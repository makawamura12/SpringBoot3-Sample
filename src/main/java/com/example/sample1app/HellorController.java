package com.example.sample1app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HellorController {
	
	@RequestMapping("/{temp}")
	public String index(@PathVariable String temp) {
		switch(temp) {
		case "index":
			return "index";
		default:
			return "other";
		}
	}
}
