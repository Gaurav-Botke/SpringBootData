package com.nt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.nt.entity.Artist;

public interface IArtistRepository extends CrudRepository<Artist, Integer> , PagingAndSortingRepository<Artist, Integer> {

}
