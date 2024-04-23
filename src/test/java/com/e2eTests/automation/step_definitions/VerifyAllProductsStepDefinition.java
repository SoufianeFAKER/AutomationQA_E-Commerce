package com.e2eTests.automation.step_definitions;

import org.junit.Assert;

import com.e2eTests.automation.page_objects.VerifyAllProductsPage;

import io.cucumber.java.en.*;

public class VerifyAllProductsStepDefinition {
	
	public VerifyAllProductsPage verifyAllProductsPage = new VerifyAllProductsPage();
	
	@When("User clicks on Products button")
	public void userClicksOnProductsButton() {
		
		verifyAllProductsPage.clickOnBtnProducts();
	    
	}
	
	@When("User verify that is navigated to all products {string} page successfully")
	public void userVerifyThatIsNavigatedToAllProductsPageSuccessfully(String productMessExpected) {
		
		String productMessActual = verifyAllProductsPage.getAllProductsMessage();
		Assert.assertEquals(productMessExpected, productMessActual);
	    
	}
	
	@When("User verify that the products list is visible")
	public void userVerifyThatTheProductsListIsVisible() {
		
		Assert.assertTrue(verifyAllProductsPage.getProductListState());
	    
	}
	
	@When("User clicks on View Product button of first product")
	public void userClicksOnViewProductButtonOfFirstProduct() {
		
		verifyAllProductsPage.clickOnBtnViewProduct();
	    
	}
	
	@Then("User is landed to product detail page")
	public void userIsLandedToProductDetailPage() {
		
		String productDetailsPageUrlAc = verifyAllProductsPage.getProductDetailPageURL();
		Assert.assertEquals("https://automationexercise.com/product_details/1", productDetailsPageUrlAc);
	    
	}
	
	@Then("User verify that the Product Name is visible")
	public void userVerifyThatTheProductNameIsVisible() {
		
		Assert.assertTrue(verifyAllProductsPage.getProductNameStatus());
	   
	}
	
	@Then("User verify that the Category is visible")
	public void userVerifyThatTheCategoryIsVisible() {
		
		Assert.assertTrue(verifyAllProductsPage.getCategoryStatus());
	    
	}
	
	@Then("User verify that the Price is visible")
	public void userVerifyThatThePriceIsVisible() {
		
		Assert.assertTrue(verifyAllProductsPage.getPriceStatus());
	    
	}
	
	@Then("User verify that the Availability is visible")
	public void userVerifyThatTheAvailabilityIsVisible() {
		
		Assert.assertTrue(verifyAllProductsPage.getAvailabilityStatus());
	    
	}
	
	@Then("User verify that the Condition is visible")
	public void userVerifyThatTheConditionIsVisible() {
		
		Assert.assertTrue(verifyAllProductsPage.getConditionStatus());
	    
	}
	
	@Then("User verify that the Brand is visible")
	public void userVerifyThatTheBrandIsVisible() {
		
		Assert.assertTrue(verifyAllProductsPage.getBrandStatus());
	    
	}







}
