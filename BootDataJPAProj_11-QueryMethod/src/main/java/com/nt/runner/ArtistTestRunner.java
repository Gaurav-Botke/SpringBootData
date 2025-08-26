package com.nt.runner;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.nt.BootSchedulingProj11QueryMethodApplication;
import com.nt.entity.Artist;
import com.nt.repository.IArtistRepository;

@Component
public class ArtistTestRunner implements CommandLineRunner {

	private final BootSchedulingProj11QueryMethodApplication bootSchedulingProj11QueryMethodApplication;

	@Autowired
	IArtistRepository artRepo;

	ArtistTestRunner(BootSchedulingProj11QueryMethodApplication bootSchedulingProj11QueryMethodApplication) {
		this.bootSchedulingProj11QueryMethodApplication = bootSchedulingProj11QueryMethodApplication;
	}

	@Override
	public void run(String... args) throws Exception {

		// artRepo.getAllArtist().forEach(System.out::println);

		// artRepo.showArtistByFeeRange(3000.00,90000.00).forEach(System.out::println);

		/*	try {
				artRepo.fetchArtistBySalRange(30000, 90000).forEach(System.out::println);;
			} catch (Exception e) {
				e.printStackTrace();
			}*/

		/*try {
			artRepo.loadArtistBySalRange(30000, 90000).forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		/*
		try {
			artRepo.showArtistByCategory("HERO", "SIDE-HERO").forEach(System.out::println);
			System.out.println("-------------------------------------------");
			
			artRepo.showArtistDataByCategory("HERO", "SIDE-HERO").forEach(row ->{
				for(Object val:row) {
				  System.out.print(val+" ");
				}
				System.out.println();
			});
			System.out.println();
			System.out.println("------------------------------------------");
			artRepo.showArtistByNameChar("S%").forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/

		/*	
		 * try {
				Optional<Artist> art1 = artRepo.showArtistByName("SALLU");
				if (art1.isPresent()) {
					System.out.println(art1.get());
					System.out.println("------------------------------------------");
				} else {
					new IllegalStateException();
				}
		
			} catch (Exception e) {
				e.printStackTrace();
			}
		
			try {
				Object obj = artRepo.showArtistInfoById("SALLU");
				Object data[] = (Object[])obj;
				for(Object o:data) {
					System.out.print(o);
				}
				System.out.println();
				System.out.println("------------------------------------------");
				//--------------OR-----------
				System.out.println("Data is  :: "+Arrays.toString(data));
				System.out.println("------------------------------------------");
			} catch (Exception e) {
				   e.printStackTrace();
			}
			
			try {
				String name = artRepo.showArtistFee("SALLU");
				System.out.println(name);
				System.out.println("------------------------------------------");
			} catch (Exception e) {
				e.printStackTrace();
			}
			*/
		
		//int count = artRepo.fetchNoOfCountArtist();
		//System.out.println("No of Artist :: "+count);
		
		/*Object obj = artRepo.showAggregateDataOfArtist();
		Object data[] = (Object[])obj;
		for(Object val : data) {
			System.out.print(val+" ");
		}
		System.out.println("----------------------");
		//----------------OR------------------
		System.out.println("Count of Artist :: "+data[0]);
		System.out.println(" Max fee of Artist :: "+data[1]);
		System.out.println("min fee of Artist :: "+data[2]);
		System.out.println("Avg Fee of Artist :: "+data[3]);
		System.out.println("Sum fee of Artist :: "+data[4]);
		System.out.println("----------------------------------");
		System.out.println(Arrays.toString(data));
		System.out.println();*/
		
		/*try {
			int count  = artRepo.updateArtistFee(10, "HERO");
			System.out.println("No of artist affected :: "+count);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		/*try {
			int count  = artRepo.deleteArtist(10000);
			System.out.println("No artist are Deleted ! "+count);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		String date = artRepo.printDate();
		System.out.println("Todays date :: "+date);
	}

}
