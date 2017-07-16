package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.services.Dept2Service;



@RestController
public class Dept2Controller {

	private Dept2Service dept2Service;

	@Autowired
	public void setDept2Service(Dept2Service dept2Service) {
		this.dept2Service = dept2Service;
	}
	
	@RequestMapping(value = "/dept2", method = RequestMethod.GET)
    public ModelAndView list(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("dept2", dept2Service.listAllDept());
		modelAndView.setViewName("dept2");
		
        return modelAndView;
    }

}
