package com.capgemini.service;

import java.util.StringJoiner;

import com.capgemini.exceptions.InsufficientBalanceException;
import com.capgemini.exceptions.InsufficientInitialBalanceException;
import com.capgemini.exceptions.InvalidAccountNumberException;
import com.capgemini.model.Account;

public interface AccountService {
	
	Account createAccount(int accountNumber,int amount)throws InsufficientInitialBalanceException;
	int depositAmount(int accountNumber,int amount)throws InvalidAccountNumberException;
	int withdrawAmount(int accountNumber,int amount)throws InvalidAccountNumberException,InsufficientBalanceException;
	int showBalance(int accountNumber)throws InvalidAccountNumberException;
	StringJoiner fundTransfer(int fromAccount,int toAccount,int amount)throws InvalidAccountNumberException,InsufficientBalanceException;
	
	
	
	

}
