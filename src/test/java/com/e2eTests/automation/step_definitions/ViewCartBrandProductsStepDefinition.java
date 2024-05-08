package com.e2eTests.automation.step_definitions;

import org.junit.Assert;

import com.e2eTests.automation.page_objects.ViewCartBrandProductsPage;

import io.cucumber.java.en.*;

public class ViewCartBrandProductsStepDefinition {
	
	public ViewCartBrandProductsPage viewCartBrandProductsPage = new ViewCartBrandProductsPage();
	
	
	@When("User verify that Brands {string} are visible on left side bar")
	public void userVerifyThatBrandsAreVisibleOnLeftSideBar(String brandsExpected) {
		
		String brandsActual = viewCartBrandProductsPage.getbrandsPanelTitle();
		Assert.assertEquals(brandsExpected, brandsActual);
	   
	}
	
	@When("User clicks on POLO Brand name")
	public void userClicksOnPOLOBrandName() {
		
		viewCartBrandProductsPage.clickOnBtnPolo();
	    
	}
	
	@When("User verify that user is navigated to brand page {string}")
	public void userVerifyThatUserIsNavigatedToBrandPage(String titleExpected) {
		
		String titleActual = viewCartBrandProductsPage.getCurrentURL();
		Assert.assertEquals(titleExpected, titleActual);
	    
	}
	
	@When("User verify that brand products are displayed")
	public void userVerifyThatBrandProductsAreDisplayed() {
		
		boolean existProducts = viewCartBrandProductsPage.verifyProductsIsDisplayed();
	    Assert.assertTrue(existProducts);
	    
	}
	
	@When("User clicks on BIBA Brand name")
	public void userClicksOnBIBABrandName() {
		
		viewCartBrandProductsPage.clickOnBtnBiba();
	    
	}




}
