package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_objects.SubscriptionCartPage;

import io.cucumber.java.en.Given;

public class SubscriptionCartStepDefinition {
	
	public SubscriptionCartPage subscriptionCartPage = new SubscriptionCartPage();
	
	@Given("User clicks on Cart button")
	public void userClicksOnCartButton() {
		
		subscriptionCartPage.clickOnBtnCart();
	    
	}



	
	
}
