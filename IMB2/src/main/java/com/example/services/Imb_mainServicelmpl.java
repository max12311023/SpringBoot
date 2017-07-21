package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Imb_main;
import com.example.repositories.Imb_mainRepository;



@Service
public class Imb_mainServicelmpl implements Imb_mainService{
	private Imb_mainRepository imb_mainrepository;


	@Autowired
	public void setImb_mainRepository(Imb_mainRepository imb_mainrepository) {
		this.imb_mainrepository = imb_mainrepository;
	}

	@Override
	public Iterable<Imb_main> listAllImb_main() {
		// TODO Auto-generated method stub
		return imb_mainrepository.findImb_mainAll();
	}

	@Override
	public Imb_main getImb_mainById(String id) {
		
		return imb_mainrepository.findOne(id);
	}

	@Override
	public Imb_main saveImb_main(Imb_main imb_main) {
		// TODO Auto-generated method stub
		return imb_mainrepository.save(imb_main);
	}


	@Override
	public void deleteImb_main(String id) {
		Imb_main i =new Imb_main();
		i.setFLOW_CODE(id);
		imb_mainrepository.delete(i);
		
	}

}
