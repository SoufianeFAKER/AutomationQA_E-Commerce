package com.e2eTests.automation.step_definitions;

import java.util.Map;

import org.junit.Assert;

import com.e2eTests.automation.page_objects.AddReviewPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class AddReviewStepDefinition {
	
	public AddReviewPage addReviewPage = new AddReviewPage();

	@When("User verify that message {string} is visible")
	public void userVerifyThatMessageIsVisible(String textExpected) {
		
		String textActual = addReviewPage.getReviewText();
		Assert.assertEquals(textExpected, textActual);
	    
	}
	
	@When("User fills the fields below")
	public void userFillsTheFieldsBelow(DataTable dataTable) {
	   
		Map<String, String> dataMap = dataTable.asMap(String.class, String.class);
		
		addReviewPage.enterName(dataMap.get("name"));
		addReviewPage.enterEmail(dataMap.get("email"));
		addReviewPage.enterReviewMessage(dataMap.get("review"));
	    
	}
	
	@When("User clicks on submit button")
	public void userClicksOnSubmitButton() {
		
		addReviewPage.clikOnBtnSubmit();
	    
	}
	
	@Then("User verify success message {string}")
	public void userVerifySuccessMessage(String successMesExpected) {
		
		String successMesActual = addReviewPage.getsuccessMessage();
		Assert.assertEquals(successMesExpected, successMesActual);
	    
	}




}
