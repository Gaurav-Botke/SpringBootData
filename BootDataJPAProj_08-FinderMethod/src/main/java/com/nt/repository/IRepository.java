package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Artist;

public interface IRepository extends JpaRepository<Artist, Integer> {

	public List<Artist> findByNameIs(String name);
	public Iterable<Artist> getByCategoryIgnoreCase(String category);
	public List<Artist> readByCategoryEquals(String category);
	public List<Artist> findByCategory(String category);
	
	
	public List<Artist> findByFeeGreaterThan(Double fee);
	public List<Artist> findByNameLike(String chars);
	
	public List<Artist> findByCategoryInOrderByCategoryAsc(List<String> category);
	
}
