package com.demoblaze.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.demoblaze.utils.Sewrappers1;

public class SignupPage extends Sewrappers1{
	
	@FindBy(id ="sign-username")
	public WebElement SignupName;
	
	@FindBy(id ="sign-password")
	public WebElement SignupPwd;
	
	@FindBy(xpath="//button[text()='Sign up']")
	public WebElement Submit;
	
	public void clickSignupName(String username) {
		waitForElement(SignupName,20);
		typeText(SignupName,username);
	}
	
	public void clickSignupPwd(String pwd) {
		waitForElement(SignupPwd,20);
		typeText(SignupPwd,pwd);
	}
	
	public void clickSubmit() {
		waitForElement(Submit,20);
		clickElement(Submit);
	}
	

}
