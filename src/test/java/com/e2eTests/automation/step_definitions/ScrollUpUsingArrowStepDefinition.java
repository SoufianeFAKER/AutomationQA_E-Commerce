package com.e2eTests.automation.step_definitions;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import com.e2eTests.automation.page_objects.ScrollUpUsingArrowPage;
import com.e2eTests.automation.utils.Setup;

import io.cucumber.java.en.*;

public class ScrollUpUsingArrowStepDefinition {
	
	public ScrollUpUsingArrowPage scrollUpUsingArrowPage = new ScrollUpUsingArrowPage();
	public JavascriptExecutor js = (JavascriptExecutor) Setup.getDriver();

	@When("User scroll down page to bottom")
	public void userScrollDownPageToBottom() {
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    
	}
	
	@When("User clicks on arrow at bottom right side to move upward")
	public void userClicksOnArrowAtBottomRightSideToMoveUpward() {
		
		scrollUpUsingArrowPage.clickOnBtnScrollUp();
	    
	}
	
	@Then("User verify that page is scrolled up")
	public void userVerifyThatPageIsScrolledUp() {
		
		Assert.assertTrue(scrollUpUsingArrowPage.logoWebSiteIsVisible());
	    
	}
	
	@Then("User verify that {string} text is visible on screen")
	public void userVerifyThatTextIsVisibleOnScreen(String textExpected) {
		
		String textActual = scrollUpUsingArrowPage.carouselTextIsVisible();
		Assert.assertEquals(textExpected, textActual);
	    
	}




}
