package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/demo")
public class TestdemoController {
	
	@GetMapping
	public ModelAndView test() {
		ModelAndView model = new ModelAndView();
		model.setViewName("/demo1/demotest1");
		return model;
	}
	
}
