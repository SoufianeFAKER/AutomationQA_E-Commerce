package com.e2eTests.automation.step_definitions;

import org.junit.Assert;

import com.e2eTests.automation.page_objects.DownloadInvoicePage;

import io.cucumber.java.en.When;

public class DownloadInvoiceStepDefinition {
	
	public DownloadInvoicePage downloadInvoicePage = new DownloadInvoicePage();
	
	@When("User clicks on Download Invoice button")
	public void userClicksOnDownloadInvoiceButton() {
		
		downloadInvoicePage.clickOnBtnDownloadInvoice();
	   
	}
	
	@When("User verify invoice is downloaded successfully")
	public void userVerifyInvoiceIsDownloadedSuccessfully() {
		
		boolean status = downloadInvoicePage.checkDownloadingFile();
	    Assert.assertTrue(status);
	    
	}




}
