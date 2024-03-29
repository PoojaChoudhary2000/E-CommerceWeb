package com.ecommerce.testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.ecommerce.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass_001 {

  ReadConfig readconfig= new ReadConfig();

	public String baseURL = readconfig.getApplicationUrl();
	public String username = readconfig.getUsername();
	public String password = readconfig.getPassword();
	public String productName = readconfig.getProductname();
	public static Logger logger;

	public static WebDriver driver;

	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(baseURL);
//		logger.info("Url is opend.............");

		logger = Logger.getLogger("ecommerce");
		PropertyConfigurator.configure("log4j.properties");
	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
		logger.info("Browser Closed.............");

	}

}
