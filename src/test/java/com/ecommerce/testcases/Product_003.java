package com.ecommerce.testcases;

import org.testng.annotations.Test;

import com.ecommerce.pageObjects.ProductPage;

public class Product_003 extends BaseClass_001 {

	ProductPage pp = new ProductPage();

	@Test(priority = 1)
	public void productSearch() throws Exception {

		pp.searchProduct(productName);

	}

	@Test(priority = 2)
	public void productClick() throws Exception {

		pp.clickProduct();

	}

	@Test(priority = 3)
	public void productAddToCart() throws Exception {

		pp.addToCart();

	}
	@Test(priority = 4)
	public void homePage() throws InterruptedException {
		pp.backToHome();
		
	}
	
	@Test(priority = 5)
	public void displayProduct() throws InterruptedException {
		pp.productDisplayes();
	}

	@Test(priority = 6)
	public void comparision() throws InterruptedException {
		pp.sameProductAdded();
	}
}
