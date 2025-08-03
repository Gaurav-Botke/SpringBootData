package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.entity.Artist;
import com.nt.repository.IRepository;

@Service
public class ArtistServiceImpl implements IArtistService {

	@Autowired
	IRepository artRepo;
	
	
	@Override
	public String deleteActorByIdsInBatch(List<Integer> ids) {
		//load the entities
		List<Artist> list = artRepo.findAllById(ids);
		//delete those ids
		artRepo.deleteAllByIdInBatch(ids);
		return list.size()+" records are deleted";
		
	}
	@Override
	public List<Artist> findAllArtistByExample(Artist artist, boolean order, String... props) {
		//sort the record
		Sort sort = Sort.by(order?Direction.ASC:Direction.DESC, props);
		// create a Example object
		Example<Artist> example = Example.of(artist);
		//calling a method
		List<Artist> list = artRepo.findAll(example, sort);
		//return the collection
		return list;
	}
	
	@Override
	public Optional<Artist> fetchArtistById(int id) {
		Optional<Artist> opt = artRepo.findById(id);
		if(opt.isPresent()) {
			Artist art = opt.get();
			return Optional.of(art);		
		}else {
			return Optional.empty();
		}
	
	
	}
	@Override
	public Artist fetchArtistByRefId(int id) {
		Artist artist = artRepo.getReferenceById(id);
		System.out.println(artist.getId());
		System.out.println(artist.getName());
		return artist;
		
	}
}
