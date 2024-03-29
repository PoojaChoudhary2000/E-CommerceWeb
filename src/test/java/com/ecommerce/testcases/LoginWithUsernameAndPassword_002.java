package com.ecommerce.testcases;

import org.testng.annotations.Test;

import com.ecommerce.pageObjects.LoginPage;

public class LoginWithUsernameAndPassword_002 extends BaseClass_001 {

	@Test
	public void loginTest() throws Exception {

		LoginPage lp = new LoginPage(driver);

		lp.clickLogin();
		Thread.sleep(1000);
		logger.info("Login button clicked.............");

		lp.setEmailorPhoneNo(username);
		Thread.sleep(1000);
		logger.info("Username Entered.............");

		lp.clickContinue();
		Thread.sleep(1000);
		logger.info("Continue Button Clicked.............");

		lp.setPassword(password);
		Thread.sleep(1000);
		logger.info("Password entered.............");

		lp.clickSignin();
		Thread.sleep(1000);
		logger.info("SignIn button clicked.............");

	}

}
