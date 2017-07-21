package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Im_attach;
import com.example.domain.Imb_main;
import com.example.repositories.Im_attachRepository;
import com.example.repositories.Imb_mainRepository;



@Service
public class Im_attachServicelmpl implements Im_attachService{
	private Im_attachRepository im_attachrepository;

	
	@Autowired
	public void setIm_attachService(Im_attachRepository im_attachrepository) {
		this.im_attachrepository = im_attachrepository;
	}

	@Override
	public Iterable<Im_attach> findIm_attach(String id) {
		
		return im_attachrepository.findIm_attach(id);
	}

	@Override
	public Im_attach getOne(String id) {
		// TODO Auto-generated method stub
		return im_attachrepository.getOne(id);
	}


	

}
