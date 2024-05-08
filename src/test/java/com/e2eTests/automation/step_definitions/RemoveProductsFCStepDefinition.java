package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_objects.RemoveProductsFCPage;

import io.cucumber.java.en.Then;

public class RemoveProductsFCStepDefinition {
	
	public RemoveProductsFCPage removeProductsFCPage = new RemoveProductsFCPage();
	
	@Then("User clicks X button corresponding to particular product")
	public void userClicksXButtonCorrespondingToParticularProduct() {
		
		removeProductsFCPage.clickOnBtnX();
	    
	}
	
	@Then("User verify that product is removed from the cart {string}")
	public void userVerifyThatProductIsRemovedFromTheCart(String cartEmptyMesExpected) {
		
		removeProductsFCPage.getCartEmptyMessage();
	    
	}




}
