package com.nt.runner;

import java.util.Arrays;

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
		
		/*try {
			System.out.println(artService.removeAllArtist());
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		/*try {
			System.out.println(artService.removeRecordById(Arrays.asList(101,102,564)));
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		try {
			System.out.println(artService.removeRecordById(111));
		} catch (Exception e) {
			   e.printStackTrace();
		}
	}

}
