package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Farmer;
import com.nt.service.IFarmerServiceImpl;

@Component
public class CurdTestRunner implements CommandLineRunner {
 
	@Autowired
	IFarmerServiceImpl frmService;
	@Override
	public void run(String... args) throws Exception {
		Farmer farmer = new Farmer();
		farmer.setName("GAURAV");
		farmer.setScheme("PM Kisan");
		farmer.setStatus(false);
		String msg = frmService.registerFarmer(farmer);
		System.out.println(msg+" "+farmer);

	}

}
