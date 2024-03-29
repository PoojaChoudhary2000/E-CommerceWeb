package com.ecommerce.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.ecommerce.testcases.BaseClass_001;

public class ProductPage extends BaseClass_001 {

	public void searchProduct(String product) throws Exception {
		WebElement productSearch = driver.findElement(By.id("twotabsearchtextbox"));
		productSearch.sendKeys(productName);
		productSearch.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

	}

	public void clickProduct() throws Exception {

		WebElement realme = driver.findElement(By.xpath("//img[@class='_bGlmZ_img_1R5u3']"));
		realme.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		Thread.sleep(1000);

		js.executeScript("window.scrollBy(0,500)");

		Thread.sleep(1000);

	}

	public void addToCart() throws InterruptedException {
		WebElement cart = driver.findElement(By.xpath(
				"(//button[@class='Button__button__b_aG7 Button__addToCart__uNhnX Button__rio__MZMEK ProductShowcaseActions__action-button__e1NFl ProductShowcaseActions__action__o0KFb Button__disableInternalPointerEvents__lSs9R'])[1]"));

		cart.click();
		Thread.sleep(3000);

	}

	public void backToHome() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0, 1000)");

		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, -1500)");
		Thread.sleep(2000);

		WebElement logo = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		Thread.sleep(3000);
		logo.click();

	}

	public void productDisplayes() {

		WebElement cart = driver.findElement(By.xpath("//span[@id='nav-cart-count']"));
		cart.click();

		WebElement element = driver.findElement(By.xpath("//span[@class='a-truncate-cut']"));
		if (element.isDisplayed()) {
			System.out.println("Product is displayed.");
		} else {
			System.out.println("Product is not displayed.");
		}

	}

	public void sameProductAdded() {

		WebElement cart = driver.findElement(By.xpath("//span[@id='nav-cart-count']"));
		cart.click();

		WebElement cartProductElement = driver.findElement(By.xpath("//span[@class='a-truncate-cut']"));
		String cartProductName = cartProductElement.findElement(By.xpath("//span[@class='a-truncate-cut']")).getText();

		String expectedProductName = "realme narzo 60 5G (Mars Orange,8GB+128GB) 90Hz Super AMOLED…";

		Assert.assertEquals(cartProductName, expectedProductName,
				"Product in them cart does not match the expected product");

	}

}
