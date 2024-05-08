package com.e2eTests.automation.step_definitions;

import org.junit.Assert;

import com.e2eTests.automation.page_objects.AddProductsInCartPage;


import io.cucumber.java.en.*;

public class AddProductsInCartStepDefinition {
	
	public AddProductsInCartPage addProductsInCartPage = new AddProductsInCartPage();
	
	@When("User Hover over first product")
	public void userHoverOverFirstProduct() {
		
		addProductsInCartPage.hoverOverFirstPruduct();
	    
	}
	
	@When("User clicks Add to cart button in Box1")
	public void userClicksAddToCartButtonInBox1() {
		
		addProductsInCartPage.clickOnBtnAddToCartInBox1();
	    
	}
	
	@When("User clicks on Continue Shopping button")
	public void userClicksOnContinueShoppingButton() {
		
		addProductsInCartPage.clickOnBtnContinueShopping();
	    
	}
	
	@When("User Hover over second product")
	public void userHoverOverSecondProduct() {
		
		addProductsInCartPage.hoverOverSecondPruduct();
	    
	}
	
	@When("User clicks Add to cart button in Box2")
	public void userClicksAddToCartButtonInBox2() {
		
		addProductsInCartPage.clickOnBtnAddToCartInBox2();
	
	}

	@When("User clicks on View Cart button")
	public void userClicksOnViewCartButton() {
		
		addProductsInCartPage.clickOnBtnViewCart();
	    
	}
	
	@Then("User verify both products are added to Cart")
	public void userVerifyBothProductsAreAddedToCart() {
		
		int nbrActual = addProductsInCartPage.verifyNbreOfProducts();
		Assert.assertEquals(2, nbrActual);
	    
	}
	
	@Then("User verify their prices, quantity and total price")
	public void userVerifyTheirPricesQuantityAndTotalPrice() {
		
		Boolean resultActual = addProductsInCartPage.verifyPriceQuantityTotal();
	    Assert.assertTrue(resultActual);

	}




}
