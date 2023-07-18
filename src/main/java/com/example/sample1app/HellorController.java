package com.example.sample1app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HellorController {
	
	@RequestMapping("/{eng}")
	public ModelAndView index(@PathVariable String eng, ModelAndView mav) {
		mav.setViewName("index");
		mav.addObject("msg",eng + "の日本語は？");
		mav.addObject("eng", eng);
		return mav;
	}
}
