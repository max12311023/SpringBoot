package com.example.controller;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.domain.Im_attach;
import com.example.domain.Imb_main;
import com.example.services.Im_attachService;
import com.example.services.Imb_mainService;
import com.example.services.Wkf_tableService;



@RestController
public class Imb_mainController {

	private Imb_mainService imb_mainService;
	private Im_attachService im_attachService;

	@Autowired
	public void setImb_mainService(Imb_mainService imb_mainService) {
		this.imb_mainService = imb_mainService;
	}

	@Autowired
	public void setIm_attachService(Im_attachService im_attachService) {
		this.im_attachService = im_attachService;
	}

	//getAll
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView list(){
		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.addObject("imb_main", imb_mainService.listAllImb_main());
		
		modelAndView.addObject("imb_main",imb_mainService.getAll());
		modelAndView.setViewName("index");
		
		return modelAndView;
	}

	//return json
	@RequestMapping(value = "/getJSON" ,method = RequestMethod.GET)
	public @ResponseBody Imb_main getitem(@RequestParam("data") String id){
		Imb_main i = imb_mainService.getImb_mainById(id);
		return i;
	}

	//getOne
	@RequestMapping(value = "/get" ,method = RequestMethod.GET)
	public ModelAndView getOne(@RequestParam("data") String id){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("imb_one", imb_mainService.getImb_mainById(id));
		modelAndView.addObject("im_attach", im_attachService.findIm_attach(id));
//		modelAndView.addObject("name", imb_mainService.getEmp(imb_mainService.getImb_mainById(id).getFLOW_NUM()).getEMPNO());
		modelAndView.setViewName("index");

		return modelAndView;
	}

	@RequestMapping(value = "/Image/{id}", method = RequestMethod.GET)
	public ResponseEntity<byte[]> getImage(@PathVariable("id") String id) {
		Im_attach i =im_attachService.getOne(id);
		byte[] image = i.getFILE_DATA();
		switch (i.getFILE_NAME().substring(i.getFILE_NAME().lastIndexOf("."), i.getFILE_NAME().length()).toUpperCase().trim()){
		case ".JPG":
			return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(image);
		case ".PDF":
			return ResponseEntity.ok().contentType(MediaType.APPLICATION_PDF).body(image);
		}
			return ResponseEntity.ok().contentType(MediaType.parseMediaType("application/octet-stream")).body(image);
		
	}
}
