package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Wkf_table;
import com.example.repositories.Wkf_tableRepository;



@Service
public class Wkf_tableServicelmpl implements Wkf_tableService{
	private Wkf_tableRepository Wkf_tablerepository;


	@Autowired
	public void setWkf_tableRepository(Wkf_tableRepository Wkf_tablerepository) {
		this.Wkf_tablerepository = Wkf_tablerepository;
	}

	@Override
	public Iterable<Wkf_table> listAllWkf_table() {
		// TODO Auto-generated method stub
		return Wkf_tablerepository.findAll();
	}

	@Override
	public Wkf_table getWkf_tableById(Integer id) {
		// TODO Auto-generated method stub
		return Wkf_tablerepository.findOne(id);
	}

	@Override
	public Wkf_table saveWkf_table(Wkf_table Wkf_table) {
		// TODO Auto-generated method stub
		return Wkf_tablerepository.save(Wkf_table);
	}


	@Override
	public void deleteWkf_table(Integer id) {
		Wkf_tablerepository.delete(id);
		
	}

}
