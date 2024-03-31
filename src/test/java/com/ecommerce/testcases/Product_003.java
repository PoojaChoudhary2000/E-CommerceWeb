package com.ecommerce.testcases;

import org.testng.annotations.Test;

import com.ecommerce.pageObjects.ProductPage;

public class Product_003 extends BaseClass_001 {

	ProductPage pp = new ProductPage();

	@Test(priority = 1)
	public void productSearch() throws Exception {

		pp.searchProduct(productName);
		logger.info("Product has been searched.............");

	}

	@Test(priority = 2)
	public void productClick() throws Exception {

		pp.clickProduct();
		logger.info("Product has been clicked.............");

	}

	@Test(priority = 3)
	public void productAddToCart() throws Exception {

		pp.addToCart();
		logger.info("Have added the product to the cart.............");

	}
	@Test(priority = 4)
	public void homePage() throws InterruptedException {
		pp.backToHome();
		logger.info("Returned to home page.............");
		
	}
	
	@Test(priority = 5)
	public void displayProduct() throws InterruptedException {
		pp.productDisplayes();
		logger.info("Product displays.............");
	}

	@Test(priority = 6)
	public void comparision() throws InterruptedException {
		pp.sameProductAdded();
		logger.info("Confirmed that right product added.............");
	}
}
