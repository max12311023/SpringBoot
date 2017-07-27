package com.example.services;

import java.util.List;

import com.example.domain.Imb_main;

public interface Imb_mainService {
	Iterable<Imb_main> listAllImb_main();

	Imb_main getImb_mainById(String id);
	
	
	List<Imb_main>  getAll();

	Imb_main saveImb_main(Imb_main imb_main);
	
	Imb_main getEmp (String id);
	
    void deleteImb_main(String id);
}
