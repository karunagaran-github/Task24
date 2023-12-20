package com.demoblaze.utils;

import org.openqa.selenium.support.PageFactory;

import com.demoblaze.pages.HomePage;
import com.demoblaze.pages.LoginPage;
import com.demoblaze.pages.SignupPage;

public class DBwrappers extends Sewrappers1{
	
	public void signUp(String user, String pwd) {
		
		HomePage homePage = PageFactory.initElements( driver,HomePage.class);
		SignupPage signup = PageFactory.initElements( driver,SignupPage.class);
		
		homePage.clickSignup();
		signup.clickSignupName(user);
		signup.clickSignupPwd(pwd);
		signup.clickSubmit();
					
	}
	
public void logIn(String luser, String lpwd) {
		
		HomePage homePage = PageFactory.initElements( driver,HomePage.class);
		LoginPage login = PageFactory.initElements( driver,LoginPage.class);
		
		homePage.clickLogin();
		login.clickLoginuser(luser);
		login.clickLoginpwd(lpwd);
		login.clickLogin();
					
	}
	
	

}
