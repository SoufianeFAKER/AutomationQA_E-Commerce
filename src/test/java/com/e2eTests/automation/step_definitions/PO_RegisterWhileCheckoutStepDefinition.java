package com.e2eTests.automation.step_definitions;

import java.util.Map;
import org.junit.Assert;
import com.e2eTests.automation.page_objects.PO_RegisterWhileCheckoutPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class PO_RegisterWhileCheckoutStepDefinition {
	
	public PO_RegisterWhileCheckoutPage pO_RegisterWhileCheckoutPage = new PO_RegisterWhileCheckoutPage();
	
	
	@When("User verify that cart page is displayed")
	public void userVerifyThatCartPageIsDisplayed() {
		
		String urlActual = pO_RegisterWhileCheckoutPage.getCurrentUrlCartPage();
		Assert.assertEquals("https://automationexercise.com/view_cart", urlActual);
	    
	}
	
	@When("User clicks on Proceed To Checkout button")
	public void userClicksOnProceedToCheckoutButton() {
		
		pO_RegisterWhileCheckoutPage.clickOnBtnProceedToCheckOut();
	  
	}
	
	@When("User clicks on Register Login button")
	public void userClicksOnRegisterLoginButton() {
		
		pO_RegisterWhileCheckoutPage.clickOnBtnRegisterLogin();
	    
	}
	
	@When("User verify messages {string} and {string}")
	public void userVerifyMessagesAnd(String addressMesExpected, String ReviewMesExpected) {
		
		String addressMesActual = pO_RegisterWhileCheckoutPage.getAddressDetailsMessage();
		Assert.assertEquals(addressMesExpected, addressMesActual);
		
		String ReviewMesActual = pO_RegisterWhileCheckoutPage.getReviewYourOrderMessage();
		Assert.assertEquals(ReviewMesExpected, ReviewMesActual);
	    
	}
	
	@When("User enters description in comment text area {string}")
	public void userEntersDescriptionInCommentTextArea(String description) {
		
		pO_RegisterWhileCheckoutPage.enterMessageInTextField(description);
	    
	}
	
	@When("User clicks on Place Order button")
	public void userClicksOnPlaceOrderButton() {
		
		pO_RegisterWhileCheckoutPage.clickOnBtnPlaceOrder();
	    
	}
	
	@When("User enters payment details below")
	public void userEntersPaymentDetailsBelow(DataTable dataTable) {
		
		Map<String, String> dataMap = dataTable.asMap(String.class, String.class);
		
		pO_RegisterWhileCheckoutPage.enterNameOnCard(dataMap.get("NameOnCard"));
		pO_RegisterWhileCheckoutPage.enterCardNumber(dataMap.get("CardNumber"));
		pO_RegisterWhileCheckoutPage.enterCvc(dataMap.get("CVC"));
		pO_RegisterWhileCheckoutPage.enterExpirationMonth(dataMap.get("ExpirationMonth"));
		pO_RegisterWhileCheckoutPage.enterExpirationYear(dataMap.get("ExpirationYear"));
	    
	}
	
	@When("User clicks on Pay and Confirm Order button")
	public void userClicksOnPayAndConfirmOrderButton() {
		
		pO_RegisterWhileCheckoutPage.clickOnBtnPayAndConfirmOrder();
	    
	}


	@When("User verify success message {string} is displayed")
	public void userVerifySuccessMessageIsDisplayed(String successMesExpected) {
	
		String successMesActual = pO_RegisterWhileCheckoutPage.getSuccessMessage();
		Assert.assertEquals(successMesExpected, successMesActual);
	   
	}

	


}
