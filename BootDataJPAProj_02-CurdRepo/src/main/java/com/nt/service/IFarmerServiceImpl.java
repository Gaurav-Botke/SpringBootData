package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Farmer;
import com.nt.repository.IFarmerRepository;

@Service
public class IFarmerServiceImpl implements IFarmerService {

	@Autowired
	IFarmerRepository repo;
	@Override
	public String registerFarmer(Farmer farmer) {
		System.out.println("IFarmerServiceImpl.registerFarmer()");
		Farmer farm = repo.save(farmer);
		return farm == null?"Farmer object not saved !":"Farmer"+farm.getId()+" object saved !";
	}

}
