package com.nt.service;

import com.nt.entity.Artist;

public interface IArtistService {
           public String registerOrupdateArtist(Artist artist);
           public String hikeActoreFeeByIdWithPercentage(int id, double percentage);
}
