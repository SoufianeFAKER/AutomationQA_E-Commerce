package com.e2eTests.automation.step_definitions;

import org.openqa.selenium.JavascriptExecutor;

import com.e2eTests.automation.utils.Setup;

import io.cucumber.java.en.When;

public class ScrollUpWithoutArrowStepDefinition {

	@When("User scroll up page to top")
	public void userScrollUpPageToTop() {
	    
		JavascriptExecutor js = (JavascriptExecutor) Setup.getDriver();
		js.executeScript("window.scrollTo(0, 0)");
		
	}




}
