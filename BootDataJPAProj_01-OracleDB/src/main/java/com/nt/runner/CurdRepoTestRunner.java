package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Artist;

import com.nt.service.IArtistMgmtServiceImpl;

@Component
public class CurdRepoTestRunner implements CommandLineRunner {
     
	@Autowired
	IArtistMgmtServiceImpl artImpl;
	@Override
	public void run(String... args) throws Exception {
		Artist artist = new Artist("NANA", "Side Hero", 10000.00);
		String msg = artImpl.registerArtist(artist);
		System.out.println(msg+" "+artist);
	

	}

}
