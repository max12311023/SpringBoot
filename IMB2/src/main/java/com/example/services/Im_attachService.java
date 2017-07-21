package com.example.services;

import com.example.domain.Im_attach;
import com.example.domain.Imb_main;


public interface Im_attachService {
	Iterable<Im_attach> findIm_attach(String id);
	
	Im_attach getOne(String id);
}
