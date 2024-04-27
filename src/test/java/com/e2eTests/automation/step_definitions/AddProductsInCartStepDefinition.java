package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_objects.AddProductsInCartPage;

import io.cucumber.java.en.*;

public class AddProductsInCartStepDefinition {
	
	public AddProductsInCartPage addProductsInCartPage = new AddProductsInCartPage();
	
	@When("User Hover over first product")
	public void userHoverOverFirstProduct() {
		
		addProductsInCartPage.hoverOverFirstPruduct();
	    
	}
	
	@When("User clicks Add to cart button")
	public void userClicksAddToCartButton() {
		
		addProductsInCartPage.clickOnBtnAddToCart();
	    
	}
	
	@When("User clicks on Continue Shopping button")
	public void userClicksOnContinueShoppingButton() {
		
		addProductsInCartPage.clickOnBtnContinueShopping();
	    
	}
	
	@When("User Hover over second product")
	public void userHoverOverSecondProduct() {
	    
	}
	
	@When("User clicks on View Cart button")
	public void userClicksOnViewCartButton() {
	    
	}
	
	@Then("User verify both products are added to Cart")
	public void userVerifyBothProductsAreAddedToCart() {
	    
	}
	
	@Then("User verify their prices, quantity and total price")
	public void userVerifyTheirPricesQuantityAndTotalPrice() {
	    
	}




}
