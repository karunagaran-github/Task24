package com.demoblaze.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.demoblaze.utils.Sewrappers1;

public class LoginPage extends Sewrappers1{
	
	@FindBy(id="loginusername")
	public WebElement Loginuser;
	
	@FindBy(id="loginpassword")
	public WebElement Loginpwd;
	
	@FindBy(xpath="//button[text()='Log in']")
	public WebElement Login;
	
	public void clickLoginuser(String Luser) {
		waitForElement(Loginuser,20);
		typeText(Loginuser,Luser);	
	}
	
	public void clickLoginpwd(String Lpwd) {
		waitForElement(Loginpwd,20);
		typeText(Loginpwd,Lpwd);	
	}
	
	public void clickLogin() {
		waitForElement(Login,20);
		clickElement(Login);	
	}

}
