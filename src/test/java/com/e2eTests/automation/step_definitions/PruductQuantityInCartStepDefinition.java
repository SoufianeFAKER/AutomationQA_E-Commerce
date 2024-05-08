package com.e2eTests.automation.step_definitions;

import org.junit.Assert;

import com.e2eTests.automation.page_objects.PruductQuantityInCartPage;

import io.cucumber.java.en.*;

public class PruductQuantityInCartStepDefinition {

	PruductQuantityInCartPage pruductQuantityInCartPage = new PruductQuantityInCartPage();

	@When("User clicks On View Product button for any product")
	public void userClicksOnViewProductButtonForAnyProduct() {

		pruductQuantityInCartPage.clickOnBtnViewProduct();

	}

	@When("User verify product detail is opened")
	public void userVerifyProductDetailIsOpened() {

		String pageTitleActual = pruductQuantityInCartPage.getPageTitle();
		Assert.assertEquals("Automation Exercise - Product Details", pageTitleActual);

	}

	@When("User increase quantity to {int}")
	public void userIncreaseQuantityTo(Integer quantity) {

		String quantityToString = String.valueOf(quantity);
		pruductQuantityInCartPage.fillFieldQuantity(quantityToString);

	}

	@When("User clicks On Add to cart button")
	public void userClicksOnAddToCartButton() {

		pruductQuantityInCartPage.clickOnAddToCartButton();

	}

	@When("User clicks On View Cart button")
	public void userClicksOnViewCartButton() {

		pruductQuantityInCartPage.clickOnViewCartButton();

	}

	@Then("User verify that product is displayed in cart page with exact quantity {int}")
	public void userVerifyThatProductIsDisplayedInCartPageWithExactQuantity(Integer quantityExpected) {
		
		String quantityActual = pruductQuantityInCartPage.getQuantityOfProduct();
		String quantityExpectedToString = String.valueOf(quantityExpected);
		
		Assert.assertEquals(quantityExpectedToString, quantityActual);

	}

}
