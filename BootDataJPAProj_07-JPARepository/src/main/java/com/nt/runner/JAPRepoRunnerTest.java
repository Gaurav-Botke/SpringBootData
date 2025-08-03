package com.nt.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.nt.BootDataJpaProj07JpaRepositoryApplication;
import com.nt.entity.Artist;
import com.nt.service.ArtistServiceImpl;

@Component
public class JAPRepoRunnerTest implements CommandLineRunner {

    private final BootDataJpaProj07JpaRepositoryApplication bootDataJpaProj07JpaRepositoryApplication;
 
	@Autowired
	ArtistServiceImpl artService;

    JAPRepoRunnerTest(BootDataJpaProj07JpaRepositoryApplication bootDataJpaProj07JpaRepositoryApplication) {
        this.bootDataJpaProj07JpaRepositoryApplication = bootDataJpaProj07JpaRepositoryApplication;
    }
	@Override
	public void run(String... args) throws Exception {
		/*
		try {
		String msg = 	artService.deleteActorByIdsInBatch(Arrays.asList(202,203,204));
		System.out.println(msg);
		} catch (Exception e) {
		    e.printStackTrace();
		}
		*/
		
		/*try {
			//create a Entity object
			Artist artist = new Artist();
			//set property to artist
			//artist.setId(101);
			artist.setFee(90000.00);
			artist.setCategory("HERO");
			List<Artist> list = artService.findAllArtistByExample(artist, true,"fee","category");
			list.forEach(System.out::println);
		} catch (Exception e) {
			  e.printStackTrace();
		}*/
		
		/*try {
			System.out.println(artService.fetchArtistById(152));
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		try {
			Artist artist = artService.fetchArtistByRefId(152);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
