package com.ecommerce.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//span[@class='nav-line-2 ']")
	WebElement loginButton;

	@FindBy(id = "ap_email")
	WebElement emailorPhoneNo;

	@FindBy(id = "continue")
	WebElement Continue;

	@FindBy(id = "ap_password")
	WebElement password;

	@FindBy(id = "signInSubmit")
	WebElement signin;
	
	public void clickLogin() {
		loginButton.click();
	}
	 
	public void setEmailorPhoneNo(String phoneNo) {
		emailorPhoneNo.sendKeys(phoneNo);
	}

	public void clickContinue() {
		Continue.click();
	}
	
	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void clickSignin() {
		signin.click();
	}
}