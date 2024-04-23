package com.e2eTests.automation.step_definitions;

import java.util.Map;

import org.junit.Assert;

import com.e2eTests.automation.page_objects.ContactUsFormPage;
import com.e2eTests.automation.page_objects.HomePage;
import com.e2eTests.automation.utils.Setup;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class ContactUsFormStepDefinition {
	
	public HomePage homePage = new HomePage();
	public ContactUsFormPage contactUsFormPage = new ContactUsFormPage();

	@When("User clicks on Contact Us button")
	public void userClicksOnContactUsButton() {
		
		homePage.clickOnBtnContactUs();
	    
	}
	
	@When("User verify that Get In Touch {string} message is visible")
	public void userVerifyThatGetInTouchMessageIsVisible(String getInTouchMessExpected) {
		
		String getInTouchMessActual = contactUsFormPage.getMessageGetTouch();
		Assert.assertEquals(getInTouchMessExpected, getInTouchMessActual);
	   
	}
	
	@When("User enters the details into Contact Us Form fields")
	public void userEntersTheDetailsIntoContactUsFormFields(DataTable dataTable) {
		
		Map<String, String> dataMap = dataTable.asMap(String.class, String.class);
		
		contactUsFormPage.enterContactName(dataMap.get("name"));
		contactUsFormPage.enterContactEmail(dataMap.get("email"));
		contactUsFormPage.enterContactSubject(dataMap.get("subject"));
		contactUsFormPage.enterContactMessage(dataMap.get("message"));
	   
	}
	
	@When("User Upload file")
	public void userUploadFile() {
		
		contactUsFormPage.uploadContactFile();
	    
	}
	
	@When("User clicks on Submit button")
	public void userClicksOnSubmitButton() {
		
		contactUsFormPage.clickOnBtnContactSubmit();
	    
	}
	
	@When("User click on OK button")
	public void userClickOnOKButton() {
		
		Setup.getDriver().switchTo().alert().accept();
	    
	}
	
	@Then("User verify that sucess message {string} is visible")
	public void userVerifyThatSucessMessageIsVisible(String successMesExpected) {
		
		String successMesActual = contactUsFormPage.getSuccessMessage();
		Assert.assertEquals(successMesExpected, successMesActual);
	    
	}
	
	@Then("User clicks on Home button")
	public void userClicksOnHomeButton() {
		
		contactUsFormPage.clickOnBtnContactHome();
	    
	}
	
	




}
