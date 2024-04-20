package com.e2eTests.automation.step_definitions;

import org.testng.Assert;

import com.e2eTests.automation.page_objects.LoginPage;

import io.cucumber.java.en.Then;

public class LonginInvalidCredentials {
	
	LoginPage loginPage = new LoginPage();

	@Then("User verify error message {string} is visible")
	public void userVerifyErrorMessageIsVisible(String warningMessageExpected) {
	    
		String warningMessageActual = loginPage.getloginWarningMessage();
		Assert.assertEquals(warningMessageActual, warningMessageExpected);
		
	}
	
}
