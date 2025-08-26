package com.nt.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.BankAccount;
import com.nt.repository.IBankRepository;



@Service
public class BankAccoutMgmtServiceImpl implements IBankAccoutMgmtService {

	@Autowired
	private IBankRepository bankRepo;
	
	@Override
	public String saveAcctHolder(BankAccount acct) {
		Integer idVal = bankRepo.save(acct).getAccNo();
		return "Bank Account  info is saved "+idVal;
	}

	@Override
	public String updateAddrByAcctNo(int acct) {
		Optional<BankAccount> opt = bankRepo.findById(acct);
		if(opt.isPresent()) {
			BankAccount acct1 = opt.get();
			acct1.setAddr("NASHIK");
			
			BankAccount acct2 = bankRepo.save(acct1);
			return "Addr is updated ! "+acct2;
		}else {
			return "Record is not found !";
		}
		
	}

	@Override
	public BankAccount setNameById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
