package com.nt.service;



public interface IArtistService {
	       public String removeRecordById(int id); 
           public String removeAllArtist();
           public String removeRecordById(Iterable<Integer> ids);
}
