package com.ecommerce.testcases;

import org.testng.annotations.Test;

import com.ecommerce.pageObjects.LoginPage;

public class LoginWithUsernameAndPassword_002 extends BaseClass_001 {

	@Test
	public void loginTest() throws Exception {

		driver.get(baseURL);

		LoginPage lp = new LoginPage(driver);

		lp.clickLogin();
		Thread.sleep(1000);

		lp.setEmailorPhoneNo(username);
		Thread.sleep(1000);

		lp.clickContinue();
		Thread.sleep(1000);

		lp.setPassword(password);
		Thread.sleep(1000);
		
		lp.clickSignin();
		Thread.sleep(1000);

	}

}
