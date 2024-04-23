package com.e2eTests.automation.step_definitions;

import org.junit.Assert;

import com.e2eTests.automation.page_objects.LoginPage;

import io.cucumber.java.en.Then;

public class RegisterWithExistingEmailStepDefinition {
	
	public LoginPage loginPage = new LoginPage();
	
	@Then("User verify register error message {string} is visible")
	public void userVerifyRegisterErrorMessageIsVisible(String warningMessageExpected) {
		
		String warninMessageActual = loginPage.getRegisterWarningMessage();
		Assert.assertEquals(warningMessageExpected, warninMessageActual);
	    
	}




}
