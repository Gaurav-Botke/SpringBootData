package com.nt.service;

import java.util.List;
import java.util.Optional;

import com.nt.entity.Artist;

public interface IServiceArtist {
	   public String registerArtistBatch(List<Artist> list);
       public Iterable<Artist> getAllArtist();
       public Iterable<Artist> showAllArtistByIds(Iterable<Integer> ids);
       public Optional<Artist> showArtistById(int id);
       public String getArtistById(int id);
       public Artist fetchArtistById(int id);
}
