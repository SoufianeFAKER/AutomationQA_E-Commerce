package com.e2eTests.automation.step_definitions;

import org.junit.Assert;

import com.e2eTests.automation.page_objects.VerifyTCPagePage;

import io.cucumber.java.en.*;

public class VerifyTCPageStepDefinition {
	
	public VerifyTCPagePage verifyTCPagePage = new VerifyTCPagePage();
	
	
	@When("User clicks on Test Cases button")
	public void userClicksOnTestCasesButton() {
		
		verifyTCPagePage.clickOnBtnTestCases();
	    
	}
	
	@Then("User verify that Test Cases {string} text is visible")
	public void userVerifyThatTestCasesTextIsVisible(String messageExpected) {
		
		String messageActual = verifyTCPagePage.getTestCasesMessage();
		Assert.assertEquals(messageExpected, messageActual);
	    
	}




}
