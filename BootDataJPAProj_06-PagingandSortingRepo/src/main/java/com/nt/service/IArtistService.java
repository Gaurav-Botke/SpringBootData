package com.nt.service;



import org.springframework.data.domain.Page;

import com.nt.entity.Artist;

public interface IArtistService {
           public Iterable<Artist> showAllArtistBySorting(boolean asc, String ...props);
           public Page<Artist> showAllArtistInfoByPage(int pageNo,int pageSize, boolean asc,String props);
           public void showDataThroughPagination(int pageSize);
}
