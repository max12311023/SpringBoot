package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.domain.Im_attach;
import com.example.domain.Imb_main;




public interface Im_attachRepository extends JpaRepository<Im_attach, Integer>{

	@Query("from Im_attach where flow_num=:id")
	public Iterable<Im_attach> findIm_attach(@Param("id") String id);
	
	
	@Query(" from Im_attach where file_id=:id")
	public Im_attach getOne(@Param("id") String id);
}


