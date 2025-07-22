package com.nt.service;

import com.nt.entity.Artist;

public interface IArtistService {
           
	public String registerArtist(Artist artist);
	public boolean checkArtistAvailability(int id);
	public long totalCountOfArtist();
}
