package com.example.services;

import com.example.domain.Wkf_table;

public interface Wkf_tableService {
	Iterable<Wkf_table> listAllWkf_table();

	Wkf_table getWkf_tableById(Integer id);

	Wkf_table saveWkf_table(Wkf_table Wkf_table);

    void deleteWkf_table(Integer id);
}
