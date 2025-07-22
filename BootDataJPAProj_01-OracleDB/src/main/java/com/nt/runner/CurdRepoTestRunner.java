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
	
	           // Insert a new record	
	/*   
	Artist artist = new Artist("NANA", "Side Hero", 10000.00);
		try {
			String msg = artImpl.registerArtist(artist);
			System.out.println(msg+" "+artist);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	*/
		
		 
		       //Check the record is there or not
	/*
		try {
			System.out.println("Artist is available ?"+artImpl.checkArtistAvailability(109));
		} catch (Exception e) {
		    e.printStackTrace();
		} 
	*/
		
	       //Check the total record count
			
			try {
				System.out.println(" Total number of Artist is available ::  "+artImpl.totalCountOfArtist());
			} catch (Exception e) {
			    e.printStackTrace();
			} 

	}

}
