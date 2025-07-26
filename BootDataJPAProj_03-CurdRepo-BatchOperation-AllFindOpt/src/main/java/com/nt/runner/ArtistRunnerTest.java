package com.nt.runner;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Artist;
import com.nt.service.IServiceArtist;



@Component
public class ArtistRunnerTest implements CommandLineRunner {
 
	@Autowired
	IServiceArtist serArtist;
	@Override
	public void run(String... args) throws Exception {
		
		// SAVED RECORDS TO THE DB
		/*try {
			Artist artist1 = new Artist("KARINA", "HERO", 90000.00);
			Artist artist2 = new Artist("KIARA","SIDE-HERO",30000.00);
			Artist artist3 = new Artist("ALIA","HELPER",600.00);
			
			List<Artist> list = List.of(artist1,artist2,artist3);
			String msg =  serArtist.registerArtistBatch(list);
			System.out.println(msg);
			
		} catch (Exception e) {
			  e.printStackTrace();
		}*/
		
		
		//GET ALL THE RECIRDS FROM THE DB TECH 1
		
		/*try {
			Iterable<Artist> list = serArtist.getAllArtist();
			list.forEach(art->
			System.out.println(art)
					);
		} catch (Exception e) {
			 e.printStackTrace();
		}
		*/
		
		//GET ALL THE RECIRDS FROM THE DB TECH 2
		
		/*try {
			//by using forEach method
			Iterable<Artist> list1 = serArtist.getAllArtist();
			list1.forEach(art1->{
			System.out.println(art1);
			});
			System.out.println("-------------------by using forEach method more Enhanced----------------------");
			//by using forEach method more Enhanced
			list1.forEach(art2 -> System.out.println(art2));
			
			System.out.println("-------------------by using static method reference out is static ref var of System class----------------------");
			//by using static method reference out is static ref var of System class
			list1.forEach(System.out::print);
			
			System.out.println();
			System.out.println("-------------------Enhanced for loop of java 5v feature----------------------");
			// Enhanced for loop of java 5v feature
			for(Artist art:list1) {
				System.out.println(art);
			}
			
		} catch (Exception e) {
			 e.printStackTrace();
		}*/
				
		
		/*
		 * try {
			serArtist.showAllArtistByIds(List.of(1,2,3,52,53,54)).forEach(System.out::print);
			} catch (Exception e) {
				e.printStackTrace();
			}
			*/
		/*		
			try {
				serArtist.showArtistById(101);
			} catch (Exception e) {
				e.printStackTrace();
			}*/
		
		
		/*	try {
			String s =	serArtist.getArtistById(101);
			System.out.println(s);
			} catch (Exception e) {
				e.printStackTrace();
			}*/
             
		try {
			Artist artist = serArtist.fetchArtistById(101);
			System.out.println(artist);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
