package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Dept2;
import com.example.repositories.Dept2Repository;



@Service
public class Dept2Servicelmpl implements Dept2Service{
	private Dept2Repository detp2repository;


	@Autowired
	public void setDept2Repository(Dept2Repository detp2repository) {
		this.detp2repository = detp2repository;
	}

	@Override
	public Iterable<Dept2> listAllDept() {
		// TODO Auto-generated method stub
		return detp2repository.findAll();
	}

	@Override
	public Dept2 getDeptById(Integer id) {
		// TODO Auto-generated method stub
		return detp2repository.findOne(id);
	}

	@Override
	public Dept2 saveDept(Dept2 dpet2) {
		// TODO Auto-generated method stub
		return detp2repository.save(dpet2);
	}

	@Override
	public void deleteDept(Integer id) {
		detp2repository.delete(id);

	}

}
