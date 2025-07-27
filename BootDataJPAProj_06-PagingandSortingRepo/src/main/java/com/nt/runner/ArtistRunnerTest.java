package com.nt.runner;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.nt.entity.Artist;
import com.nt.service.IArtistService;

@Component
public class ArtistRunnerTest implements CommandLineRunner {
 
	@Autowired
	IArtistService artService;

	@Override
	public void run(String... args) throws Exception {
		/*
		try {
			artService.showAllArtistBySorting(true, "id").forEach(System.out::println);
			System.out.println("---------------------------------------------");
			artService.showAllArtistBySorting(false, "name","category").forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		/*try {
			Page<Artist> page = artService.showAllArtistInfoByPage(2, 3, false, "id");
			System.out.println("Page number :: "+(page.getNumber()));
			System.out.println("Page count :: "+(page.getTotalPages()));
			System.out.println("is first Page :: "+(page.isFirst()));
			System.out.println("is last page :: "+(page.isLast()));
			System.out.println("page size :: "+(page.getSize()));
			System.out.println("page element count :: "+(page.getNumberOfElements()));
			
			if(!page.isEmpty()) {
				List<Artist> list = page.getContent();
				list.forEach(System.out::println);
			}else {
				System.out.println("page not found");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		try {
			artService.showDataThroughPagination(5);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
       
}
