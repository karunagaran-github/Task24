package com.demoblaze.test;

import org.testng.annotations.Test;

import com.demoblaze.utils.BBreports;
import com.demoblaze.utils.DBwrappers;
import com.demoblaze.utils.Sewrappers1;

public class Testcase2 extends Sewrappers1 {
	BBreports report1 = new BBreports();
	DBwrappers DB= new DBwrappers();
	
	@Test
	public void browserTest() throws InterruptedException{
		
			report1.setTCDesc("Validating demo blaze link and signup");
			launchBrowser("https://www.demoblaze.com/");
			DB.logIn("karunagaranelango@gmail.com","Ashwin@99");
			
			System.out.println("Success");
			
	}
}

