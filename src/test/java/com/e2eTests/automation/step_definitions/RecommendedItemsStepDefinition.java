package com.e2eTests.automation.step_definitions;

import org.junit.Assert;

import com.e2eTests.automation.page_objects.RecommendedItemsPage;

import io.cucumber.java.en.*;

public class RecommendedItemsStepDefinition {

	public RecommendedItemsPage recommendedItemsPage = new RecommendedItemsPage();

	@When("User scroll to bottom of page")
	public void userScrollToBottomOfPage() {

		recommendedItemsPage.scrollToBottomOfPage();

	}

	@When("User verify the following message {string} are visible")
	public void userVerifyTheFollowingMessageAreVisible(String messExpected) {

		String messActual = recommendedItemsPage.getRecommendedItemsTitle();
		Assert.assertEquals(messExpected, messActual);

	}

	@When("User clicks on Add To Cart button on Recommended product")
	public void userClicksOnAddToCartButtonOnRecommendedProduct() {

		recommendedItemsPage.clickOnAddToCartButton();

	}

	@Then("User verify that product is displayed in cart page")
	public void userVerifyThatProductIsDisplayedInCartPage() {

		Assert.assertTrue(recommendedItemsPage.presenceOfProductInCart());
	}

}
