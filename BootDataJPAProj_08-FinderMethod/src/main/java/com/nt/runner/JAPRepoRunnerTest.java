package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.nt.repository.IRepository;


@Component
public class JAPRepoRunnerTest implements CommandLineRunner {

	@Autowired
	private IRepository artRepo;
	
	@Override
	public void run(String... args) throws Exception {
		/*artRepo.findByNameIs("SALLU").forEach(System.out::println); //single Record
		System.out.println("------------------------");
		artRepo.getByCategoryIgnoreCase("hero").forEach(System.out::println);
		System.out.println("------------------------");
		artRepo.readByCategoryEquals("HERO").forEach(System.out::println);
		System.out.println("------------------------");
		artRepo.findByCategory("SIDE-HERO").forEach(System.out::println);
		
		
		System.out.println("----------------------");
		artRepo.findByFeeGreaterThan(30000.00).forEach(System.out::println);
		System.out.println("-----------------------");
		artRepo.findByNameLike("S%").forEach(System.out::println);    // Start with 'S'
		System.out.println("-----------------------");
		artRepo.findByNameLike("%Y%").forEach(System.out::println);     //In middle 'Y'
		
		System.out.println("------------------------");
		artRepo.findByNameLike("%U").forEach(System.out::println);      // End with U
		*/
		System.out.println("------------------------");
		artRepo.findByCategoryInOrderByCategoryAsc(List.of("HERO","HELPER")).forEach(System.out::println); 
		
	}//run
}//class
