package com.e2eTests.automation.step_definitions;

import org.junit.Assert;

import com.e2eTests.automation.page_objects.ViewCategoryProductPage;

import io.cucumber.java.en.*;


public class ViewCategoryProductStepDefinition {
	
	public ViewCategoryProductPage viewCategoryProductPage = new ViewCategoryProductPage();
	
	@When("User verify that categories {string} are visible on left side bar")
	public void userVerifyThatCategoriesAreVisibleOnLeftSideBar(String categoryPanelExpected) {
		
		String categoryPanelActual = viewCategoryProductPage.getCategoryPanel();
		Assert.assertEquals(categoryPanelExpected, categoryPanelActual);
	    
	}
	
	@When("User clicks on Women category button")
	public void userClicksOnWomenCategoryButton() {
		
		viewCategoryProductPage.clickOnCategoryWomen();
	    
	}
	
	@When("User clicks on sub Category link TOPS")
	public void userClicksOnSubCategoryLinkTOPS() {
		
		viewCategoryProductPage.clickOnSubCategoryTops();
	    
	}
	
	@When("User verify that category page is displayed")
	public void userVerifyThatCategoryPageIsDisplayed() {
		
		String urlActual = viewCategoryProductPage.getCurrentUrl();
		Assert.assertTrue(urlActual.contains("category_products"));
	    
	}
	@Then("User confirm that text {string}")
	public void userConfirmThatText(String titleExpected) {
		
		String titleActual = viewCategoryProductPage.getCategoryTitle();
		Assert.assertEquals(titleExpected, titleActual);
	    
	}
	
	@And("User clicks on Men category button")
	public void userClicksOnMenCategoryButton() {
		
		viewCategoryProductPage.clickOnCategoryMen();
	    
	}
	
	@When("User clicks on sub Category link JEANS")
	public void userClicksOnSubCategoryLinkJEANS() {
		
		viewCategoryProductPage.clickOnSubCategoryJeans();
	    
	}




}
