package com.e2eTests.automation.step_definitions;

import org.junit.Assert;

import com.e2eTests.automation.page_objects.SubscriptionHomePage;

import io.cucumber.java.en.*;

public class SubscriptionHomeStepDefinition {
	
	public SubscriptionHomePage subscriptionHomePage = new SubscriptionHomePage();
	
	@Given("User Scroll down to footer")
	public void userScrollDownToFooter() {
		
		subscriptionHomePage.scrollToTheFooterSection();
	    
	}
	
	@Given("User verify text {string} is visible")
	public void userVerifyTextIsVisible(String SubScriptionMesExpected) {
		
		String SubScriptionMesActual = subscriptionHomePage.getSubScriptionMessage();
		Assert.assertEquals(SubScriptionMesExpected, SubScriptionMesActual);
	    
	}
	
	@Given("User enters email address {string} in input feiel")
	public void userEntersEmailAddressInInputFeiel(String email) {
		
		subscriptionHomePage.enterEmailAddress(email);
	   
	}
	
	@Given("User clicks on arrow button")
	public void userClicksOnArrowButton() {
		
		subscriptionHomePage.clickOnBtnSubmit();
	    
	}
	
	@Then("User verify success message {string} is visible")
	public void userVerifySuccessMessageIsVisible(String successMesExpected) {
		
		String successMesActaul = subscriptionHomePage.getSuccessSubMessage();
		Assert.assertEquals(successMesExpected, successMesActaul);
	    
	}

}
