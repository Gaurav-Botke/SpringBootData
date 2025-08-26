package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.BankAccount;
import com.nt.service.IBankAccoutMgmtService;

@Component
public class VersionAndTimeStampRunnerTest implements CommandLineRunner {
         
	@Autowired
	private IBankAccoutMgmtService bankService;
		
	
	@Override
	public void run(String... args) throws Exception {
		/*BankAccount acc = new BankAccount("GAURAV", "JALNA");
		String msg = bankService.saveAcctHolder(acc);
		System.out.println(msg);*/
		
		
		try {
			
			String msg = bankService.updateAddrByAcctNo(1);
			System.out.println(msg);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
