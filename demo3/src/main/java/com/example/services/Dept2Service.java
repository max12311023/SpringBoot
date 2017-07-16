package com.example.services;

import com.example.domain.Dept2;



public interface Dept2Service {
	Iterable<Dept2> listAllDept();

	Dept2 getDeptById(Integer id);

	Dept2 saveDept(Dept2 dpet2);

    void deleteDept(Integer id);
}
