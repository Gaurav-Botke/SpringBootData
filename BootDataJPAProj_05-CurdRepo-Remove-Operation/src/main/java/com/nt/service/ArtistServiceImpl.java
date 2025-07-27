package com.nt.service;

import java.util.Optional;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Artist;
import com.nt.repository.IArtistRepository;

@Service
public class ArtistServiceImpl implements IArtistService {
    
	@Autowired
	private IArtistRepository artRepo;
          
	@Override
	public String removeAllArtist() {
		long count = artRepo.count();
		if(count>0) {
			artRepo.deleteAll();
			return count+" records are deleted";
	    }else {
	    	return "No record is found to delete";
	    }
	}

	@Override
	public String removeRecordById(Iterable<Integer> ids) {
		//load the objets by ids
		Iterable<Artist> list = artRepo.findAllById(ids);
		long count = StreamSupport.stream(list.spliterator(), false).count();
		
		//delete object by ids
			artRepo.deleteAllById(ids);
		return count+" are Artist are Deleted !";
	}

	@Override
	public String removeRecordById(int id) {
		//get id 
		Optional<Artist> opt = artRepo.findById(id);
		if(opt.isPresent()) {
			artRepo.deleteById(id);
			return id+" this artist is deleted !";
		}else {
		  return id+" id is not found !";
		}
		
	}

	

}
