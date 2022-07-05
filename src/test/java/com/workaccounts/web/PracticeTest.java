package com.workaccounts.web;

import org.testng.annotations.Test;

import com.workaccounts.base.WorkAccountsBase;
import com.workaccounts.webpages.Practice;


public class PracticeTest extends WorkAccountsBase {
	Practice ptest = new Practice();
	
	@Test
	public void Test1() {
		ptest.openSite();
	}

}
