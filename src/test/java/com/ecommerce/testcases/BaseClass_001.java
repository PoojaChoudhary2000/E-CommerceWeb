package com.ecommerce.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass_001 {

	public String baseURL = "https://www.amazon.in/";
	public String username = "7067330593";
	public String password = "PoojaPooja";
	public String productName = "realme narzo 60 5G";
	public static WebDriver driver;

	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
	}

//	@AfterClass
//	public void tearDown() throws InterruptedException {
//		Thread.sleep(5000);
//		driver.quit();
//
//	}

}
