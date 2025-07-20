package com.nt.repository;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Farmer;

public interface IFarmerRepository extends CrudRepository<Farmer, Integer> {

}
