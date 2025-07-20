package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Artist;
import com.nt.repository.IArtistRepository;

@Service
public class IArtistMgmtServiceImpl implements IArtistService {
    @Autowired
	private IArtistRepository artistRepo;
	@Override
	public String registerArtist(Artist artist) {
	Artist art = artistRepo.save(artist);
		return (art != null)?"Artist "+art.getId() +"object is saved !":"Artist object is not saved !";
	}

}
