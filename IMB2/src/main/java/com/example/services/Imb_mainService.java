package com.example.services;

import com.example.domain.Imb_main;

public interface Imb_mainService {
	Iterable<Imb_main> listAllImb_main();

	Imb_main getImb_mainById(String id);

	Imb_main saveImb_main(Imb_main imb_main);

    void deleteImb_main(String id);
}
