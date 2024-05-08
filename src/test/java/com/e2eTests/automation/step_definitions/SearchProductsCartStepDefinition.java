package com.e2eTests.automation.step_definitions;

import org.junit.Assert;

import com.e2eTests.automation.page_objects.SearchProductsCartPage;

import io.cucumber.java.en.When;

public class SearchProductsCartStepDefinition {
	
	public SearchProductsCartPage searchProductsPage = new SearchProductsCartPage();
	
	@When("User Add those products to Cart")
	public void userAddThoseProductsToCart() {
		
		searchProductsPage.addAllProductsToCart();
	    
	}
	
	@When("User verify that products are visible in Cart")
	public void userVerifyThatProductsAreVisibleInCart() {
		
		Assert.assertTrue(searchProductsPage.presenceOfProductsInCart());
	    
	}





}
