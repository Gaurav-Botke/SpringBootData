package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Artist;

import com.nt.service.IArtistService;

@Component
public class ArtistRunnerTest implements CommandLineRunner {
        
	@Autowired
	IArtistService artService ;
	
	@Override
	public void run(String... args) throws Exception {
		/*
		try {
			Artist art = new Artist();
			art.setId(111);
			art.setName("BOTKE");
			art.setCategory("TESTer");
			art.setFee(199990.00);
			
			String s = artService.registerOrupdateArtist(art);
			System.out.println(s);
			
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		try {
			System.out.println(artService.hikeActoreFeeByIdWithPercentage(3, 20));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
