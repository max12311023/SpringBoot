package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.domain.Imb_main;



public interface Imb_mainRepository extends JpaRepository<Imb_main, Integer>{

	@Query("from Imb_main where  mark ='3' AND status='Z' AND (((start_show_time > sysdate-7) AND (end_date_time >= sysdate))  OR top is not null)  order by req_date desc")
	public Iterable<Imb_main> findImb_mainAll();
    
	@Query(" from Imb_main where  mark ='3' AND status='Z' AND (((start_show_time > sysdate-7) AND (end_date_time >= sysdate) and flow_num=:id) )  order by req_date desc")
	public Imb_main findOne(@Param("id") String id);
}


