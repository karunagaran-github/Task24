package com.demoblaze.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.demoblaze.utils.Sewrappers1;

public class HomePage extends Sewrappers1{
	
	@FindBy(partialLinkText ="Sign up")
	public WebElement Signup;
	
	@FindBy(id ="login2")
	public WebElement Login;
	
	public void clickSignup() {
		waitForElement(Signup,20);
		clickElement(Signup);
	}
	
	public void clickLogin() {
		waitForElement(Login,20);
		clickElement(Login);
	}
	

}
