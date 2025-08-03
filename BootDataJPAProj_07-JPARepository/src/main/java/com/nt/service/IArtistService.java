package com.nt.service;

import java.util.List;
import java.util.Optional;

import com.nt.entity.Artist;

public interface IArtistService {
       
	public String deleteActorByIdsInBatch(List<Integer> ids);
	public List<Artist> findAllArtistByExample(Artist artist, boolean order, String ...props);
	
	public Optional<Artist> fetchArtistById(int id);
	public Artist fetchArtistByRefId(int id); 
}
