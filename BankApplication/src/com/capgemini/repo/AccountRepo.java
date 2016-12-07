package com.capgemini.repo;

import com.capgemini.model.Account;

public interface AccountRepo {
	
	boolean save(Account account);
	
	Account searchAccount(int accountNumber);
	

}
