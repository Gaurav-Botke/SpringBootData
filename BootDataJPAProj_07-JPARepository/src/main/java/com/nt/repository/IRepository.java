package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Artist;

public interface IRepository extends JpaRepository<Artist, Integer> {

}
