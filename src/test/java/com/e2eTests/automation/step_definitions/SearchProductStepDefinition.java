package com.e2eTests.automation.step_definitions;

import org.junit.Assert;

import com.e2eTests.automation.page_objects.SearchProductPage;

import io.cucumber.java.en.*;

public class SearchProductStepDefinition {
	
	public SearchProductPage searchProductPage = new SearchProductPage();

	@When("User enter product name {string} in search input")
	public void userEnterProductNameInSearchInput(String serchProductText) {
		
		searchProductPage.enterTextInFieldSearchProduct(serchProductText);
	   
	}
	
	@When("User clicks on search button")
	public void userClicksOnSearchButton() {
		
		searchProductPage.clickOnBtnSearchProduct();
	   
	}
	
	@When("User verify that search product {string} message is visible")
	public void userVerifyThatSearchProductMessageIsVisible(String searchProductMesExpected) {
		
		String searchProductMesActual = searchProductPage.getSearchedProductsMessage();
		Assert.assertEquals(searchProductMesExpected, searchProductMesActual);
	    
	}
	
	@Then("User Verify all the products related to search {string} are visible")
	public void userVerifyAllTheProductsRelatedToSearchAreVisible(String string) {
		
		searchProductPage.getElementsOfParent();
	    
	}




}
