package com.example.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TestController {

	@RequestMapping("/")
	public String index(ModelMap model){
		
		return "Hello World";
	}
	//http://localhost:8081/index/123
	@RequestMapping(value = "/index/{itemid}", method = RequestMethod.GET)
	 public String show(@PathVariable("itemid") String itemid){	
	        return "Hello "+itemid;
	}
	

}
