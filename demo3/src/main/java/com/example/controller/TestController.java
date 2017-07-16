package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TestController {

	@RequestMapping("/")
	public String index(){
		return "Hello World";
	}
	@RequestMapping(value="/welcome", method = RequestMethod.GET)
	public ModelAndView welcome(){
		ModelAndView model = new ModelAndView();
		model.setViewName("welcome");
		return model;
	}
	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public ModelAndView dashboard() {
    	ModelAndView model = new ModelAndView();
//    	model.addObject("users", getUsers());
    	model.setViewName("dashboard");
    	return model;
    }
}
