package com.jenkins.JenkinsBankAccount;

import org.junit.Test;
import org.junit.Assert;

public class TestBankAccount {

	@Test
	public void simpleDebit(){
		BankAccount bankAccount = new BankAccount(10.0);
		double amount = bankAccount.debit(5.0);
		Assert.assertTrue(amount==5.0);
	}
	
	@Test
	public void overDraftReturnsCurrentBalance(){
		BankAccount bankAccount = new BankAccount(10.0);
		double amount = bankAccount.debit(11.0);
		Assert.assertTrue(amount==10.0);
	}
	
}
