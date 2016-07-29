package com.jenkins.JenkinsBankAccount;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

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
	
	@Test
	public void helloWorld(){
		System.out.println("Hello World!!!!");
	}
	
	@Test
	public void phantomJSDriverTest(){
		//File src = new File("/Users/gregorydombchik/Downloads/phantomjs-2.1.1-macosx/bin/phantomjs");
		File src = new File("/usr/local/share/phantomjs");
	    System.setProperty("phantomjs.binary.path", src.getAbsolutePath());
	    WebDriver webdriver = new PhantomJSDriver();
	    webdriver.navigate().to("http://www.thetestroom.com/webapp/");
	    Assert.assertTrue(webdriver.getTitle().equals("Zoo Adoption | Home"));
	}
}
