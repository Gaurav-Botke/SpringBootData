package com.nt.service;

import com.nt.entity.BankAccount;

public interface IBankAccoutMgmtService {
          public String saveAcctHolder(BankAccount acct);
          
          public String updateAddrByAcctNo(int acct);
          
          public BankAccount setNameById(int id);
}
