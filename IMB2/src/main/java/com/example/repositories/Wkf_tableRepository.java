package com.example.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.example.domain.Imb_main;
import com.example.domain.Wkf_table;



public interface Wkf_tableRepository extends CrudRepository<Wkf_table, Integer>{


}


