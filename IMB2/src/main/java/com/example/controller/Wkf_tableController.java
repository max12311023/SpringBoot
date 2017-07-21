package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.services.Imb_mainService;
import com.example.services.Wkf_tableService;
@RestController
public class Wkf_tableController {
	private Wkf_tableService wkf_tableService;

	@Autowired
	public void setWkf_tableService(Wkf_tableService wkf_tableService) {
		this.wkf_tableService = wkf_tableService;
	}
	@RequestMapping(value = "/wkf_table", method = RequestMethod.GET)
    public ModelAndView listWkf_table(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("wkf_table", wkf_tableService.listAllWkf_table());
		modelAndView.setViewName("wkf_table");
		
        return modelAndView;
    }
}
