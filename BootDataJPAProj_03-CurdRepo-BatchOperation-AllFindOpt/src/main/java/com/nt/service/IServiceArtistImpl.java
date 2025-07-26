package com.nt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Artist;
import com.nt.repository.ICurdRepository;

@Service
public class IServiceArtistImpl implements IServiceArtist {

	@Autowired
	ICurdRepository artRepo;
	
	//SAVED LIST OBJECT BY TECH 1
	/*
	@Override
	public String registerArtistBatch(List<Artist> list) {
	Iterable<Artist> savedIds = artRepo.saveAll(list);
	
		List<Integer> ids = StreamSupport.stream(savedIds.spliterator(),false).map(Artist :: getId).collect(Collectors.toList()); 
	return ids.size()+"saved in Db having id ::"+ids;
	}
	*/
	
	//SAVED LIST objects BY TECH 2
	/*
	 @Override
	public String registerArtistBatch(List<Artist> list) {
		List<Artist> savedList = (List<Artist>) artRepo.saveAll(list);
		List<Integer> ids =  savedList.stream().map(art -> art.getId()).collect(Collectors.toList());
		
		return ids.size()+" no of object is saved id "+ids;
	}
	*/
	
	//SAVED LIST OBJECT BY TECH 3
	@Override
	public String registerArtistBatch(List<Artist> list) {
		Iterable<Artist> savedIds = artRepo.saveAll(list);
		
		List<Integer> listIds = new ArrayList();
		savedIds.forEach(artist ->{
			listIds.add(artist.getId());
		});
		return listIds.size() +" saved object ids are :: "+listIds.toString();
	}
	
	
	//GET ALL RECORDs OF DB TECH 1
	/*
	@Override
	public List<Artist> getAllArtist() {
		List<Artist> list = (List<Artist>) artRepo.findAll();
		return list;
	}
	*/
	
	
	//GET ALL RECORDs OF DB TECH 2
	
	@Override
	public Iterable<Artist> getAllArtist() {
		 
		return artRepo.findAll();
	}


	@Override
	public Iterable<Artist> showAllArtistByIds(Iterable<Integer> ids) {
		
		return artRepo.findAllById(ids);
	}
	
	@Override
	public Optional<Artist> showArtistById(int id) {
		Optional<Artist> opt = artRepo.findById(id);
		Artist artist = opt.get();
		if(artist != null) {
			System.out.println("Artist info :: "+artist);
		}
		
		return Optional.empty();
	}
	
	@Override
	public String getArtistById(int id) {
	Artist artist = artRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid id"));
	 return "Artist found "+artist;
	}
	
	
	@Override
	public Artist fetchArtistById(int id) {
		Optional<Artist> opt = artRepo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else {
			throw new IllegalArgumentException("Illegal id ");
		}
		
	}
	

	

	
	
	

}
