package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Artist;
import com.nt.repository.IArtistRepository;

@Service
public class ArtistServiceImpl implements IArtistService {
    
	@Autowired
	private IArtistRepository artRepo;
	@Override
	public String registerOrupdateArtist(Artist artist) {
		
		//load object
		Optional<Artist> opt = artRepo.findById(artist.getId());
		if(opt.isPresent()) {               // if Record is already is present then update
			artRepo.save(artist);
			return "Object is update "+artist.getId() +" "+ artist;
		}else {                              // if not present then save with new record
			return "Artist is saved with id value :: "+artist.getId()+" "+artRepo.save(artist);
		}
		
		
	}
	
		@Override
		public String hikeActoreFeeByIdWithPercentage(int id, double percentage) {
		    // load the Artist
		    Optional<Artist> opt = artRepo.findById(id);
		    
		    if (opt.isPresent()) {
		        Artist artist = opt.get();  //  Use the actual artist from DB
		        System.out.println("Artist :: " + artist.getName() + " old fee :: " + artist.getFee());
		        
		        //  Add null check for fee
		        if (artist.getFee() == null) {
		            return "Fee for artist ID " + id + " is null. Cannot apply percentage.";
		        }

		        // Apply percentage increase correctly
		        double newFee = artist.getFee() + (artist.getFee() * percentage / 100.0);
		        artist.setFee(newFee);

		        artRepo.save(artist);
		        return "Artist :: " + artist.getName() + " new fee :: " + artist.getFee();
		        
		    } else {
		        return "Artist not found";
		    }
		

	}

}
